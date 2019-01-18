<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<h1 style="color:red;text-align:center">Student Registration form </h1>

<form:form method="POST"  commandName="stCmd">
  <p style="color:red">
     <form:errors path="*"/>
  </p>
   student name :: <form:input path="sname"/> <br>
   student address :: <form:input path="sadd"/> <br>
   Gender :: <form:radiobuttons path="gender" items="${genderList}"/> <br>
   Qualification:: <form:select path="qlfy">
                                   <form:options items="${qlfyList}"/>
                               </form:select> <br>
   courses :: <form:select path="courses"  multiple="true">
                              <form:options items="${coursesList}"/>
                         </form:select> <br>
  Hobies ::  <form:checkboxes items="${hobiesList}" path="hobies"/>  <br>
  <input type="submit"  value="register">                         
</form:form>
     

