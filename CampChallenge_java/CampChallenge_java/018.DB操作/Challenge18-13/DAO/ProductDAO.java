/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionManager;
import DTO.ProductDTO;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author guest1Day
 */
public class ProductDAO {
    
    // 商品情報追加の処理に使うメソッド
    public int Insert(String name) {
        
        // 戻り値を設定する変数の宣言
        int execute = 0;
        
        // 入力された商品名を登録する処理
        try(Connection con = ConnectionManager.getConnection();
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO product(name) VALUES(?);")){
            
            // フォームから送信された情報をプレースホルダに格納
            pstmt.setString(1, name);
            
            // 空欄で送信されたら実行しない
            if(!name.equals("")) {
                
                // SQLの実行
                execute = pstmt.executeUpdate();
            }
            
        } catch(SQLException e) {
            return 0;
        }
        
        // 値にを格納した変数を返す
        return execute;
    }
    
    // 全件検索して結果を返すメソッド
    public ArrayList<ProductDTO> allSelect(){
        
        // 戻り値格納用のArrayListの宣言
        ArrayList<ProductDTO> selectResult = new ArrayList<ProductDTO>();
        
        // DB接続、全件検索、結果の取得
        try(Connection con = ConnectionManager.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM product;")){
            
            // 結果の取得、格納
            while(rs.next()) {
                
                ProductDTO result = new ProductDTO();
                result.setProductCode(rs.getInt("productCode"));
                result.setName(rs.getString("name"));
                selectResult.add(result);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return selectResult;
    }
}