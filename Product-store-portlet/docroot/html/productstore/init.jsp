<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="com.liferay.product.store.service.ApplyLocalServiceUtil"%>
<%@page import="com.liferay.product.store.model.Apply"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.liferay.product.store.service.ProductLocalServiceUtil"%>
<%@page import="com.liferay.product.store.model.Product"%>
<%@page import="java.util.List"%>
<%@page import="java.text.DateFormat"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.service.ServiceContextFactory"%>
<%@page import="com.liferay.portal.service.ServiceContext"%>    

<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.1.0.min.js"></script>
<%-- <link href="<%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet"> --%>
<style>
.aui .control-group {
   margin-bottom: 0px;
}
.button-holder {
    margin: 5px 0; 
}
tr {
	height: 25px;
}

.aui input {
    width: 98%; 
    border-width: 0; 
    border-style: solid; 
    margin-bottom: 0px;
}
.aui hr {
	margin: 5px 0;
}
th {
	font-size: 14px;
    font-weight: bold;
    text-align: -internal-center;
    margin-top: 5px;
    text-align: center;
}
td {
	text-align: center;
	padding: 5px;
}
.aui button{
	padding: 5px; 
	background-color: highlight;
}

</style>
<portlet:defineObjects />
<theme:defineObjects />