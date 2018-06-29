<%-- 
    Document   : print
    Created on : 2018/06/28, 10:37:00
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Challenge16printjsp</title>
    </head>
    <body>
        <%
            // 受け取るパラメータの文字コードの設定
            request.setCharacterEncoding("UTF-8");
            
            // テキストボックスの情報の表示
            out.print("名前：" + request.getParameter("txtName") + "<br>");
            
            // ラジオボタンの情報の表示
            out.print("性別：" + request.getParameter("sex") + "<br>");
            
            // テキストエリアの情報の表示
            out.print("趣味：" + request.getParameter("hobbyText"));
        %>
    </body>
</html>
