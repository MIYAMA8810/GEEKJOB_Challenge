/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.challenge.servlet;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author guest1Day
 */
public class Challenge15TimeStanp2 {
    
    // メインメソッド
    public static void main(String[] args) {
        
        // Calenderクラスのインスタンス生成
        Calendar c = Calendar.getInstance();
        
        // SimpleDateFormatクラスのインスタンス生成、表示形式の指定
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        // 2016年11月4日 10時0分0秒を指定
        c.set(2016, 10, 4, 10, 0, 0);
        
        // Dateクラスのインスタンスを生成し、Calendarクラスのインスタンスから取得
        Date d = c.getTime();
        
        // タイムスタンプの表示
        System.out.println(d.getTime());
        
        // 取得したタイムスタンプの情報をフォーマットの形式で表示
        System.out.println(sdf.format(d));
    }
}
