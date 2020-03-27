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
<h1>Update Sample</h1>  
<body>

       <form:form method="post" action="saveSamplestwo/${sample.rNo}" modelAttribute="sampl">    
        <table >     
         <tr> 
         <tr>    
          <td>Name : </td>   
          <td><form:input path="name"  value="${sample.name}"/></td>  
         </tr>    
         <tr>    
         
          <td>Age :</td>    
          <td><form:input path="age"   value="${sample.age}"/></td>  
         </tr>   
         <tr>    
          <td>Percentage :</td>    
          <td><form:input path="percentage"  value="${sample.percentage}"/></td>  
         </tr>   
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Update" /></td>    
         </tr>    
        </table>    
       </form:form>   
</body>
</html>