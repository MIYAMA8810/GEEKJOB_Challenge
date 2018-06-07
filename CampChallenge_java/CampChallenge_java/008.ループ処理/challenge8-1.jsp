<%-- 
    Document   : challenge8-1
    Created on : 2018/06/07, 11:02:45
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
            long total = 1L;
            
            // 繰り返し処理
            for(int i = 0; i < 20; i++) {
                
                // 8をかけて代入
                total *= 8;
            }
        
            //  計算結果の表示
            out.print("8の20乗は:" + total);
            
            
        %>
    </body>
</html>
