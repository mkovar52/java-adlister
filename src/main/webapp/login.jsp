<%--
  Created by IntelliJ IDEA.
  User: mkovar
  Date: 8/20/18
  Time: 12:23 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page import="java.util.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%

//    this block ensures the logic is NOT run until to check the information UNTIL the user clicks submits (POSTS)
    if (request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")) {
            response.sendRedirect("/profile.jsp");
        }
    }

%>

<!doctype html>
<html>
    <head>
        <jsp:include page="partials/head.jsp">
            <jsp:param name="title" value="Please Log In" />
        </jsp:include>
    </head>
<body>
    <%@ include file="partials/navbar.jsp" %>
    <h1>Please login to access your account below.</h1>

    <form method="POST" action="/login.jsp">
        <label for="username">Username:</label>
        <input id="username" name="username" placeholder="Enter your username"/>

        <label for="password">Password:</label>
        <input id="password" name="password" type="password" placeholder="Enter your password"/>
        <button type="submit">Login</button>
        <%-- displaying values entered into form --%>
        <%--<h1><%= username %></h1>--%>
        <%--<h1><%= password %></h1>--%>
    </form>
</body>
</html>
