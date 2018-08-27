<%--
  Created by IntelliJ IDEA.
  User: mkovar
  Date: 8/24/18
  Time: 1:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Register Account" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />
<div class="container">
    <h1 class="text-center">Welcome! Register Your Account Here:</h1>
        <form action="/register" method="POST">
            <div class="form-group">
                <label for="username">Username: </label>
                <%--pattern="[a-zA-Z0-9]" didnt work correctly--%>
                <input type="text" id="username" name="username" class="form-control">

                <label for="email">Email: </label>
                <input type="email" id="email" name="email" class="form-control" placeholder="xxxxx@xxxxx.com" >

                <label for="password">Password: </label>
                <input id="password" name="password" class="form-control" type="password">
            </div>
            <br>
            <input type="submit" class="btn btn-primary btn-block" value="Register Now">
        </form>
    </div>
</body>
</html>
