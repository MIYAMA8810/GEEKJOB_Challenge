<%-- 
    Document   : challenge5-2
    Created on : 2018/06/06, 16:45:52
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
            int num = 5;
            
            // 条件分岐
            switch(num) {
                
                case 1:
                    out.print("one");
                    
                    break;
                    
                case 2:
                    out.print("two");
                    
                    break;
                    
                default:
                    out.print("想定外");
            }
        
        
        %>
    </body>
</html>
