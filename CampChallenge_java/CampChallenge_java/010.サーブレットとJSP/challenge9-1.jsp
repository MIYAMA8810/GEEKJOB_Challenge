<%-- 
    Document   : challenge9-1
    Created on : 2018/06/07, 18:27:45
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="org.camp.servlet.ResultDate" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
            // リクエストスコープから値の受け取り
            ResultDate date = (ResultDate)request.getAttribute("DATE");
        %>
        
    </head>
    <body>
        <%
            //結果表示
            out.print("今日の運勢は・・・" + date.getLuck() + "<br>");
            out.print("ただ今の時間は・・" + request.getAttribute("TIME"));
        %>
    </body>
</html>
