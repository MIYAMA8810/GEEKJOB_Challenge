<%-- 
    Document   : challenge6-1
    Created on : 2018/06/06, 17:24:13
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
        <%@page import="java.util.ArrayList" %>
        <%
            // 変数宣言
            String[] array = new String[7];
            
            // 値の代入
            array[0] = "10";
            array[1] = "100";
            array[2] = "soeda";
            array[3] = "hayashi";
            array[4] = "-20";
            array[5] = "118";
            array[6] = "END";
            
            // 表示処理
            for(int i = 0; i < 7; i++){
                
                out.print(array[i] + "<br>");
            }
        
            // 宣言
            ArrayList<String> array2 = new ArrayList<String>();
            
            // 代入
            array2.add("10");
            array2.add("100");
            array2.add("soeda");
            array2.add("hayashi");
            array2.add("-20");
            array2.add("118");
            array2.add("END");
            
            // 表示処理
            for(int i = 0; i < 7; i++) {
                
                out.print(array2.get(i) + "<br>");
            }
        
        %>
    </body>
</html>
