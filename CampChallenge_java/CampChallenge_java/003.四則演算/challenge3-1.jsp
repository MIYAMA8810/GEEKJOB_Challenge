<%-- 
    Document   : challenge3-1
    Created on : 2018/06/06, 14:59:51
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
            // 変数宣言、格納
            final int num1 = 100;
            int num2 = 50;
            
            // 四則演算
            int add = num1 + num2;
            int sub = num1 - num2;
            int mul = num1 * num2;
            int div = num1 / num2;
            
            // それぞれ表示
            out.println("足し算" + add);
            out.println("引き算" + sub);
            out.println("掛け算" + mul);
            out.println("割り算" + div);
            
        %>
    </body>
</html>
