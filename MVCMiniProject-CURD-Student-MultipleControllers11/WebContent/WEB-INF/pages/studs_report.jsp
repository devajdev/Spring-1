<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<c:choose>
   <c:when test="${!empty listStuds}">
       <table border="1" bgcolor="cyan">
        <tr><th>SrNo</th> <th>sno </th><th>sname</th><th>course </th><th>addrs</th><th>percentage</th><th>action1</th> <th>action2</th></tr>
         <c:forEach var="stud" items="${listStuds}">
          <tr bgColor="yellow">
             <td>${stud.srNo} </td>
             <td>${stud.sno} </td>
             <td>${stud.sname} </td>
             <td>${stud.course} </td>
             <td>${stud.sadd} </td>
             <td>${stud.percentage} </td>
             <td><a href="stud_edit.htm?sno=${stud.sno}">edit</a></td>
             <td><a href="stud_delete.htm?sno=${stud.sno}" onclick="alert('Deletes this student' )">delete</a></td>
          </tr>
         </c:forEach> 
       </table>
   </c:when>
   <c:otherwise>
       <h1 style="color:red;text-align:center">No Records found </h1>
   </c:otherwise>

</c:choose>
<br>
          <h2 style="color:cyan;text-align:center">${operation}</h2>
<br><br>
  <h1 style="color:red;text-align:center"><a href="home.htm">home</a> </h1>


