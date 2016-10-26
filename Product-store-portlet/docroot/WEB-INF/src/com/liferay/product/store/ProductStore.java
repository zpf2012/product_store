package com.liferay.product.store;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.product.store.model.Apply;
import com.liferay.product.store.model.Product;
import com.liferay.product.store.service.ApplyLocalServiceUtil;
import com.liferay.product.store.service.AssessLocalServiceUtil;
import com.liferay.product.store.service.ProductLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class ProductStore
 */
public class ProductStore extends MVCPortlet {	
	/*
	 * 申请使用产品
	 */
	public void applyProduct(ActionRequest request, ActionResponse response) throws IOException{
		
		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(Apply.class.getName(),request);
			long productId = ParamUtil.getLong(request, "productId");
			String projectName = ParamUtil.getString(request, "projectName");
			String integrationObject = ParamUtil.getString(request, "integrationObject");
			
			String useType = ParamUtil.getString(request, "useType");
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
			
			Date useDate = ParamUtil.getDate(request, "useDate", dateFormat);
			ApplyLocalServiceUtil.addApply(serviceContext.getUserId(), projectName, integrationObject, useType, productId, useDate, serviceContext);
//			try {
//				sendEmail();
//			} catch (AddressException e) {
//				e.printStackTrace();
//			} catch (MailEngineException e) {
//				e.printStackTrace();
//			}
			SessionMessages.add(request, "ApplyAdded");
		} catch (PortalException | SystemException e1) {
			SessionErrors.add(request, e1.getClass().getName());
			response.setRenderParameter("mvcPath", "/html/productstore/apply_product.jsp");
		}
	}
	/*
	 * 评价产品
	 */
	public void assessProduct(ActionRequest request, ActionResponse response) throws IOException{
		ServiceContext serviceContext;
		try {
			serviceContext = ServiceContextFactory.getInstance(Apply.class.getName(),request);
			long productId = ParamUtil.getLong(request, "productId");
			long applyId = ParamUtil.getLong(request, "applyId");
			double multiPercent = ParamUtil.getDouble(request, "multiPercent");
			double multipleAssess = ParamUtil.getDouble(request, "multipleAssess");System.out.println(multipleAssess);
			int configurable = ParamUtil.getInteger(request, "configurable");
			int stability = ParamUtil.getInteger(request, "stability");
			int integrationGrade = ParamUtil.getInteger(request, "integrationGrade");
			String approveFlag = "assessed";
			String projectName = ParamUtil.getString(request, "projectName");
			ApplyLocalServiceUtil.updateApply(serviceContext.getUserId(), applyId, serviceContext, approveFlag);
			AssessLocalServiceUtil.addAssess(serviceContext.getUserId(), applyId, projectName, productId, multipleAssess, multiPercent, configurable, stability, integrationGrade, serviceContext);
			SessionMessages.add(request, "AssessSussess");
		} catch (PortalException | SystemException e) {
			SessionErrors.add(request, e.getClass().getName());
			response.setRenderParameter("mvcPath", "/html/productstore/apply_assess.jsp");
		}
		
	}
	
	/*
	 * 查询产品
	 */
	public List<Product> queryProduct(ActionRequest request, ActionResponse response) throws IOException, PortalException, SystemException{
		String productDesc = request.getParameter("productDescQuery");
		List<Product> allProducts = ProductLocalServiceUtil.getProducts();
		List<Product> products = new ArrayList<>();
		for(Product product: allProducts){
			if(product.getProductDesc() == productDesc){
				products.add(product);
			}
		}
		return products;
	}
	
	/*
	 * 新增产品
	 */
	public void addProduct(ActionRequest request, ActionResponse response) throws IOException, PortalException, SystemException{
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Product.class.getName(), request);
		
		String productName = request.getParameter("productName");
		String productDesc = request.getParameter("productDesc");
		String videoLink = request.getParameter("videoLink");
		String wikiLink = request.getParameter("wikiLink");
		String productLink = request.getParameter("productLink");
		
		try {
			ProductLocalServiceUtil.addProduct(serviceContext.getUserId(), productName, productDesc, videoLink, wikiLink, productLink, serviceContext);
			SessionMessages.add(request, "productAdded");
		} catch (PortalException | SystemException e) {
			SessionErrors.add(request, e.getClass().getName());
			response.setRenderParameter("mvcPath", "/html/productstore/product_total.jsp");
		}
	}
	/*
	 * 产品删除
	 */
	public void deleteProduct(ActionRequest request, ActionResponse response) throws IOException{
		long productId = ParamUtil.getLong(request, "productId");
		try {
			ProductLocalServiceUtil.deleteProduct(productId);
			SessionMessages.add(request, "productDeleted");
		} catch (PortalException | SystemException e) {
			SessionErrors.add(request, e.getClass().getName());
			response.setRenderParameter("mvcPath", "/html/productstore/product_total.jsp");
		}
	}
	
	/*
	 * 产品更新
	 */
	public void updateProduct(ActionRequest request, ActionResponse response) throws IOException, PortalException, SystemException{
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Product.class.getName(), request);
		
		long productId = ParamUtil.getLong(request, "productId");
		String productName = ParamUtil.getString(request, "productName");
		String productDesc = ParamUtil.getString(request, "productDesc");
		String videoLink = ParamUtil.getString(request, "videoLink");
		String wikiLink = ParamUtil.getString(request, "wikiLink");
		String productLink = ParamUtil.getString(request, "productLink");
		
		try {
			ProductLocalServiceUtil.updateProduct(serviceContext.getUserId(), productId, productName, productDesc, videoLink, wikiLink, productLink, serviceContext);
			SessionMessages.add(request, "productUpdated");
		} catch (SystemException | PortalException e) {
			SessionErrors.add(request, e.getClass().getName());
			response.setRenderParameter("mvcPath", "/html/productstore/product_total.jsp");
		} 
		
	}
	/*
	 * 审批申请
	 */
	public void approveApply(ActionRequest request, ActionResponse response) {
		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(Product.class.getName(), request);
			String approveFlag = ParamUtil.getString(request, "approveFlag");
			long applyId = ParamUtil.getLong(request, "applyId");
			ApplyLocalServiceUtil.updateApply(serviceContext.getUserId(), applyId, serviceContext, approveFlag);
			response.setRenderParameter("mvcPath", "/html/productstore/apply_total.jsp");
			SessionMessages.add(request, "ApplyDeal");
		} catch (PortalException | SystemException e) {
			SessionErrors.add(request, e.getClass().getName());
			response.setRenderParameter("mvcPath", "/html/productstore/apply_total.jsp");
		}
	}
	
//	public static void sendEmail () throws AddressException, SystemException, MailEngineException{
//		SendMail cn = new SendMail();
//	    // 设置发件人地址、收件人地址和邮件标题
//	    cn.setAddress("m15701610661@163.com", "80818647@qq.com", "一个带附件的JavaMail邮件");
//	    // 设置要发送附件的位置和标题
//	    cn.setAffix("f:/123.txt", "123.txt");
//	    
//	    /**
//	     * 设置smtp服务器以及邮箱的帐号和密码
//	     * 用QQ 邮箱作为发生者不好使 （原因不明）
//	     * 163 邮箱可以，但是必须开启  POP3/SMTP服务 和 IMAP/SMTP服务
//	     * 因为程序属于第三方登录，所有登录密码必须使用163的授权码
//	     */
//	    cn.send("smtp.163.com", "m15701610661@163.com", "gebilaowang123");
//	}
	
	
	@Override
	public void render(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		
		long productId = ParamUtil.getLong(request, "productId");
		
		request.setAttribute("productId", productId);
		
		super.render(request, response);
	}
}
