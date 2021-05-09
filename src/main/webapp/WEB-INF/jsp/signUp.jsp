<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
    <spring:url value="../resources/css/signUpStyle.css" var="styleCss"></spring:url>
    <link rel="stylesheet" href="${styleCss}">
</head>
<body>

<form action="/signUp" style="border:1px solid #ccc" class="center" method="POST"> 
  <div class="container">
    <h1>Sign Up</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>

    <label for="username"><b>Username</b></label>
    <input type="text" placeholder="Enter username" name="username" required>

    <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>

<!--     <label for="psw-repeat"><b>Repeat Password</b></label>
    <input type="password" placeholder="Repeat Password" name="psw-repeat" required> -->
    
    <label for="role"><b>Select role</b></label>&nbsp;&nbsp;&nbsp;&nbsp;
    <select id="roleDropMenu" name="role">
      <option value="user">User</option>
      <option value="admin">Admin</option>
    </select>

    <div class="clearfix">
      <button type="submit" class="signupbtn">Sign Up</button>
    </div>
  </div>
</form>

</body>
</html>