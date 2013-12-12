<%@ page import="com.market.CarController" %>
<%--
  Created by IntelliJ IDEA.
  User: Vlad
  Date: 11.12.13
  Time: 1:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <link type="text/css" rel="stylesheet" href="style.css">
</head>
<body>
<%
    String login=(String) session.getAttribute("login");

%>
<div id="content">
Welcome dear <%=login%>!
<a href="buy.jsp"><img height="25px" src="img/images.jpg"></a><br>
    <a href="logout.jsp" class="lo">LOGOUT</a>

<%=CarController.showAllCars()%>
</div>
</body>
</html>