/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.challenge.servlet;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author guest1Day
 */
public class Challenge15Calendar1 {
    
    // メインメソッド
    public static void main(String[] args) {
        
        // Dateクラスのインスタンス生成
        Date now = new Date();
        
        // SimpleDateFormatクラスのインスタンス生成
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
        
        // 表示処理
        System.out.println(sdf.format(now));
    }
}
