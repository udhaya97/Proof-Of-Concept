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
<div align="center">
<h1>Employees List</h1>  
<table border="2" width="50%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Age</th><th>Percentage</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="samp" items="${lis}">   
   <tr>  
   <td>${samp.rNo}</td>  
   <td>${samp.name}</td> 
    <td>${samp.age}</td> 
   <td>${samp.percentage}</td>  
   <td><a href="updatesamp/${samp.rNo}">Edit</a></td>  
   <td><a href="deletesamp/${samp.rNo}"
    onclick="if(!(confirm('Are you sure want to delete this Employee permanently?'))) return false"
     >Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="addSample">Add New Employee</a>  
</div>
</body>
</html>