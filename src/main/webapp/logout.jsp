<%@ page import="com.market.UserController" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome!</title>
    <link type="text/css" rel="stylesheet" href="style.css">
</head>
<body style="text-align: center;">


<%  session.removeAttribute("login"); %>


<script language="JavaScript">
    window.location.href = "index.jsp"
</script>



</body>
</html>