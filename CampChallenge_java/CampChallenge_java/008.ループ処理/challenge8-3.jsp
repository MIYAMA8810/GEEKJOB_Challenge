<%-- 
    Document   : challenge8-3
    Created on : 2018/06/07, 11:32:00
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
            int total = 0;
            
            // 繰り返し処理
            for(int i = 1; i <= 100; i++) {
                
                // 加算して代入
                total += i;
            }
        
            // 結果表示
            out.print("計算結果:" + total);
        
        %>
    </body>
</html>
