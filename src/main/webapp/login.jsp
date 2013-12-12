<%@ page import="com.market.UserController" %>
<%--
  Created by IntelliJ IDEA.
  com.market.User: Vlad
  Date: 10.12.13
  Time: 22:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome!</title>
    <link type="text/css" rel="stylesheet" href="style.css">
</head>
<body style="text-align: center;">


<%  String login = request.getParameter("login");
    String pass = request.getParameter("psv");
    if(request.getParameterMap().containsKey("new_user")){
    com.market.UserController.createUser(login,pass);
    }
    if(!UserController.checkLogPass(login,pass)){%>
<div id="content">
    <h1>Login or Password is incorrect</h1>
    <br>
    <a href="index.jsp"><-BACK</a>
</div>
<%} else {session.setAttribute("login",login); %>
<script language="JavaScript">
    window.location.href = "shop.jsp"
</script>
<%}%>

    <%=com.market.UserController.showUserList()%>
</body>
</html>