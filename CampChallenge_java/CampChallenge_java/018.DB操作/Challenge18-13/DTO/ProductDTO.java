/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.io.Serializable;

/**
 *
 * @author guest1Day
 */
public class ProductDTO implements Serializable {
    
    // フィールド
    private int productCode = 0;
    private String name = "";
    
    // setter、getter
    public void setProductCode(int code) {
        this.productCode = code;
    }
    
    public int getProductCode() {
        return this.productCode;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
}
