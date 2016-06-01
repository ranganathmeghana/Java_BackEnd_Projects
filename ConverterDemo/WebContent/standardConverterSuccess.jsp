<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bill Success</title>
</head>
<body bgcolor="sky-blue">
<f:view>
<%-- Demo - standard converter success --%>
<center><h2>Standard Converters</h2>
<h:panelGrid bgcolor="pink" border="1" columns="2">
<!-- To show the date without using any converter  -->
		<h:outputText value="Date of birth(without using any converter)"></h:outputText>
		<h:outputText value="#{customerBean.dob}"/>
<!-- To show the date in default format -->
		<h:outputText value="Date of joining in default format"></h:outputText>
		<h:outputText value="#{customerBean.doj}">
<f:converter converterId="javax.faces.DateTime"/>
</h:outputText>
<!-- To show the date in a particular pattern -->
<h:outputText value="Date of birth in 'dd-MMM-yyyy' format"/>
<h:outputText value="#{customerBean.dob}">
	<f:convertDateTime type="date" pattern="dd-MMM-yyyy"/>
	</h:outputText> 
	</h:panelGrid>
</center>
</f:view>
</body>
</html>