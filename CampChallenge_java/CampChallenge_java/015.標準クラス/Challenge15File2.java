/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.challenge.servlet;

import java.io.*;

/**
 *
 * @author guest1Day
 */
public class Challenge15File2 {
    
    // メインメソッド
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        // Fileクラスのインスタンス生成
        File fp = new File("/Users/guest1Day/Documents/ChallengeIntro.text");
        
        // FileReaderクラスのインスタンス生成
        FileReader fr = new FileReader(fp);
        
        // BuffedReaderクラスのインスタンス生成
        BufferedReader br = new BufferedReader(fr);
        
        // ファイル内部の文字列の表示
        System.out.println(br.readLine());
        
        // クローズ処理
        br.close();
    }
    
}
