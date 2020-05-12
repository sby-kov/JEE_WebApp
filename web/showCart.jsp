<%--
  Created by IntelliJ IDEA.
  User:  Marina
  Дата:  12.05.2020
  Время: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="pckUtils.Cart" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Показ корзины cart </title>
</head>
<body>
    <%  Cart cart = (Cart) session.getAttribute("cart"); %>
    <p> Наименование: <%= cart.getName() %> </p>
    <p> Количество:   <%= cart.getQuantity() %> </p>
</body>
</html>
