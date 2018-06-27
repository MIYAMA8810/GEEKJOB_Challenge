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
public class Challenge15File1 {
    
    // メインメソッド
    public static void main(String[] args) throws IOException {
        
        // Fileクラスのインスタンス生成
        File fp = new File("/Users/guest1Day/Documents/ChallengeIntro.text");
        
        // FileWriterクラスのインスタンス生成
        FileWriter fw = new FileWriter(fp);
        
        // 書き込み処理
        fw.write("こんにちは、深山と申します。趣味で釣りをやってます。よろしくお願いします。");
        
        // クローズ処理
        fw.close();
    }
    
}
