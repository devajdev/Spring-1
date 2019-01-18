<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

 <h1 style="color:red;text-align:center"> Example App MultiActionController </h1>
 
 <form name="frm"  method="POST">
      userId :: <input type="text" name="userId"><br>
      userName :: <input type="text" name="userName"><br>
      userAddress :: <input type="text" name="userAddrs"><br>
      userEmail :: <input type="text" name="userEmail"><br>
      <input type="button"  value="register"  name="opt" onclick="send(this.value)">
      <input type="button"  value="modify"  name="opt" onclick="send(this.value)">
      <input type="button"  value="remove"  name="opt" onclick="send(this.value)">
      <input type="button"  value="search"  name="opt" onclick="send(this.value)">
 </form>
 <hr>
 <c:if test="${!empty operationMsg }">
    <b>${operationMsg }  is done <b> <br>
  </c:if>
   <c:if test="${!empty cmdData }">
  command object Data :: ${cmdData }
  </c:if>
  
  <script language="JavaScript">
     function send(cap){
      var uid=frm.userId.value;
      var uname=frm.userName.value;
      var addrs=frm.userAddrs.value;
      var email=frm.userEmail.value;
       if(cap=="register")
             frm.action="insert.htm";
        else if(cap=="modify")
            frm.action="update.htm"; 
        else if(cap=="remove")
            frm.action="delete.htm";
         else if(cap=="search")
            frm.action="find.htm";
          else 
                frm.action="invalid.htm";
           
           frm.submit();
     }
  </script>
