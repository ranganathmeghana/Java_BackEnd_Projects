<%@ page language="java" contentType="text/html; charset=ISO-8859-1"                                             
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<html>
<head>
<title>DataTable Demo</title>
</head>
<body bgcolor="sky-blue">
<center>
<h2>Student Details</h2>
<f:view>
	<h:form>
		<h:dataTable id="dt1" value="#{studentBean.studList}" var="row"
			bgcolor="pink" border="2" width="50%">
			<h:column>
				<f:facet name="header">
					<h:outputText value="Name" />
				</f:facet>
				<h:outputText value="#{row.name}"></h:outputText>
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputText value="Grades" />
				</f:facet>
				<h:outputText value="#{row.grade}"></h:outputText>
			</h:column>
		</h:dataTable>
	</h:form>
</f:view></center>
</body>
</html>                                                                                                                                      

