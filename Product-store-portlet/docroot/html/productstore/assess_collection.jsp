<%@page import="com.liferay.product.store.service.AssessLocalServiceUtil"%>
<%@page import="com.liferay.product.store.model.Assess"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/html/productstore/init.jsp"%>
<style>
	table tr:nth-child(odd){background:#F4F4F4;}
	table td:nth-child(even){color:#C00;}
</style>
<portlet:defineObjects />
<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/html/productstore/product_total.jsp" />
</portlet:renderURL>
<%
	long productId = ParamUtil.getLong(renderRequest, "productId");

	java.text.DecimalFormat df =new java.text.DecimalFormat("#.00");  
	Product product = ProductLocalServiceUtil.getProduct(productId);
	String productName = product.getProductName();
	String projectName = "";
	long applyId = 0;
	double multipleAssess = 0;
	double configurable = 0;
	double stability = 0;
	double integrationGrade = 0;
	int count = 0;
	List<Assess> assesses = null;

	assesses = AssessLocalServiceUtil.getAssesses(productId);
	
%>
<form action="<%=viewURL%>" method="post" enctype="multipart/form-data">
	<table border="1" width="98%" style="text-align: center">
		<tr>
			<td colspan="5"><h3>产品使用评价查看</h3></td>
		</tr>
		<tr>
			<th width="25%">产品名称</th>
			<td colspan="4"><%=productName %></td>
		</tr>
		<tr>
			<td colspan="5"><h3>复用记录</h3></td>
		</tr>
		<tr style="background-color: highlight;">
			<th >项目名称</th>
			<th >综合评价</th>
			<th >可配置性</th>
			<th >稳定性</th>
			<th >集成程度</th>
		</tr>
		<%
		if(assesses.size() > 0){
			for(Assess assess: assesses){
				%>
				<tr>
					<th ><%=assess.getProjectName()%></th>
					<th ><%=assess.getMultipleAssess()%></th>
					<th ><%=assess.getConfigurable()%></th>
					<th ><%=assess.getStability()%></th>
					<th ><%=assess.getIntegrationGrade()%></th>
				</tr>
				<%
				multipleAssess += assess.getMultipleAssess();
				configurable += assess.getConfigurable();
				stability += assess.getStability();
				integrationGrade += assess.getIntegrationGrade();
				count++;
			}
			multipleAssess /= count;
			configurable /= count;
			stability /= count;
			integrationGrade /= count;
		}
		%>
		
		<tfoot>
			<tr>
				<th >总计</th>
				<th ><%=df.format(multipleAssess)%></th>
				<th ><%=df.format(configurable)%></th>
				<th ><%=df.format(stability)%></th>
				<th ><%=df.format(integrationGrade)%></th>
			</tr>
		</tfoot>
	</table>
	<aui:button-row>
		<aui:button type="cancel" value="返回" onClick="<%=viewURL %>"></aui:button>
	</aui:button-row>
</form>