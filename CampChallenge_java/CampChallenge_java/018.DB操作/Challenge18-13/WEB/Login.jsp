<%-- 
    Document   : Login
    Created on : 2018/07/13, 10:31:03
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    // if文の条件で使用
    String name = "";
    
    // sessionの値で条件処理
    if(session.getAttribute("user") != null) {
        name = (String) session.getAttribute("user");
        session.invalidate();
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ログイン画面jsp</title>
    </head>
    <body>
        ログイン画面<br>
        <%if(name.equals("")) { %>
            ユーザー名とパスワードを入力してください<br>
        <% } else { %>
            <font color="red">ユーザー名、パスワードが違います！</font>
        <% } %>

        <form action="./LoginServlet" method="get">
            ユーザー名：<input type="text" name="name"><br>
            パスワード：<input type="text" name="password"><br>
            <input type="submit" name="submit" value="ログイン">
        </form>
    </body>
</html>
