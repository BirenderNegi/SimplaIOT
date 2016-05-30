<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<spring:url value="/resources/css/validation.css" var="validation" />
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Organization Creation and User Creation</title>
	<link href="${validation}" rel="stylesheet" />
	<style>
    .error {
        color: red; font-weight: bold;
    }
</style>
</head>
<body>
	<div align="center">
        <form:form action="createOrg" commandName="organizationUserForm">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Super Admin - Organization Creation</h2></td>
                </tr>
                 <tr>
                    <td>Organization Name</td>
                    <td><form:input path="organizationName" /></td>
                    <td align="left"><form:errors path="organizationName" cssClass="error"/></td>
                </tr>
                <tr>
                    <td>Organization Address</td>
                    <td><form:input path="organizationAddress" /></td>
                    <td align = "left"><form:errors path="organizationAddress" cssClass="error"/></td>
                </tr> 
                <tr>
                    <td>First Name :</td>
                    <td><form:input path="firstName" /></td>
                    <td align="left"><form:errors path="firstName" cssClass="error"/></td>
                </tr>
                <tr>
                    <td>Last Name:</td>
                    <td><form:input path="lastName" /></td>
                    <td align="left"><form:errors path="lastName" cssClass="error"/></td>
                </tr>
                <tr>
                    <td>User Name:</td>
                    <td><form:input path="username" /></td>
                    <td align="left"><form:errors path="username" cssClass="error"/></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><form:password path="password" /></td>
                    <td align="left"><form:errors path="password" cssClass="error"/></td>
                </tr>
                <tr>
                    <td>E-mail:</td>
                    <td><form:input path="email" /></td>
                    <td align="left"><form:errors path="email" cssClass="error"/></td>
                </tr>
                 <tr>
                    <td>Role name</td>
                    <td><form:input path="roleName" /></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Register" /></td>
                </tr>
            </table>
        </form:form>
    </div>
</body>
</html>