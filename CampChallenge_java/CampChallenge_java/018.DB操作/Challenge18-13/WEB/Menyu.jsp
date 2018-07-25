<%-- 
    Document   : Menyu
    Created on : 2018/07/12, 13:26:08
    Author     : guest1Day
--%>

<%@page import="DTO.AdminUserDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    // セッションに格納されているログインしたユーザー情報を取得
    AdminUserDTO loginUser = (AdminUserDTO) session.getAttribute("loginUser");
    
    // ログインしたユーザーのname情報を取得
    String name = loginUser.getName();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>メニュー画面</title>
    </head>
    <body>
        <h1>こんにちは<%=name%>さん</h1>
        
        <form action="./SelectAllServlet" method="get">
            <input type="submit" name="SelecAll" value="商品一覧">
        </form>
        
        <form action="./Insert.jsp">
            <input type="submit" name="Insert" value="商品登録">
        </form>
        
        <form action="./Login.jsp">
            <input type="submit" name="Logout" value="ログアウト">
        </form>
    </body>
</html>
