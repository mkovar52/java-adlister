<%@ page import="java.util.Random" %><%--
  Created by IntelliJ IDEA.
  User: mkovar
  Date: 8/21/18
  Time: 11:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%-- listens for user to click "get" request button to try again, redirects to /guess.jsp--%>
<%

    if (request.getMethod().equalsIgnoreCase("get")) {
        request.getRequestDispatcher("/guess.jsp").forward(request, response);
    }

%>

<html>
<head>
    <title>Result JSP Page</title>
</head>
<body>
    <h1>You guessed: ${userGuess}</h1>
    <%--shows the randomly generated number--%>
    <%--<h1>Correct Number is: ${correctNumber}</h1>--%>
    <h1> Message is: ${message}</h1>
    <form method="get" action="/guess">
        <button>try again</button>
    </form>
</body>
</html>
