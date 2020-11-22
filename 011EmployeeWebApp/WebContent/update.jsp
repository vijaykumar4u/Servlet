<%@page import="com.vidvaan.model.EmployDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<% EmployDetails emp=(EmployDetails)request.getAttribute("empUpdatecon"); %>
<form action="./update" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Id</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Id" name="eid" value=<% emp.getId(); %>>
   
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Name</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Name" name="ename" value=<% emp.getName(); %>>
   
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Sex</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Sex" name="esex" value=<% emp.getGender(); %>>
   
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Salary</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Salary" name="esal" value=<% emp.getSalary(); %>>
   
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Department</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Sex" name="edptmnt" value=<% emp.getDepartment(); %>>
   
  </div>
  
  
  
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
<a href="home.jsp"><center><b ><button style="color: lightblue">Home</button></b></center></a>
</body>
</html>