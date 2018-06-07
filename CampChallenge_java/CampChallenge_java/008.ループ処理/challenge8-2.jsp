<%-- 
    Document   : challenge8-2
    Created on : 2018/06/07, 11:28:26
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
            String code = "";
            
            // 繰り返し処理
            for(int i = 0; i < 30; i++) {
                
            // "A"を格納していく
                code += "A";
            }
            
            // 結果の表示
            out.print(code);
            
        %>
    </body>
</html>
