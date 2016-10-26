<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/html/productstore/init.jsp"%>
<portlet:defineObjects />
<portlet:actionURL var="addProductURL" name="addProduct">
<style>
td{
	text-align: left;
	padding-left: 18px;
}

</style>	
</portlet:actionURL>
<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/html/productstore/product_total.jsp" />
</portlet:renderURL>

<form action="<%=addProductURL%>">
	<table border="0" width="60%" style="text-align: center">
		<tr>
			<th style="width: 200px;">最新版本号</th>
			<td><aui:input type="text" label="" style=" width: 500px; border-width: 1; border-style: solid; margin-top: 5px;" name="productName"/></td>
		</tr>
		<tr>
			<th>最新版本日期</th>
			<td><aui:input type="date" label="" style=" width: 500px; border-width: 1; border-style: solid; margin-top: 5px;" name="productName"/></td>
		</tr>
		<tr>
			<th>版本更新说明</th>
			<td><aui:input name="" label="" type="textarea" rows="4" cols="3" style="width: 500px;"/></td>
		</tr>
		<tr>
			<th>安装包URL</th>
			<td><aui:input type="text" label="" style=" width: 500px; border-width: 1; border-style: solid; margin-top: 5px;" name="productName"/></td>
		</tr>
		<tr>
			<td colspan="2"><hr></td>
		</tr>
		<tr>
			<th style="width: 150px;">产品名称</th>
			<td style="text-align: left;"><aui:input type="text" label="" style=" width: 500px; border-width: 1; border-style: solid; margin-bottom: 5px;" name="productName"/></td>
		</tr>
		<tr>
			<th>产品说明</th>
			<td style="text-align: left;">
				<aui:input type="textarea" label="" rows="4" cols="1" style="width: 500px; border-width: 1; border-style: solid;margin-bottom: 5px;" name="productDesc"/>
			</td>
		</tr>
		<tr>
			<th>产品性质</th>
			<td style="text-align: left;">
				<select name="productProperty" style="width: 230px; border-width: 1; border-style: solid; margin-bottom: 5px;">
					<option value="事业部自有产品发布">事业部自有产品发布</option>
					<option value="公司级标准化产品">公司级标准化产品</option>
					<option value="汉得产品系列">汉得产品系列</option>
				</select>
			</td>
		</tr>
		<tr>
			<th>部署平台</th>
			<td style="text-align: left; padding: 20px;">
				<aui:field-wrapper name="deploymentPlatform" label="">
					<aui:input name="deploymentPlatform" label="" type="checkbox" value="Oracle EBS"/>Oracle EBS<br>
					<aui:input name="deploymentPlatform" label="" type="checkbox" value="SAP"/>SAP<br>
					<aui:input name="deploymentPlatform" label="" type="checkbox" value="Microsoft Dynamic"/>Microsoft Dynamic<br>
					<aui:input name="deploymentPlatform" label="" type="checkbox" value="可独立部署"/>可独立部署<br>
				</aui:field-wrapper>
			</td>
		</tr>
		<tr>
			<th>产品经理</th>
			<td style="text-align: left;">
				<select name="PM" style="width: 200px; border-width: 1; border-style: solid; margin-bottom: 5px;">
				</select>
			</td>
		</tr>
		<tr>
			<th>技术经理</th>
			<td style="text-align: left;">
				<aui:select name="TM" label="" style="width: 200px; border-width: 1; border-style: solid; margin-bottom: 5px;">
					<aui:option></aui:option>
				</aui:select>
			</td>
		</tr>
		<tr>
			<th>技术顾问</th>
			<td style="text-align: left;">
				<aui:select name="TD" label="" style="width: 200px; border-width: 1; border-style: solid; margin-bottom: 5px;">
					<aui:option></aui:option>
				</aui:select>
			</td>
		</tr>
		<tr>
			<th >产品演示URL</th>
			<td style="text-align: left;"><aui:input type="text" label="" style=" width: 500px; border-width: 1; border-style: solid; margin-bottom: 5px;" name="videoLink"/></td>
		</tr>
		<tr>
			<th>产品WIKI URL</th>
			<td style="text-align: left;"><aui:input type="text" label="" style=" width: 500px; border-width: 1; border-style: solid; margin-bottom: 5px;" name="wikiLink" /></td>
		</tr>
		<tr>
			<th>产品文档URL</th>
			<td style="text-align: left;"><aui:input type="text" label="" style=" width: 500px; border-width: 1; border-style: solid; margin-bottom: 5px;" name="productLink" /></td>
		</tr>
	</table>
	<hr>
	<div style="margin-left: 40px;">
		<aui:button  type="submit" value="提交" style="width: 50px; padding: 5px; background-color: highlight;"/>&nbsp;&nbsp;
		<aui:button type="reset" value="重置" style="width: 50px; padding: 5px; background-color: highlight;"/>&nbsp;&nbsp;
		<aui:button value="取消" onClick="<%=viewURL %>" style="width: 50px; padding: 5px; background-color: highlight;"></aui:button>
	</div>
		
</form>