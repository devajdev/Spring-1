<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
   <h1 style="color:red;text-align:center"> Edit Student Detials </h1>
   <form:form  method="POST" commandName="stCmd">
      Student number :: <form:input path="sno" disabled="true"/> <br>
      Student name :: <form:input path="sname" /> <br>
      Student course :: <form:input path="course" /> <br>
      Student address :: <form:input path="sadd" /> <br>
       Student Percentage :: <form:input path="percentage"/> <br>
       <input type="submit"  value="edit Student Details">
   </form:form>
