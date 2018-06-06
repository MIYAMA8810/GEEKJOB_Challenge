<%-- 
    Document   : challenge5-1
    Created on : 2018/06/06, 15:39:59
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
            // 変数宣
            int num = 3;
            
            // 条件分岐
            // 変数の値が1の場合
            if(num == 1) {
                
                out.print("1です！");
                
            // 変数の値が2の場合
            } else if(num == 2) {
                
                out.print("プログラミングキャンプ！");
            // それ以外の場合    
            } else {
                
                out.print("その他です！");
                
            }
        
        %>
    </body>
</html>
