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
public class Challenge18Insert {
    
    // メインメソッド
    public static void main(String[] args) throws SQLException {
        
        // DBManagerクラスのインスタンス生成
        Challenge18DBManager db = new Challenge18DBManager();
        
        // コネクションの取得
        Connection con = db.getConnection();
        
        //PreparedStatementの取得
        PreparedStatement ps = con.prepareStatement("INSERT INTO user(userID, name, tell, age, birthday, departmentID, stationID)" 
                                                  + " VALUES(?, ?, ?, ?, ?, ?, ?);");
        
        // 日付の設定
        Date date = Date.valueOf("1992-01-01");
        
        // プレースホルダーの値の設定
        ps.setInt(1, 6);
        ps.setString(2, "剛田 武");
        ps.setString(3, "090-0101-0202");
        ps.setInt(4, 18);
        ps.setDate(5, date);
        ps.setInt(6, 3);
        ps.setInt(7, 1);
        
        // SQL文の実行
        ps.executeUpdate();
        
        // クローズ処理
        con.close();
        ps.close();
    }
}
