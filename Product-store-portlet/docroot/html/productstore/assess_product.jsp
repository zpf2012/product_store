<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/html/productstore/init.jsp"%>
<script type="text/javascript">
    $(function () {
    	$("#div1 li").css("color", "red").html("☆ ");
    	$("#div2 li").css("color", "red").html("☆ ");
    	$("#div3 li").css("color", "red").html("☆ ");
    	$("#div4 li").css("color", "red").html("☆ ");
        $("#div1 li").mousedown(function(){
        	$("#div1 li").css("color", "red").html("☆ ");
            $(this).css("color", "red").html("★ ").prevAll().css("color", "red").html("★ ");
            $("#score").val(parseInt($(this).index("#div1 li")) + 1);
            $("#multipleAssess").val($("#score").val()); 
        });
        $("#div2 li").mousedown(function(){
        	$("#div2 li").css("color", "red").html("☆ ");
            $(this).css("color", "red").html("★ ").prevAll().css("color", "red").html("★ ");
            $("#score").val(parseInt($(this).index("#div2 li")) + 1);
            $("#multipleAssess").val($("#score").val()); 
        });
        $("#div3 li").mousedown(function(){
        	$("#div3 li").css("color", "red").html("☆ ");
            $(this).css("color", "red").html("★ ").prevAll().css("color", "red").html("★ ");
            $("#score").val(parseInt($(this).index("#div3 li")) + 1);
            $("#multipleAssess").val($("#score").val()); 
        });
        $("#div4 li").mousedown(function(){
        	$("#div4 li").css("color", "red").html("☆ ");
            $(this).css("color", "red").html("★ ").prevAll().css("color", "red").html("★ ");
            $("#score").val(parseInt($(this).index("#div4 li")) + 1);
            $("#multipleAssess").val($("#score").val()); 
        });
    });
</script>
<style>
     li{
         list-style-type:none;
     }
     ul li {
         height:35px;
         line-height:35px;  /*  让内容垂直居中  */
         display:inline;  /*  将li设置成内联元素就可以了  */
     }
</style>

<portlet:defineObjects />
<portlet:actionURL var="assessProductURL" name="assessProduct"></portlet:actionURL>
<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/html/productstore/apply_assess.jsp" />
</portlet:renderURL>

<%
	long applyId = ParamUtil.getLong(renderRequest, "applyId");
	Apply apply = ApplyLocalServiceUtil.getApply(applyId);
	
%>
<aui:form action="<%=assessProductURL%>">
	<aui:fieldset>
	<table border="1" width="98%" style="text-align: center">
		<tr>
			<td colspan="4"><h4>产品使用评价</h4></td>
		</tr>
		<tr>
			<th width="25%">项目名称</th>
			<td colspan="3"><%=apply.getProjectName() %></td>
		</tr>
		<tr>
			<th width="25%">申请产品名称</th>
			<%
				Product product = ProductLocalServiceUtil.getProduct(apply.getProductId());
			%>
			<td colspan="3"><%=product.getProductName() %></td>
		</tr>
		<tr>
			<th width="25%">集成对象</th>
			<td colspan="3">
				<%=apply.getIntegrationObject() %>
			</td>
		</tr>
		<tr>
			<th width="25%">复用百分比</th>
			<td width="25%">
				<aui:input name='productId' type='hidden' value='<%=apply.getProductId()%>' />
				<aui:input name='applyId' type='hidden' value='<%=apply.getApplyId()%>' />
				<aui:input name='projectName' type='hidden' value='<%=apply.getProjectName()%>' />
				<aui:input label="" name='multiPercent' type='number' suffix="%"/>
			</td>
			<th width="25%">综合评价</th>
			<td width="25%" >
			<div>
			    <div id="div1">
			        <ul>
			            <li>☆ </li><li>☆ </li><li>☆ </li><li>☆ </li><li>☆ </li>
			        </ul>
			    </div>
			    <input type="hidden" id="multipleAssess" name="multipleAssess" />
				<%-- <aui:input type="hidden" id="multipleAssess" name='multipleAssess' label=""></aui:input> --%>
			</div>
			</td>
		</tr>
		<tr>
			<th width="25%">可配置性</th>
			<td width="25%">
				<div>
			    <div id="div2">
			        <ul>
			            <li>☆ </li><li>☆ </li><li>☆ </li><li>☆ </li><li>☆ </li>
			        </ul>
			    </div>
			    <input type="hidden" id="configurable" name="configurable" />
				<%-- <aui:input type="hidden" id="configurable" name='configurable' label=""></aui:input> --%>
			</div>
			</td>
			<th width="25%">稳定性</th>
			<td width="25%">
				<div>
			    <div id="div3">
			        <ul>
			            <li>☆ </li><li>☆ </li><li>☆ </li><li>☆ </li><li>☆ </li>
			        </ul>
			    </div>
			    <input type="hidden" id="stability" name="stability" />
				<%-- <aui:input type="hidden" id="configurable" name='configurable' label=""></aui:input> --%>
			</td>
			
		</tr>
		<tr>
			<th width="25%">集成程度</th>
			<td width="25%">
				<div>
			    <div id="div4">
			        <ul>
			            <li>☆ </li><li>☆ </li><li>☆ </li><li>☆ </li><li>☆ </li>
			        </ul>
			    </div>
			    <input type="hidden" id="integrationGrade" name="integrationGrade" />
				<%-- <aui:input type="hidden" id="configurable" name='configurable' label=""></aui:input> --%>
			</td>
			<th width="25%"></th>
			<td width="25%"></td>
		</tr>
		</table>
		</aui:fieldset>
		<aui:button-row>
		<aui:button type="submit"></aui:button>
		<aui:button type="reset"></aui:button>
		<aui:button type="cancel" onClick="<%=viewURL %>"></aui:button>
	</aui:button-row>
</aui:form> 

