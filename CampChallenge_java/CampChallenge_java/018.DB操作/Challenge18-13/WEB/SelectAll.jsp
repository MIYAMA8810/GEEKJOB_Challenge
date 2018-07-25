<%-- 
    Document   : SelectAll
    Created on : 2018/07/20, 16:15:30
    Author     : guest1Day
--%>

<%@page import="java.util.ArrayList"
        import="DTO.ProductDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    // セッションに格納した商品情報を取得
    ArrayList<ProductDTO> allProduct = (ArrayList<ProductDTO>) session.getAttribute("allProduct");
 
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>商品一覧表示画面</title>
    </head>
    <body>
        <h3>商品一覧</h3>
         商品コード：商品名<br>
         <br>
         
        <%
            // セッションから取得した情報の全件表示
            for(ProductDTO product:allProduct){
                
                // 表示間隔を揃える
                if(product.getProductCode() < 10) {
                    out.print(product.getProductCode() + " ：");
                } else {
                    out.print(product.getProductCode() + ": ");
                }
                
                out.print(product.getName() + "<br>");
            }
        %>
        
        <hr>
        
        <form action="./Menyu.jsp">
            <input type="submit" name="submit" value="メインメニュー">
        </form>
    </body>
</html>
