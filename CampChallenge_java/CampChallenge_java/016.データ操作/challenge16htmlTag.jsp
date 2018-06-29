<%-- 
    Document   : challenge16htmlTag
    Created on : 2018/06/28, 13:03:59
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>challenge16htmlTag</title>
    </head>
    <body>
        <h3>先ほど入力していただいた内容</h3>
        <%
            // 受け取るパラメータの文字コードの設定
            request.setCharacterEncoding("UTF-8");
            
            // テキストボックス(名前)の情報の表示
            out.print("名前：" + request.getParameter("name") + "<br>");
            
            // テキストボックス(年齢)の情報の表示
            out.print("年齢：" + request.getParameter("age") + "<br>");

            // ラジオボタンの情報の表示
            out.print("性別：" + request.getParameter("sex") + "<br>");
        
            // セレクトエリアの情報の表示
            out.print("業種：" + request.getParameter("job") + "<br>");
            
            // セレクトエリアの情報の表示
            out.print("業種：" + request.getParameter("other") + "<br>");
        %>
    </body>
</html>
