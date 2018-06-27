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
public class Challenge15String3 {
    
    // メインメソッド
    public static void main(String[] args) {
        
        // 変数の宣言、値の格納
        String str = "きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";
        
        // 文字列の表示
        System.out.println((str.replace("U", "う").replace("I", "い")));
    }
}
