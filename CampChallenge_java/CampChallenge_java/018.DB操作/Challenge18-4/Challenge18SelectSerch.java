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
public class Challenge18SelectSerch {
    
    // メインメソッド
    public static void main(String[] args) {
        
        // DBManagerクラスのインスタンス生成
        Challenge18DBManager db = new Challenge18DBManager();
        
        // コネクションの取得
        //Connection con = db.getConnection();
        
        // try-with-resources文の練習
        
        // 例外処理
        try(Connection con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM profiles WHERE profilesID = 1")){
            
            // PreparedStatementの取得
            //PreparedStatement ps = con.prepareStatement("SELECT * FROM profiles WHERE profilesID = 1");
            
            // ResultSetに情報の格納
            //ResultSet rs = ps.executeQuery();
            
            // 取得した情報の表示
            while(rs.next()) {
                
                System.out.print(rs.getInt("profilesID") + " ");
                System.out.print(rs.getString("name") + " ");
                System.out.print(rs.getString("tel") + " ");
                System.out.print(rs.getInt("age") + " ");
                System.out.println(rs.getDate("birthday") + " ");
            }
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
