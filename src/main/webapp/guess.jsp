<%--
  Created by IntelliJ IDEA.
  User: mkovar
  Date: 8/21/18
  Time: 11:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess Page</title>
</head>
<body>
    <h1>Guess a number between 1-100</h1>
    <form action="/guess" method="POST">
        <div class="form-group">
            <label for="userGuess">name</label>
            <input type="number" min="1" max="100" id="userGuess" name="userGuess" class="form-control">
        </div>
        <input type="submit" class="btn btn-primary btn-block" value="submit">
    </form>
</body>
</html>
