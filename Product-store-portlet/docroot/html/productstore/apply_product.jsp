<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/html/productstore/init.jsp"%>

<portlet:defineObjects />
<portlet:actionURL var="applyProductURL" name="applyProduct"></portlet:actionURL>
<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/html/productstore/product_total.jsp" />
</portlet:renderURL>

<aui:form action="<%=applyProductURL%>">
	<aui:fieldset>
	<table border="0" width="60%" style="text-align: center">
		<tr>
			<th>申请ID</th>
			<td>
				<aui:input style="width: 95%; border-width: 1; border-style: solid; margin-bottom: 0px;" name="applyID" label=""/>
			</td>
		</tr>
		<tr>
			<th>产品名称</th>
			<td><aui:input style="width: 95%; border-width: 1; border-style: solid; margin-bottom: 0px;" name="productName" label=""/>
				<aui:input name='productId' type='hidden' value='<%=ParamUtil.getString(renderRequest, "productId")%>' />
			</td>
		</tr>
		<tr>
			<th>当前版本</th>
			<td>
				<aui:input style="width: 95%; border-width: 1; border-style: solid; margin-bottom: 0px;" name="version" label=""/>
			</td>
		</tr>
		<tr>
			<th>申请项目</th>
			<td>
				<aui:input style="width: 95%; border-width: 1; border-style: solid; margin-bottom: 0px;" name="integrationObject" label=""/>
			</td>
		</tr>
		<tr>
			<th>申请人</th>
			<td>
				<aui:input style="width: 95%; border-width: 1; border-style: solid; margin-bottom: 0px;" name="createName" label=""/>
			</td>
		</tr>
		<tr>
			<th>使用方式</th>
			<td style="text-align: left;padding-left: 10px;">
				<aui:select name="useType" label="">
					<aui:option value="直接使用">直接使用</aui:option>
					<aui:option value="改造后使用">改造后使用</aui:option>
				</aui:select>
			</td>
		</tr>
		<tr>
			<th>项目经理</th>
			<td>
				<aui:input style="width: 95%; border-width: 1; border-style: solid; margin-bottom: 0px;" name="integrationObject" label=""/>
			</td>
		</tr>
		<tr>
			<th>项目负责顾问</th>
			<td>
				<aui:input style="width: 95%; border-width: 1; border-style: solid; margin-bottom: 0px;" name="integrationObject" label=""/>
			</td>
		</tr>
		<tr>
			<th>申请说明</th>
			<td>
				<textarea rows="4" cols="1" style="width: 95%; border-width: 1; border-style: solid; margin-left: 10px;" name="productDesc"></textarea>
			</td>
		</tr>
		<tr>
			<td colspan="2" style=" text-align: left; padding-left: 70px;">*在申请公司Oracle/SAP标准化产品时，请填写以下信息</td>
		</tr>
		<tr>
			<th>平台版本</th>
			<td style="text-align: left;padding-left: 10px;">
				<aui:select name="version" label="">
				</aui:select>
			</td>
		</tr>
	</table>
	</aui:fieldset>
	<hr style="margin-bottom: 20px;">
	<div style="padding-left: 40px;">
		<aui:button-row>
			<aui:button type="submit"></aui:button>&nbsp;&nbsp;
			<aui:button type="reset"></aui:button>&nbsp;&nbsp;
			<aui:button type="cancel" onClick="<%=viewURL %>"></aui:button>
		</aui:button-row>
	</div>
</aui:form>