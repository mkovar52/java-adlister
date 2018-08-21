<%--
  Created by IntelliJ IDEA.
  User: mkovar
  Date: 8/21/18
  Time: 10:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color JSP</title>
</head>
<body>


<form action="/pickcolor" method="POST">
    <div class="form-group">
        <input type="radio" name="color" class="form-control" value="red"> Red <br>
        <input type="radio" name="color" class="form-control" value="green"> Green <br>
        <input type="radio" name="color" class="form-control" value="blue"> Blue <br>
        <input type="radio" name="color" class="form-control" value="papyawhip"> Papayawhip <br>
    </div>
    <input type="submit" class="btn btn-primary btn-block" value="submit">
</form>

</body>
</html>
