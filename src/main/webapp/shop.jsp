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
</head>
<body>
<%
    String login=(String) session.getAttribute("login");
    if(CarController.carList.isEmpty()){ CarController.init();}
%>
Welcome dear <%=login%>!

<%=CarController.showAllCars()%>

</body>
</html>