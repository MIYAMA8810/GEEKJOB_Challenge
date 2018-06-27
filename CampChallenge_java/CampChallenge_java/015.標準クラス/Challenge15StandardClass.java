/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.challenge.servlet;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author guest1Day
 */
public class Challenge15StandardClass {
    
    // メインメソッド
    public static void main(String[] args) throws IOException {
        
        // Calendarクラスのインスタンス生成
        Calendar cs = Calendar.getInstance();
        
        // Dateクラスのインスタンスを生成し、Calendarクラスのインスタンスから取得
        Date d = cs.getTime();
        
        // SimpleDateFormatクラスのインスタンス生成
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        
        // Scannerクラスのインスタンス生成
        Scanner scan = new Scanner(System.in);
        
        // Fileクラスのインスタンス生成
        File fp = new File("/Users/guest1Day/Documents/ChallengeEmp.text");
        File fl = new File("/Users/guest1Day/Documents/Log.text");      // ログの書き込みに使います
        
        // FileWriterクラスのインスタンス生成
        FileWriter fw = new FileWriter(fp, true);
        FileWriter fwl = new FileWriter(fl, true);
        
        // FileReaderクラスのインスタンス生成
        FileReader fr = new FileReader(fp);

        // BufferedReaderクラスのインスタンス生成
        BufferedReader br = new BufferedReader(fr);
        
        // ログファイルに時間と内容を記入
        fwl.write("処理内容：従業員登録\t");
        fwl.write(sdf.format(d.getTime()) + "～");
 
        // 文字列型の変数宣言
        String str = "";
        
        // ファイルの内容を表示
        while(str != null) {
            
            // ファイルの内容の取得
            str = br.readLine();
            
            // nullの場合は表示をしない
            if(str != null) {
                
                // 表示処理
                System.out.println(str);
            }
        }
        
        // メッセージ表示
        System.out.println("登録する名前をローマ字で入力してください");
        
        // 入力処理
        fw.write(scan.next() + "\r\n");
        
        // 処理終了メッセージ
        System.out.println("処理を終了します");
        
        // Calendarクラスのインスタンス生成
        Calendar ce = Calendar.getInstance();
        
        // DateクラスのインスタンスにCalendarクラスのインスタンスから取得
        d = ce.getTime();
        
        // ログファイルに終了時間の表示
        fwl.write(sdf.format(d.getTime()) + "\r\n");
        
        // クローズ処理
        br.close();
        fw.close();
        fwl.close();
    }
}