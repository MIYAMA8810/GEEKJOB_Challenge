/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.challenge.blackjack;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author MIYAMA HAYTO
 */
public class Dealer extends Human {
       
    // フィールド
    protected ArrayList<Integer> card = new ArrayList<Integer>();
   
    // コンストラクタ
    public Dealer() {
        
        // 山札にカードをしまう処理
        // 1～13までの数値の代入を4回行う
        for(int i = 0; i < 4; i++) {
            
            // 1～13までの数値の代入
            for(int j = 1; j <= 13; j++) {
                
                // 値の格納
                card.add(j);
            }
        }
    }
    
    // 山札からカードをランダムで2枚引くメソッド
    public ArrayList<Integer> deal(){
        
        // 戻り値を格納するArrayListの生成
        ArrayList<Integer> dealCard = new ArrayList<Integer>();
        
        // Randomクラスのインスタンス生成
        Random rd = new Random();
        
        // カードを2枚引き、引いた要素を削除する処理
        for(int i = 0; i < 2; i++) {
            
            // 乱数取得
            int index = rd.nextInt(card.size());
            
            // 引いたカードをdealCardに格納
            dealCard.add(card.get(index));
            
            // 引いたカードを山札から削除
            card.remove(index);
        }
        
        // 値を格納したArrayListを戻り値に設定する
        return dealCard;
    }
    
    // 引いたカードを手札に追加するメソッド
    @Override
    public void setCard(ArrayList<Integer> card) {
        
        // 引数で受け取ったリストから、引いたカードを手札に追加する
        for(int c : card) {
            
            // 値を格納する処理
            myCard.add(c);
        }
    }
    
    // 山札からカードを引き、引いたカードを返すメソッド
    public ArrayList<Integer> hit() {
        
        // 戻り値を格納するArrayListの生成
        ArrayList<Integer> hitCard = new ArrayList<Integer>();
        
        // Randomクラスのインスタンス生成
        Random rd = new Random();
        
        // 乱数取得
        int index = rd.nextInt(card.size());
        
        // 山札から引いたカードをhitCardに格納する
        hitCard.add(card.get(index));
        
        // 引いたカードを山札から削除する
        card.remove(index);
        
        // 値を格納したArrayListを戻り値に設定する
        return hitCard;
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
    
    // 1枚目のカードを表示するメソッド
    public int firstOpen() {
        
        return myCard.get(0);
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
    
}
