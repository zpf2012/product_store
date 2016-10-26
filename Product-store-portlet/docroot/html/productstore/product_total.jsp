<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.service.ServiceContextFactory"%>
<%@page import="com.liferay.portal.service.ServiceContext"%>
<%@page import="java.util.Iterator"%>
<%@page	import="com.liferay.product.store.service.ProductLocalServiceUtil"%>
<%@page import="com.liferay.product.store.model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/html/productstore/init.jsp"%>

<portlet:defineObjects />
<portlet:renderURL var="addProductURL">
	<portlet:param name="mvcPath"
		value="/html/productstore/add_product.jsp" />
</portlet:renderURL>
<portlet:renderURL var="applyApproveURL">
	<portlet:param name="mvcPath"
		value="/html/productstore/apply_total.jsp" />
</portlet:renderURL>
<portlet:renderURL var="newVersionURL">
	<portlet:param name="mvcPath"
		value="/html/productstore/new_version.jsp" />
</portlet:renderURL>
<portlet:renderURL var="assessURL">
	<portlet:param name="mvcPath"
		value="/html/productstore/apply_assess.jsp" />
</portlet:renderURL>
<portlet:renderURL var="queryURL">
	<portlet:param name="mvcPath"
		value="/html/productstore/product_total.jsp" />
</portlet:renderURL>
<portlet:actionURL var="queryProductURL" name="queryProduct" />

<%
	List<Product> products = ProductLocalServiceUtil.getProducts(scopeGroupId);
	ServiceContext serviceContext = ServiceContextFactory.getInstance(request);
	long userId = serviceContext.getUserId();
	String cssClass = StringPool.BLANK;
%>

<hr>
<aui:form action="<%=queryProductURL%>">
	<aui:fieldset>
		<table border="0" style="width:98%;">
			<tr>
				<td style="width: 25%;">查询条件：<aui:input name="productNameQuery"
						label="" inlineField="true" style="width:150px;"></aui:input></td>
				<td style="width: 25%;">查询条件：<aui:input name="productDescQuery"
						label="" inlineField="true" style="width:150px;"></aui:input></td>
				<td style="width: 25%;">查询条件：<aui:input name="productNameQuery"
						label="" inlineField="true" style="width:150px;"></aui:input></td>
				<td style="width: 25%;">查询条件：<aui:input name="productDescQuery"
						label="" inlineField="true" style="width:150px;"></aui:input></td>
			</tr>
		</table>
		
		<aui:button-row>
			<aui:button value="查询" onClick="<%=queryProductURL %>"></aui:button>&nbsp;&nbsp;
			<aui:button type="reset" value="清除"></aui:button>
		</aui:button-row>
	</aui:fieldset>

</aui:form>
<hr>

<table border="1" width="98%" style="text-align: center">
	<tr style="background-color: highlight;">
		<th>产品名称</th>
		<th width="300px;">产品说明</th>
		<th>产品介绍</th>
		<th>测试环境</th>
		<th>WIKI</th>
		<th width="100px;">申请使用</th>
		<th width="100px;">用户评价</th>
		<th width="200px;">产品编辑</th>
	</tr>
	<%
		for(Product product: products){
		if(product.getUserId() != userId){
			cssClass = "hidden";
		}
	%>
	<portlet:renderURL var="applyProductURL">
		<portlet:param name="mvcPath"
			value="/html/productstore/apply_product.jsp" />
		<portlet:param name="productId"
			value="<%=String.valueOf(product.getProductId())%>" />
	</portlet:renderURL>

	<portlet:renderURL var="updateProductURL">
		<portlet:param name="mvcPath"
			value="/html/productstore/update_product.jsp" />
		<portlet:param name="productId"
			value="<%=String.valueOf(product.getProductId())%>" />
	</portlet:renderURL>

	<portlet:renderURL var="assessLookURL">
		<portlet:param name="mvcPath"
			value="/html/productstore/assess_collection.jsp" />
		<portlet:param name="productId"
			value="<%=String.valueOf(product.getProductId())%>" />
	</portlet:renderURL>

	<portlet:actionURL var="deleteProductURL" name="deleteProduct">
		<portlet:param name="mvcPath"
			value="/html/productstore/product_total.jsp" />
		<portlet:param name="productId"
			value="<%=String.valueOf(product.getProductId())%>" />
	</portlet:actionURL>
	<tr>
		<td><input type="hidden" id="<%=product.getProductId()%>"
			name="productId" value="<%=product.getProductId()%>" /><a href=""><%=product.getProductName()%></a></td>
		<td><%=product.getProductDesc()%></td>
		<td><a href="<%=product.getProductLink()%>">查看产品文档</a></td>
		<td><a href="<%=product.getVideoLink()%>">查看演示视频</a></td>
		<td><a href="<%=product.getWikiLink()%>">WIKI</a></td>
		
		<td><aui:button value="申请使用" onClick="<%=applyProductURL%>"></aui:button></td>
		<td><aui:button value="查看评价" onClick="<%=assessLookURL%>"></aui:button></td>
		<td><aui:button cssClass="<%=cssClass%>" value="编辑" onClick="<%= updateProductURL%>"></aui:button>
			<aui:button value="新版本" onClick="<%= newVersionURL%>"></aui:button>
			<aui:button cssClass="<%=cssClass%>" value="删除" onClick="return sure()"></aui:button>
			<script>
					function sure(){
						if(confirm("确定删除？")){
							location.href="<%=deleteProductURL%>";
							return true;
						}else{
							return false;
						}
					}
				</script></td>
	</tr>
	<%
		cssClass = "";
		}
	%>
</table>
<hr>
<aui:button-row>
	<aui:button value="新增产品" onClick="<%=addProductURL%>"></aui:button>&nbsp;
	<aui:button value="审批" onClick="<%=applyApproveURL%>"></aui:button>&nbsp;
	<aui:button value="使用评价" onClick="<%=assessURL%>"></aui:button>
</aui:button-row>
