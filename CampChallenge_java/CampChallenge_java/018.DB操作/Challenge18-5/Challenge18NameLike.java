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
public class Challenge18NameLike {
    
    // メインメソッド
    public static void main(String[] args) {
        
        // DBManagerクラスのインスタンス生成
        Challenge18DBManager db = new Challenge18DBManager();
        
        // 例外処理
        try(Connection con = db.getConnection();
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM profiles WHERE name LIKE ?");
            ){
            
            // プレースホルダーの値の設定
            pstmt.setString(1, "%茂%");
            
            // SQLの実行
            ResultSet rs = pstmt.executeQuery();
                    
            // 取得した情報の表示
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
