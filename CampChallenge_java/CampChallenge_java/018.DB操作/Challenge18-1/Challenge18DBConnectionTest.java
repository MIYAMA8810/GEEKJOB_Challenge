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
public class Challenge18DBConnectionTest {
    
    // メインメソッド
    public static void main(String[] args) throws SQLException {
        
        // DBManagerクラスのインスタンス生成
        Challenge18DBManager db = new Challenge18DBManager();
        
        // コネクションの取得
        Connection con = db.getConnection();
        
        // 取得できているか確認表示
        System.out.print(con);
        
        // クローズ処理
        con.close();
    }
}
