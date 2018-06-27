/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.challenge.servlet;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author guest1Day
 */
public class Challenge15TimeStanp3 {
    
    // メインメソッド
    public static void main(String[] args) {
        
        // Calenderクラスのインスタンス生成
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        
        // それぞれに日付を設定
        c1.set(2015, 0, 1, 0, 0, 0);
        c2.set(2015, 11, 31, 23, 59, 59);
        
        // Dateクラスのインスタンスを生成し、Calendarクラスのインスタンスから取得
        Date d1 = c1.getTime();
        Date d2 = c2.getTime();
        
        // タイムスタンプの差を表示
        System.out.println(difference(d1, d2));
    }
    
    // タイムスタンプの差を計算して返すメソッド
    static long difference(Date d1, Date d2) {
        
        // 受け取った引数の値の大きさによって、計算の順番を入れ替える(-xxxxの表記を避けるため)
        if(d1.getTime() > d2.getTime()) {
            
            return d1.getTime() - d2.getTime();
            
        } else {
            
            return d2.getTime() - d1.getTime();
        }
    }
}