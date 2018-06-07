<%-- 
    Document   : challenge8-4
    Created on : 2018/06/07, 11:43:15
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
            // 変数宣言
            int total = 1000;
            
            // 繰り返し処理
            while(total > 100) {
                
                // 2で割っていく
                total /= 2;
            }
            
            // 結果表示
            out.print(total);
            
        %>
    </body>
</html>
