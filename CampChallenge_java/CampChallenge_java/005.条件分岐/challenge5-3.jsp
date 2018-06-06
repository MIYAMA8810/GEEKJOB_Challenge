<%-- 
    Document   : challenge5-3
    Created on : 2018/06/06, 16:52:07
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
            char code = 'a';
            
            // 条件分岐
            switch(code) {
                
                case 'A':
                    out.print("英語");
                    
                    break;
                    
                case 'あ':
                    out.print("日本語");
                    
            }
        %>
    </body>
</html>
