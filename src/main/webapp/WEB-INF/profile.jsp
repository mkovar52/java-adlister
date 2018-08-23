<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="../partials/navbar.jsp" />

    <div class="container">
        <h1>Welcome to your profile page, ${sessionScope.user}!</h1>
    </div>
    <%--<button>Logout</button>
    better UX to have this option here?--%>

</body>
</html>
