/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.challenge.blackjack;

import java.util.ArrayList;

/**
 *
 * @author guest1Day
 */
public abstract class Human {
    
    // フィールド
    protected ArrayList<Integer> myCard = new ArrayList<Integer>();
    
    // 抽象メソッド
    abstract public void setCard(ArrayList<Integer> card);
    
    abstract public int open();
    
    abstract public boolean checkSum();
    
}
