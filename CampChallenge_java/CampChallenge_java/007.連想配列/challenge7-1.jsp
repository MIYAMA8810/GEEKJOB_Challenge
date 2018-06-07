<%-- 
    Document   : challenge7-1
    Created on : 2018/06/07, 10:46:36
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
        <%@page import="java.util.HashMap" %>
        <%
            // HashMapの生成
            HashMap<String, String> sample = new HashMap<String, String>();

            // 値の格納
            sample.put("1", "AAA");
            sample.put("hello", "world");
            sample.put("soeda","33" );
            sample.put("20", "20");
        
        %>
    
</html>
