/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.challenge.servlet;
/**
 *
 * @author guest1Day
 */
public class Challenge13Class1 {
    
    public static void main(String[] args) {
        
        // Accountクラスのインスタンス生成
        Account acc = new Account();
        
        // Accountクラスのメソッドの使用
        acc.setData("深山", 30000);
        
        // Accountクラスのメソッドの使用
        acc.profile();
        
        // Tanakaクラスのインスタンス生成
        Tanaka ta = new Tanaka();
        
        // TanakaクラスはAccountクラスを継承しているので、setDataメソッドを使用可能
        ta.setData("田中", 15000);
        ta.profile();
        
        // Tanakaクラスで定義されているメソッドの使用
        ta.clear();
        
        // 再び表示
        ta.profile();
        
        
    }

    
    
    
    
    
    
}
