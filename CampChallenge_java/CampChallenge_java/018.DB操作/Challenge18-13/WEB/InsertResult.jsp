<%-- 
    Document   : InsertResult
    Created on : 2018/07/19, 10:34:08
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    // 条件文に使用する変数の宣言
    int result = 0;
    
    // nullチェックをし、情報を格納
    if(session.getAttribute("InsertResult") != null) {
        
        // 更新件数をセッションから取得
        result = Integer.parseInt(session.getAttribute("InsertResult").toString());
    }
    
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>登録結果画面</title>
    </head>
    <body>
        <%if(result > 0) {%>
            登録完了しました
        <%} else {%>
            登録に失敗しました
        <%}%>
        <hr>
        <form action="./Menyu.jsp">
            <input type="submit" name="submit" value="メインメニュー">
        </form>
    </body>
</html>
