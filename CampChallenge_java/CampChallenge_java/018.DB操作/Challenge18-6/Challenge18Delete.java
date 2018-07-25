/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.challenge.servlet;

import java.sql. *;
/**
 *
 * @author guest1Day
 */
public class Challenge18Delete {
    
    // メインメソッド
    public static void main(String[] args) {
        
        // DBManagerクラスのインスタンス生成
        Challenge18DBManager db = new Challenge18DBManager();
        
        // コネクションの取得
        Connection con = db.getConnection();
        
        // 例外処理
        try{
            // PreparedStatementの取得
            Statement stmt = con.createStatement();
            
            // SQLの実行
            stmt.executeUpdate("DELETE FROM user WHERE age = 18");
            
            // ResultSetに情報の格納
            ResultSet rs = stmt.executeQuery("SELECT * FROM user");
            
            // 取得した情報の表示
            while(rs.next()) {
                
                System.out.print(rs.getInt("userID") + " ");
                System.out.print(rs.getString("name") + " ");
                System.out.print(rs.getString("tell") + " ");
                System.out.print(rs.getInt("age") + " ");
                System.out.print(rs.getDate("birthday") + " ");
                System.out.print(rs.getInt("departmentID") + " ");
                System.out.println(rs.getInt("stationID") + " ");
            }
    
            // クローズ処理
            con.close();
            stmt.close();
            rs.close();
        
        
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
