<%-- 
    Document   : query_string_output
    Created on : 2018/06/28, 16:58:47
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>購入処理</title>
    </head>
    <body>
        <h2>購入情報を入力してください</h2>
        <div>
            <form action="query_string_output.jsp" method="get">
                購入商品の総額：<input type="text" name="total" maxlength="1000"><br>
                購入商品の数量：<input type="text" name="count" size="20" maxlength="800"><br>
                商品種別　　　：<select name="type">
                    <option value="雑貨">1,雑貨</option>
                    <option value="生鮮食品">2,生鮮食品</option>
                    <option value="その他">3,その他</option>
                </select><br>
                <input type="submit" name="submit" value="決定">
                <input type="reset" name="reset" value="リセット">
            </form>
        </div>
        
        <br>
        <hr>
        <br>
        
        <div>
            <%
                // 受け取るパラメータの文字コードの設定
                request.setCharacterEncoding("UTF-8");
              
                // データを送信する前は表示しない
                if(request.getParameter("submit") != null){

                    // 購入商品総額の表示
                    out.print("購入総額：" + request.getParameter("total") + "<br>");
                    
                    // 購入商品数量の表示
                    out.print("購入数量：" + request.getParameter("count") + "<br>");
                    
                    // 商品種別の表示
                    out.print("商品種別：" + request.getParameter("type") + "<br>");
                    
                    // String型をint型に変換
                    int total = Integer.parseInt(request.getParameter("total"));
                    int count = Integer.parseInt(request.getParameter("count"));
                    
                    // 商品単価の計算、表示
                    out.print("商品単価：" + total / count + "<br><br>");
                    
                    // 獲得ポイントの表示
                    out.print("獲得ポイント：");
                    if(total > 5000) {
                        
                        out.print((total / 100) * 5);
                        
                    } else if(total > 3000) {
                        
                        out.print((total / 100) * 4);
                    }
                }

            %>
        </div>
    </body>
</html>
