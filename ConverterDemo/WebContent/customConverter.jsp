<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Custom Converter</title>
</head>
<body bgcolor="sky-blue">
<f:view>
<%-- Demo showing usage of custom converter --%>
	<center>
	<h2>Currency Converter</h2>
	<h:form id="form_CBG">
		<h:panelGrid border="1" columns="2">
			<h:outputText value="Enter amount in US Dollar"></h:outputText>
			<%-- Using custom converter --%>
			<h:inputText  value="#{currencyBean.dollar}" > 
									<f:converter converterId="currConv"/>
			</h:inputText>
			
			
			</h:panelGrid>
			<h:commandButton value="Convert" type="submit" action="success"></h:commandButton>
			</h:form>
			</center>
			</f:view>
</body>
</html>