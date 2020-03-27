<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My App</title>
</head>
 
<body>
<div align ="center">
<h1>Add New Employee</h1> 
       <form:form method="post" action="../saveSamples" modelAttribute="samp">   
       
       <form:hidden path="rNo"/> 
        <table >  
         <tr> 
         <tr>    
          <td>Name : </td>   
          <td><form:input path="name"/></td>  
         </tr>    
         <tr>    
         
          <td>Age :</td>    
          <td><form:input path="age"/></td>  
         </tr>   
         <tr>    
          <td>Percentage :</td>    
          <td><form:input path="percentage"/></td>  
         </tr>   
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save"/>    
         </tr>    
        </table>    
       </form:form>   </div>
</body>
</html>