<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<h1 style="color:red;text-align:center">Reigistration Form</h1>

<form:form method="POST"  commandName="empCmd">
   <form:errors path="*"/>
   Employee name:: <form:input path="empName"/> <br>
   Employee Address:: <form:input path="empAddrs"/> <br>
   Employee DOB:: <form:input path="dob"/>(dd-MM-yyyy) <br>
   Employee DOJ:: <form:input path="doj"/>(dd-MM-yyyy) <br>
   Employee DOM:: <form:input path="dom"/>(dd-MM-yyyy) <br>
   <input type="Submit"  value="register">
</form:form>


