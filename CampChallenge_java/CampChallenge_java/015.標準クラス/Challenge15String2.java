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
public class Challenge15String2 {
    
    // メインメソッド
    public static void main(String[] args) {
        
        // 変数の宣言、値の格納
        String address = "aiueo@gmail.com";
        
        // 「＠」以降の文字数の表示
        System.out.println((address.substring(address.indexOf("@"))).length());
    }
}
