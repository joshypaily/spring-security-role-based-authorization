

<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html >
    <head>
        <title>Login</title>
       
		<spring:url value="../resources/css/loginStyle.css" var="styleCss"></spring:url>
		<link rel="stylesheet" href="${styleCss}">
      
    </head>
    <body class="text-center">
    
    
  <form class="center " action="/login" method="POST">
    <div class="imgcontainer">
    
      <img src="../resources/img/user.png" alt="Avatar" class="avatar">
    </div>

    <div class="container">
      <label for="username"><b>Username</b></label>
      <input type="text" placeholder="Enter Username" name="username" required>

      <label for="password"><b>Password</b></label>
      <input type="password" placeholder="Enter Password" name="password" required>
        
      <button type="submit">Login</button>
      <br>
      <center><a href="/signUpPage">Sign Up</center>
      
    </div>

    
  </form> <%-- 
<br><br>
        <div layout:fragment="content">
            <form class="form-signin" th:action="@{/login}" method="post">
                <img class="mb-4" src="../resources/img/user.png" alt="" width="72" height="72" />
                <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
                <div th:if="${param.error}">
                    Invalid email and password.
                </div>
                <div th:if="${param.logout}">
                    You have been logged out.
                </div>
                <label for="inputEmail" class="sr-only">Email address</label>
                <input type="text" name="username" id="inputEmail" class="form-control" placeholder="Email" required="" />
                <label for="inputPassword" class="sr-only">Password</label>
                <input type="password" name="password" id="inputPassword" class="form-control" placeholder="Password" required="" />
                <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
            </form>
            <form class="form-signin" th:action="@{/signup}" method="get">
                <button class="btn btn-md btn-success btn-block" type="Submit">Signup Here</button>
            </form>
        </div>
         --%>
  
    </body>
</html>