<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="com.liferay.product.store.service.ApplyLocalServiceUtil"%>
<%@page import="com.liferay.product.store.model.Apply"%>

<%@page import="java.util.Iterator"%>
<%@page import="com.liferay.product.store.service.ProductLocalServiceUtil"%>
<%@page import="com.liferay.product.store.model.Product"%>
<%@page import="java.util.List"%>
<%@page import="java.text.DateFormat"%>
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
<table border="1" style="text-align: center;width:98%;">
	<tr bordercolor="#ffffff" style="height: 15px;">
		<td colspan="7"><h3>中台产品使用评价</h3></td>
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
		for(Apply apply: applies){
			if(apply.getUserId() == userId && apply.getApproveFlag().equals("通过")){
	%>
	<portlet:renderURL var="assessURL">
		<portlet:param name="mvcPath" value="/html/productstore/assess_product.jsp"/>
		<portlet:param name="applyId" value="<%= String.valueOf(apply.getApplyId())%>"/>
	</portlet:renderURL>
	<tr>
		<td><%=apply.getProjectName()%></td>
		
			<%
				List<Product> products = ProductLocalServiceUtil.getProducts(scopeGroupId);
				for(Product product: products){
					if(product.getProductId() == apply.getProductId()){
						%>
						<td><%=product.getProductName() %></td>
						<% 
					}
				}
			%>
		
		<td><%=apply.getIntegrationObject() %></td>
		<td><%=apply.getUseType() %></td>
		<td><%=DateFormat.getDateInstance().format(apply.getUseDate()) %></td>
		<td><aui:button name="assess" value="评价" onClick="<%=assessURL %>"></aui:button></td>
	</tr>
	<%
			}
		}
	%>
</table>
<aui:button-row>
	<aui:button value="返回" onClick="<%=viewURL %>"></aui:button>
</aui:button-row>
