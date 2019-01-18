<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

 <h1 style="color:red;text-align:center"> Example App MultiActionController </h1>
 
 <form action="userCurd.htm" method="POST">
      userId :: <input type="text" name="userId"><br>
      userName :: <input type="text" name="userName"><br>
      userAddress :: <input type="text" name="userAddrs"><br>
      userEmail :: <input type="text" name="userEmail"><br>
      <input type="submit"  value="insert"  name="opt">
      <input type="submit"  value="update"  name="opt">
      <input type="submit"  value="delete"  name="opt">
      <input type="submit"  value="find"  name="opt1">
 </form>
 <hr>
 <c:if test="${!empty operationMsg }">
    <b>${operationMsg }  is done <b> <br>
  </c:if>
   <c:if test="${!empty cmdData }">
  command object Data :: ${cmdData }
  </c:if>
  
