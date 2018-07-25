/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionManager;
import java.sql.*;
import DTO.AdminUserDTO;

/**
 *
 * @author guest1Day
 */
public class AdminUserDAO {
    
    // ログイン処理に使用するメソッド
    public AdminUserDTO Login(String name, String password) {
        
        // DTOクラスのインスタンス格納用
        AdminUserDTO adminUser = new AdminUserDTO();
        
        // 入力された情報が一致しているレコードを探す
        try(Connection con = ConnectionManager.getConnection();
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM adminUser WHERE name = ? AND password = ?;")){
            
            // フォームから送信された情報をプレースホルダに設定
            pstmt.setString(1, name);
            pstmt.setString(2, password);
            
            // SQLの実行
            ResultSet rs = pstmt.executeQuery();
            
            // 取得した情報の格納
            while(rs.next()) {
                
                adminUser.setName(rs.getString("name"));
                adminUser.setPassword(rs.getString("password"));

            }
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
        
        // 情報を格納したインスタンスを返す
        return adminUser;
    }
    
}
