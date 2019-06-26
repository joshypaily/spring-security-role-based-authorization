<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script src="resources/js/student.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
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