<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script src="resources/js/student.js"></script>
<meta charset="UTF-8">
<title>User List</title>
</head>
<body>
	<center>
		<h1>User List</h1>
	</center>
	
	<div is="studentList">
		<c:if test="${not empty userList}">
			<table align="center">
				<th>username</th><th>role</th><tr>
		    <c:forEach items="${userList}" var="lists">
		       <td>${lists.username}</td><td>${lists.role}</td></tr>
			</c:forEach>
		</c:if>
		<c:if test="${empty userList}">
			<center>No data found</center>
		</c:if>
	</div>
	
</body>
</html>