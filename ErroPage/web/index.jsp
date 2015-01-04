<%-- 
    Document   : index
    Created on : Jan 4, 2015, 4:08:40 PM
    Author     : anand
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="check" method="post">
            user name: <input type="text" name="usr" value="${param.usr}"/>
            <font color="red">${err}</font>
            <font color="green">${info}</font>
        </form>
    </body>
</html>
