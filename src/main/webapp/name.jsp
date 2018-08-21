<%--
  Created by IntelliJ IDEA.
  User: mkovar
  Date: 8/21/18
  Time: 10:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Name JSP</title>
</head>
<body>
    <form action="/name" method="POST">
        <div class="form-group">
            <label for="name">name</label>
            <input id="name" name="name" class="form-control" type="text">
        </div>
        <input type="submit" class="btn btn-primary btn-block" value="submit">
    </form>
</body>
</html>
