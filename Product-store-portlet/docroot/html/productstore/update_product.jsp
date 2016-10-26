<%@page import="com.liferay.product.store.service.ProductLocalServiceUtil"%>
<%@page import="com.liferay.product.store.model.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/html/productstore/init.jsp"%>
<style>
	table tr:nth-child(odd){background:#F4F4F4;}
	table td:nth-child(even){color:#C00;}
</style>
<portlet:defineObjects />
<portlet:actionURL var="updateProductURL" name="updateProduct"></portlet:actionURL>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/html/productstore/product_total.jsp" />
</portlet:renderURL>
<%
	long productId = ParamUtil.getLong(renderRequest, "productId");
	Product product = ProductLocalServiceUtil.getProduct(productId);
%>
<aui:form action="<%=updateProductURL%>">
	<aui:fieldset>
	<table border="1" width="60%" style="text-align: center" id="test">
		<tr>
			<td colspan="2" width="38%"><h4>产品更新</h4></td>
		</tr>
		<tr>
			<th>产品名称</th>
			<td><aui:input style="width: 95%; border-width: 0;margin-bottom: 0px;" name="productName" label="" value="<%=product.getProductName()%>"/></td>
		</tr>
		<tr>
			<th>产品描述</th>
			<th>
				<aui:input style="width: 95%; border-width: 0;margin-bottom: 0px;" type="text" name="productDesc" label="" value="<%=product.getProductDesc()%>"/>
			</th>
		</tr>
		<tr>
			<th >产品演示URL</th>
			<th><aui:input style="width: 95%; border-width: 0;margin-bottom: 0px;" name="videoLink" label="" value="<%=product.getVideoLink() %>"/></th>
		</tr>
		<tr>
			<th>WIKI URL</th>
			<th><aui:input style="width: 95%; border-width: 0;margin-bottom: 0px;" name="wikiLink" label="" value="<%=product.getWikiLink() %>"/></th>
		</tr>
		<tr>
			<th>产品文档</th>
			<th><aui:input style="width: 95%; border-width: 0;margin-bottom: 0px;" name="productLink" label="" value="<%=product.getProductLink() %>"/>
				<aui:input name='productId' type='hidden' value='<%=ParamUtil.getString(renderRequest, "productId")%>' />
			</th>
		</tr>
	</table>
	</aui:fieldset>
	<aui:button-row>
		<aui:button type="submit"></aui:button>
		<aui:button type="reset"></aui:button>
		<aui:button type="cancel" onClick="<%=viewURL %>"></aui:button>
	</aui:button-row>
</aui:form>