<%-- 
    Document   : challenge4-1
    Created on : 2018/06/06, 15:23:48
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            // 変数宣言、それぞれ代入
            String groove = "groove";
            String cen = "-";
            String gear = "gear";
            
            // 表示
            out.print(groove + cen + gear);
       
        %>
    </body>
</html>
