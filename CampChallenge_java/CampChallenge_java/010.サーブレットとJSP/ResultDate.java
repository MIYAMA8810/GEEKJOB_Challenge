/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.Serializable;
/**
 *
 * @author MIYAMA HAYATO
 */
public class ResultDate implements Serializable {
    
    // フィールド宣言、カプセル化
    private String luck = "";
    
    // デフォルトコンストラクタ
    public ResultDate() {
        
    }
    
    // セッターゲッター
    public void setLuck(String l) {
        
        this.luck = l;
    }
    
    public String getLuck() {
        
        return this.luck;
    }
    
}
