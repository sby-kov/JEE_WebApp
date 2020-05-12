<%--
  Created by IntelliJ IDEA.
  User:  Marina
  Дата:  08.05.2020
  Время: 21:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ПЕРВЫЙ JSP</title>
</head>
<body>
<h1>Проверка JSP</h1>
<p>
    <%= "Приветы всем-всем! " %>
    <%= new java.util.Date() %>
</p>
<p>
    <%= "<h3>" + "Посложнее..." + "</h3>" %>
    <%@ page import="logic.TestClass" %>
    <%
        TestClass tc = new TestClass();
        String myString = tc.getInfo();
        java.util.Date now = new java.util.Date();
        String nowString = "Текущая дата : " + now;
    %>
    <%= "<p>" + "импоритровано из класса: " + myString + "</p>" %>

    <%= "<p>" + nowString + "</p>" %>
</p>
<p>
    <%= "<h3>" + "Session: корзина cart..." + "</h3>" %>
    <%@ page import="logic.TestClass" %>
    <%
/*      для корзины создаем класс Cart в пакете Utils
        TestClass tc = new TestClass();
        String myString = tc.getInfo();
        java.util.Date now = new java.util.Date();
        String nowString = "Текущая дата : " + now;
*/
    %>
    <%= "<p>" + "импоритровано из класса: " + myString + "</p>" %>

    <%= "<p>" + nowString + "</p>" %>
</p>
<%-- пока закоментим
<p>
    <%= "<h3>" + "<p>" + "Переменная out для вывода без '=' : " + "</p>" + "</h3>" %>
    <%
        // вкрапления java в код html
        for (int i=0; i<8; i++) {
            out.println(" -> вывод : " + i );
        }
        for (int i=0; i<5; i++) {
            out.println("<p> вывод : " + i +"</p>");
        }
    %>
</p>
--%>
</body>
</html>
