/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.challenge.blackjack;

import java.util.ArrayList;

/**
 *
 * @author MIYAMA HAYATO
 */
public class User extends Human {
       
    // Dealerからもらったカードを手札に追加するメソッド
    @Override
    public void setCard(ArrayList<Integer> card) {
        
        // 引数で受け取ったリストから、引いたカードを手札に追加する
        for(int c : card) {
            
            // 値を格納する処理
            myCard.add(c);
        }
    }
    
    // 手札の合計値を計算し、結果を返すメソッド
    @Override
    public int open() {
        
        // 変数宣言
        int total = 0;
        
        // 手札の合計値を計算する処理
        for(int c : myCard) {
            
            // 10より大きい場合は10として扱う
            if(c > 10) {
                
                c = 10;
            }
            
            // 合計値の計算
            total += c;
        }
        
        // 合計値を返す
        return total;
    }
    
    // まだカードを引くか判断するメソッド
    @Override
    public boolean checkSum() {
        
        // 合計値が17未満ならtrue、17以上ならfalseを返す処理
        if(open() < 17) {
            
            return true;
        } else {
            
            return false;
        }
    }
    
    // hitかstandか引数によって判断するメソッド
    public boolean choice(String key) {
             
        // keyの値によって返す値の変更
        switch(key) {
            
            // "h"が入力された場合
            case "h":
                
                return true;
                
            // "s"が入力された場合
            case "s":

                return false;
    
            // それ以外が入力された場合
            default:

                // メッセージの表示
                System.out.println("System「入力されたキーが正しくありません。Standします」");
                return false;
        }
    }
    
    // 手札のカードを表示するメソッド
    public void handOpen() {
        
        // myCardから1枚ずつ表示
        for(int card : myCard) {
            
            //表示処理
            System.out.print("[" + card + "] ");
        }
    }
    
    // 最後に引いたカードを表示するメソッド
    public void hitCard() {
        
        System.out.println("HitCard-----[" + myCard.get(myCard.size() - 1) + "]");
    }
}
