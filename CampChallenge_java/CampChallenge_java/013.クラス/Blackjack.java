/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.challenge.blackjack;

import java.util.Scanner;
/**
 *
 * @author MIYAMA HAYATO
 */
public class Blackjack {
    
    // メインメソッド
    public static void main(String[] args) {

        // ルールの表示
        System.out.println("ルールの説明\nチップのことを考慮していないため、「Split」「Double down」「Insurance」の使用はありません。");
        System.out.println("また、ゲームの進行の際キーボード入力を使用するので、メッセージの右側の\"()\"内の表示に従って進行してください。");
        System.out.println("※\"()\"の表示以外の入力を行うと「強制的」にゲームを進行します。");
        System.out.println("ゲームを開始しますか？-----(\"y\"_or_\"n\"push→Enter)");
        
        // Scannerクラスのインスタンス生成
        Scanner scan = new Scanner(System.in);

        // キーボード入力によって処理をもう一度実行する
        while((scan.next()).equals("y")) {
        
            // UserクラスとDealerクラスのインスタンス生成
            User user = new User();
            Dealer dealer = new Dealer();

            // Bustしたとき用の変数の宣言
            boolean uBust = true;       // UserがBustしたとき使用
            boolean dBust = true;       // DealerがBustしたとき使用

            // ゲーム開始メッセージ
            System.out.println("System「ゲームを開始します」(pushEnter)");
            scan.nextLine();

            // Dealerは自分の手札を2枚引き、UserはDealerに2枚山札から引いて自分の手札にセットする
            user.setCard(dealer.deal());
            dealer.setCard(dealer.deal());

            // Dealerの手札を1枚公開する
            System.out.println("Dealer「カードを1枚公開します-----[" + dealer.firstOpen() + "]」\n");

            // フェイズメッセージの表示
            System.out.println("----------ユーザーフェイズ----------(pushEnter)");
            scan.nextLine();

            // Userの手札の数値、合計値の表示
            System.out.print("System「手札は");
            user.handOpen();
            System.out.println("合計値は[" + user.open() + "]です」");

            // Hit(h)するかStand(s)するかプレイヤーに入力を促すメッセージの表示
            System.out.println("System「Hitしますか？Standしますか？」-----(\"h\"_or_\"s\"push→Enter)");

            // キーボードから何が入力されたかによってtrue/falseが返ってくるメソッドを呼び出す
            // trueなら引く処理を繰り返す。falseなら何もしない
            while(user.choice(scan.next())) {

                // メッセージの表示
                System.out.println("User「Hitします」");

                // Dealerに山札から1枚カードを引いてもらって手札に追加する
                user.setCard(dealer.hit());

                // Hitしたカードを表示する
                user.hitCard();

                // Userの手札の数値、合計値の表示
                System.out.print("System「手札は");
                user.handOpen();
                System.out.println("合計値は[" + user.open() + "]になりました」");

                // Bustした場合は処理から抜ける
                if(user.open() > 21) {

                    break;
                }

                // Hit(h)するかStand(s)するかプレイヤーに入力を促すメッセージの表示 
                System.out.println("System「Hitしますか？Standしますか？」-----(\"h\"_or_\"s\"push→Enter)");
            }

            // Bustした場合の処理
            if(user.open() > 21) {

                // UserがBustしたとき用の変数にfalseを代入
                uBust = false;

                // メッセージの表示
                System.out.println("[" + user.open() + "]・・・・・Bust");
                System.out.println("System「Bustしたのであなたの負けです」\n");

            } else {

                // メッセージの表示
                System.out.println("User「Standします」\n");
            }

            // フェイズメッセージの表示
            System.out.println("----------ユーザーフェイズ終了----------\n");
            scan.nextLine();

            // UserがBustした場合は行わない
            if(uBust) {

                // フェイズメッセージの表示
                System.out.println("----------ディーラーフェイズ----------(pushEnter)");
                scan.nextLine();

                // Dealerの手札の数値、合計値の表示
                System.out.print("Dealer「カードをオープンします」\nDealer「");
                dealer.handOpen();
                System.out.println("合計値は[" + dealer.open() + "]」");

                // Dealerはルールにより、合計値が17以上になるまでカードを引き続ける
                // trueなら引く。falseなら何もしない
                while(dealer.checkSum()) {

                    // メッセージの表示
                    System.out.println("Dealer「[" + dealer.open() + "]なのでルールによりHitします」-----(pushEnter)");
                    scan.nextLine();

                    // Dealerは山札から1枚カードを引き、手札に追加する
                    dealer.setCard(dealer.hit());

                    // Hitしたカードの表示
                    dealer.hitCard();

                    // Dealerのカードの合計値の表示
                    System.out.print("Dealer「");
                    dealer.handOpen();
                    System.out.println("合計値は[" + dealer.open() + "]」");
                }

                // DealerがBustした場合の処理
                if(dealer.open() > 21) {

                    // メッセージの表示
                    System.out.println("Dealer「Bustしました。私の負けです」\n");

                    // DealerがBustしたとき用の変数にfalseを代入
                    dBust = false;
                }

                // DealerがBustした場合は処理しない
                if(dBust) {

                    // Dealerの手札が17以上の場合
                    if(!dealer.checkSum()) {

                        // メッセージの表示
                        System.out.println("Dealer「[17]以上なのでHitを終了します」\n");
                    }
                } 

                // フェイズメッセージの表示
                System.out.println("----------ディーラーフェイズ終了----------(pushEnter)");
                scan.nextLine();
            }

            // リザルトメッセージ表示
            System.out.println("----------リザルト表示----------(pushEnter)");
            scan.nextLine();

            // User、Dealerそれぞれの手札、合計値を表示
            System.out.print("User  :");
            user.handOpen();
            System.out.println("合計値は[" + user.open() + "]");

            System.out.print("Dealer:");
            dealer.handOpen();
            System.out.println("合計値は[" + dealer.open() + "]\n");

            // 勝敗判定
            // UserがBustしていない、数値が高いもしくは、DealerがBustしている場合、Userの勝利
            // DealerがBustしていない、数値が高いもしくは、UserがBustしている場合、Dealerの勝利
            // どちらでもなければ引き分け
            if(user.open() > dealer.open() && uBust || !dBust) {

                // メッセージの表示
                System.out.println("System「Userの勝利です」");

            } else if(user.open() < dealer.open() && dBust || !uBust) {

                // メッセージの表示
                System.out.println("System「Dealerの勝利です」");

            } else {

                // メッセージの表示
                System.out.println("System「引き分けです」");
            }
            
            // ゲームをもう一度プレイするかプレイヤーに入力を促すメッセージの表示
            System.out.println("ゲームをもう一度プレイしますか？-----(\"y\"_or_\"n\"push→Enter)");
        }
        
        // ゲーム終了メッセージの表示
        System.out.println("System「ゲームを終了します」");
        
        // Scannerを閉じる
        scan.close();   
    }
}