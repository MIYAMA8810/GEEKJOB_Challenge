/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.challenge.servlet;

import java.sql.*;

/**
 *
 * @author guest1Day
 */
public class Challenge18DBManager {
    
    // DB接続取得の値
    public static final String url = "jdbc:mysql://localhost:3306/challenge_db";
    public static final String user = "GEEKJOB";
    public static final String password = "password";
    
    // コネクションの取得
    public static Connection getConnection() {
        
        // Connection変数の宣言
        Connection con = null;
        
        // 例外処理
        try {
            // jdbcドライバのインスタンス生成
            Class.forName("com.mysql.jdbc.Driver");
            
            // DBへの接続
            con = DriverManager.getConnection(url, user, password);
            
        } catch(ClassNotFoundException e) {
            
            e.printStackTrace();
        } catch(SQLException e) {
            
            e.printStackTrace();
        }
        
        // 取得した接続を返す
        return con;
    } 
    
    // ゲッター(try-with-resourcesの練習で使用)
    public String getUrl() {
        
        return this.url;
    }
    
    public String getUser() {
        
        return this.user;
    }
    
    public String getPassword() {
        
        return this.password;
    }
}
