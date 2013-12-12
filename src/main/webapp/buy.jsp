<%@ page import="com.market.CarController" %>
<%@ page import="com.market.UserController" %>
<%--
  Created by IntelliJ IDEA.
  User: Vlad
  Date: 11.12.13
  Time: 1:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <link type="text/css" rel="stylesheet" href="style.css">
</head>
<body>
<div id="content">
<%
    String login=(String) session.getAttribute("login");
    if(request.getParameterMap().containsKey("buy")){
        UserController.buyCar(Integer.getInteger(request.getParameter("buy")));
    }
%>
Welcome dear <%=login%>!<br><a href="logout.jsp" class="lo">LOGOUT</a>

<h3>Your cars:</h3>
<%=UserController.showMyCars()%>

<form action="shop.jsp" method="POST">
    <input type="submit" value="Back to shopping">
</form>
</div>
</body>
</html>