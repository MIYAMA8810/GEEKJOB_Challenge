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
public class Challenge18Update {
    
    // メインメソッド
    public static void main(String[] args) {
        
        // DBManagerクラスのインスタンス生成
        Challenge18DBManager db = new Challenge18DBManager(); 
        
        // 例外処理
        try(Connection con = db.getConnection();
            Statement stmt = con.createStatement()) {
            
            // SQL実行
            stmt.executeUpdate("UPDATE profiles SET name = '本田 悠', tel = '090-1214-3562', age = 24, "
                             + "birthday = '1993-05-22' WHERE profilesID = 1");
            
            // SQLの実行、結果の格納
            ResultSet rs = stmt.executeQuery("SELECT * FROM profiles");
            
            //結果の表示
            while(rs.next()) {
                
                System.out.print(rs.getInt("profilesID") + " ");
                System.out.print(rs.getString("name") + " ");
                System.out.print(rs.getString("tel") + " ");
                System.out.print(rs.getInt("age") + " ");
                System.out.println(rs.getDate("birthday") + " ");
            }
            
            // クローズ処理
            rs.close();
           
        } catch(SQLException e) {
            
            e.printStackTrace();
        }
    }
}
