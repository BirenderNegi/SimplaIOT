<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 <div align="center">
        <table border="0">
            <tr>
                <td colspan="2" align="center"><h2>Registration Succeeded!</h2></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <h3>Here's the review of your details:</h3>
                </td>
            </tr>
             <tr>
                <td>Organization Name :</td>
                <td>${organizationUserForm.organizationName}</td>
            </tr>
             <tr>
                <td>Organization Address :</td>
                <td>${organizationUserForm.organizationAddress}</td>
            </tr>
             <tr>
                <td>First Name :</td>
                <td>${organizationUserForm.firstName}</td>
            </tr>
            <tr>
                <td>Last Name :</td>
                <td>${organizationUserForm.lastName}</td>
            </tr>
            <tr>
                <td>Role Name</td>
                <td>${organizationUserForm.roleName}</td>
            </tr>
            <tr>
                <td>User Name:</td>
                <td>${organizationUserForm.username}</td>
            </tr>
            <tr>
                <td>E-mail:</td>
                <td>${organizationUserForm.email}</td>
            </tr>
            
        </table>
    </div>
</body>
</html>