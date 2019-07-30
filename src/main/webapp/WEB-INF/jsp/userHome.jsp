<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
	<spring:url value="../resources/css/home.css" var="homeCss"></spring:url>
    <link rel="stylesheet" href="${homeCss}">
<title>User home</title>
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
</head>
<body>

<div class="navbar">
  <a href="userHome" id="home">User Home</a> 
  <a href="getUsers" >show users</a>
  <a href="getStudents" >show Students</a>
  <a href="logout" > Logout</a>
  </div> 
</div>

<h3>Welcome user</h3>



</body>
    
 
</html>