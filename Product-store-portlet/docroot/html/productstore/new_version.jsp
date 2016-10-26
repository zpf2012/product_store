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
			<td><input type="text" style=" width: 500px; border-width: 1; border-style: solid; margin-left: 13px;margin-top: 10px;" name="productName"/></td>
		</tr>
		<tr>
			<th>最新版本日期</th>
			<td><input type="date" style=" width: 500px; border-width: 1; border-style: solid; margin-left: 13px;margin-top: 10px;" name="productName"/></td>
		</tr>
		<tr>
			<th>版本更新说明</th>
			<td style="padding-left: 30px;"><textarea rows="4" cols="3" style="width: 500px;"></textarea></td>
		</tr>
		<tr>
			<th>安装包URL</th>
			<td><input type="text" style=" width: 500px; border-width: 1; border-style: solid; margin-left: 13px;margin-top: 10px;" name="productName"/></td>
		</tr>
		<tr>
			<td colspan="2"><hr></td>
		</tr>
		<tr>
			<th>产品名称</th>
			<td><input type="text" style=" width: 500px; border-width: 1; border-style: solid; margin-left: 13px;margin-top: 10px;" name="productName"/></td>
		</tr>
		<tr>
			<th>产品说明</th>
			<td>
				<textarea rows="4" cols="1" style="width: 500px; border-width: 1; border-style: solid; margin: 10px;" name="productDesc"></textarea>
			</td>
		</tr>
		<tr>
			<th>产品性质</th>
			<td >
				<select name="productProperty" style="width: 500px; border-width: 1; border-style: solid; margin: 10px;">
					<option value="事业部自有产品发布">事业部自有产品发布</option>
					<option value="公司级标准化产品">公司级标准化产品</option>
					<option value="汉得产品系列">汉得产品系列</option>
				</select>
			</td>
		</tr>
		<tr>
			<th>部署平台</th>
			<td style="padding-left: 30px;">
				<input type="checkbox" name="deploymentPlatform" value="Oracle EBS"/>Oracle EBS<br>
				<input type="checkbox" name="deploymentPlatform" value="SAP"/>SAP<br>
				<input type="checkbox" name="deploymentPlatform" value="Microsoft Dynamic"/>Microsoft Dynamic<br>
				<input type="checkbox" name="deploymentPlatform" value="可独立部署"/>可独立部署<br>
			</td>
		</tr>
		<tr>
			<th>产品经理</th>
			<td>
				<select name="PM" style="width: 300px; border-width: 1; border-style: solid; margin: 10px;">
				</select>
			</td>
		</tr>
		<tr>
			<th>技术经理</th>
			<td>
				<select name="TM" style="width: 300px; border-width: 1; border-style: solid; margin: 10px;">
				</select>
			</td>
		</tr>
		<tr>
			<th>技术顾问</th>
			<td>
				<select name="TD" style="width: 300px; border-width: 1; border-style: solid; margin: 10px;">
				</select>
			</td>
		</tr>
		<tr>
			<th >产品演示URL</th>
			<td><input type="text" style=" width: 95%; border-width: 1; border-style: solid; margin-left: 13px;margin-top: 10px;" name="videoLink"/></td>
		</tr>
		<tr>
			<th>产品WIKI URL</th>
			<td><input type="text" style=" width: 95%; border-width: 1; border-style: solid; margin-left: 13px;margin-top: 10px;" name="wikiLink" /></td>
		</tr>
		<tr>
			<th>产品文档URL</th>
			<td><input type="text" style=" width: 95%; border-width: 1; border-style: solid; margin-left: 13px;margin-top: 10px;" name="productLink" /></td>
		</tr>
	</table>
	<hr>
	<div style="margin-left: 40px;">
		<input type="submit" value="提交" style="width: 50px; padding: 5px; background-color: highlight;"/>&nbsp;&nbsp;
		<input type="reset" value="重置" style="width: 50px; padding: 5px; background-color: highlight;"/>&nbsp;&nbsp;
		<button value="取消" onClick="<%=viewURL %>" style="width: 50px; padding: 5px; background-color: highlight;">取消</button>
	</div>
		
</form>