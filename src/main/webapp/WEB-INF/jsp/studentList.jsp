<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Admin home</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
.navbar {
  overflow: hidden;
  background-color: #333;
  font-family: Arial, Helvetica, sans-serif;
}

.navbar a {
  float: left;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

.navbar a:hover, .dropdown:hover .dropbtn, .dropbtn:focus {
  background-color: red;
}

.show {
  display: block;
}
</style>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script src="resources/js/student.js"></script>

</head>
<body>

<div class="navbar">
  <a href="adminHome" >Admin Home</a> 
  <a href="getUsers" >show users</a>
  <a href="getStudents" >show Students</a>
  <a href="logout" > Logout</a>
  </div> 
</div>

<center>
	<h1>Student list</h1>
</center>

<div is="studentList">
	<c:if test="${not empty studentList}">
		<table align="center">
			<th>name</th><th>roll no</th><th>class</th><tr>
	    <c:forEach items="${studentList}" var="lists">
	       <td>${lists.name}</td><td>${lists.rollNo}</td><td>${lists.standard}</td></tr>
		</c:forEach>
	</c:if>
	<c:if test="${empty studentList}">
		<center>No data found</center>
	</c:if>
</div>



</body>

</html>



