<%-- 
    Document   : Insert
    Created on : 2018/07/18, 11:11:03
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>商品情報追加画面</title>
    </head>
    <body>
        追加する商品情報を入力してください
        <form action="./InsertServlet" method="post">
            商品名：<input type="text" name="productName" value=""><br>
            <input type="submit" name="submit" value="登録">
        </form>
        <hr>
        <form action="./Menyu.jsp">
            <input type="submit" name="submit" value="メインメニュー">
        </form>
    </body>
</html>
