<%@page import="java.text.DateFormat"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="com.liferay.product.store.service.ApplyLocalServiceUtil"%>
<%@page import="com.liferay.product.store.model.Apply"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.liferay.product.store.service.ProductLocalServiceUtil"%>
<%@page import="com.liferay.product.store.model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/html/productstore/init.jsp"%>

<portlet:defineObjects />
<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/html/productstore/product_total.jsp"/>
</portlet:renderURL>

<%
	ServiceContext serviceContext = ServiceContextFactory.getInstance(request);
	long userId = serviceContext.getUserId();
%>
<table border="1" width="98%" style="text-align: center">
	<tr bordercolor="#ffffff" style="height: 15px;">
		<td colspan="7"><h3>中台产品申请汇总</h3></td>
	</tr>
	<tr>
		<td>项目名称</td>
		<td>申请产品</td>
		<td>集成对象</td>
		<td>使用方式</td>
		<td>使用时间</td>
		<td colspan="2">操作</td>
		
	</tr>
	<%
		List<Apply> applies = ApplyLocalServiceUtil.getApplies();
		List<Product> products = ProductLocalServiceUtil.getProducts(scopeGroupId);
		for(Apply apply: applies){
			if(apply.getApproveFlag().equals("待审核")){
				for(Product product: products){
					if(product.getUserId() == userId){
					if(product.getProductId() == apply.getProductId()){
			
	%>
	<portlet:actionURL var="approveApplyURL" name="approveApply">
		<portlet:param name="approveFlag" value="approve"/>
		<portlet:param name="applyId" value="<%= String.valueOf(apply.getApplyId())%>"/>
	</portlet:actionURL>
	<portlet:actionURL var="refuseApplyURL" name="approveApply">
		<portlet:param name="approveFlag" value="refuse"/>
		<portlet:param name="applyId" value="<%= String.valueOf(apply.getApplyId())%>"/>
	</portlet:actionURL>
	<tr>
		<td><%=apply.getProjectName()%></td>
		<td><%=product.getProductName() %></td>
		<td><%=apply.getIntegrationObject() %></td>
		<td><%=apply.getUseType() %></td>
		<td><%= DateFormat.getDateInstance().format(apply.getUseDate()) %></td>
		<td><aui:button name="approve" value="同意" onClick="<%=approveApplyURL %>"></aui:button></td>
		<td><aui:button name="refuse" value="拒绝" onClick="<%=refuseApplyURL %>"></aui:button></td>
	</tr>
	<%				}
					}
				}
			}
		}
	%>
</table>
<aui:button-row>
	<aui:button value="返回" onClick="<%=viewURL %>"></aui:button>
</aui:button-row>
