<%-- This page demonstrates different methods of using standard converters. --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Standard Converters</title>
</head>
<body bgcolor="sky-blue">
<f:view>
<%-- Demo showing usage of standard converter --%>
	<center>
	<h2>Standard Converters</h2>
	<h:form id="form_CBG">
		<h:panelGrid bgcolor="pink" border="1" columns="3">
			<h:outputText value="Enter Date Of Joining"></h:outputText>
			<%-- Using standard converter with converter attribute --%>
			<h:inputText id = "custDoj" value="#{customerBean.doj}"  
									converter="javax.faces.DateTime" >
			</h:inputText>
			<h:message for="custDob"></h:message>
			
			<h:outputText value="Enter Date Of Birth"></h:outputText>
			<h:inputText id = "custDob" value="#{customerBean.dob}" > 
			<%-- Using standard converter with <f:converter> tag  --%>
			<f:converter converterId="javax.faces.DateTime" />
			</h:inputText>
			<h:message for="custDob"></h:message>
			
			
		</h:panelGrid>
		<h:commandButton value="Submit" action="#{customerBean.display}"></h:commandButton>
		<h:commandButton value="Reset" type="reset"></h:commandButton>
	</h:form>  <br>
	<br>
	</center>
</f:view>
</body>
</html>