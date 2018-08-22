<%--
  Created by IntelliJ IDEA.
  User: mkovar
  Date: 8/22/18
  Time: 11:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Index of All Ads</title>
</head>
<body>
    <h1>All Ads:</h1>
    <%--<h1>${}</h1>--%>

<c:forEach var="ad" items="${ads}">
    <div class="ads">
        <h1>Title: ${ad.title}</h1>
        <h4>Description: ${ad.description}</h4>
        <p>userID: ${ad.userId}</p>
    </div>
</c:forEach>



</body>
</html>
