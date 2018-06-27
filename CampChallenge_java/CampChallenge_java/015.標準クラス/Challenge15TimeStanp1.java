/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.challenge.servlet;

import java.util.Date;
import java.util.Calendar;
/**
 *
 * @author guest1Day
 */
public class Challenge15TimeStanp1 {
    
    // メインメソッド
    public static void main(String[] args) {
        
        // Calendarクラスのインスタンス生成
        Calendar c = Calendar.getInstance();
        
        // 2016年1月1日 0時0分0秒を指定
        c.set(2016, 0, 1, 0, 0, 0);
        
        // Dateクラスのインスタンスを生成し、Calendarクラスのインスタンスから取得
        Date d = c.getTime();
        
        // 指定した日付のタイムスタンプの表示
        System.out.println(d.getTime());
    }
}
