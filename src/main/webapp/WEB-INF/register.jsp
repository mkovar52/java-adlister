<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%

//    boolean inputErrors = username.isEmpty()
//            || email.isEmpty()
//            || password.isEmpty()
//            || (! password.equals(passwordConfirmation));


    if (request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String passwordConfirmation = request.getParameter("confirm_password");

        if (username.isEmpty()) {

        }

        if (email.isEmpty()) {

        }

        if (!password.equals(passwordConfirmation)) {

        }

    }

%>


<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Register For Our Site!" />
    </jsp:include>
</head>
<body>
    <jsp:include page="partials/navbar.jsp" />
    <div class="container">

        <c:choose>
            <c:when test=" if (username.isEmpty()) {
                    <h1>ENTER VALID USERNAME</h1>
                    }}">
                <h2>ENTER VALID USERNAME</h2>
            </c:when>
            <c:when test=" if (email.isEmpty()) {
                    <h1>ENTER VALID EMAIL</h1>
                    }}">
                <h2>ENTER VALID USERNAME</h2>
            </c:when>

            <c:otherwise>

            </c:otherwise>

        </c:choose>

        <h1>Please fill in your information.</h1>
        <form action="/register" method="post">
            <div class="form-group">
                <label for="username">Username</label>
                <input id="username" name="username" class="form-control" type="text">
            </div>
            <div class="form-group">
                <label for="email">Email</label>
                <input id="email" name="email" class="form-control" type="text">
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input id="password" name="password" class="form-control" type="password">
            </div>
            <div class="form-group">
                <label for="confirm_password">Confirm Password</label>
                <input id="confirm_password" name="confirm_password" class="form-control" type="password">
            </div>
            <input type="submit" class="btn btn-primary btn-block">
        </form>
    </div>
</body>
</html>
