package curriculum1_25main;

import java.util.Scanner;

import curriculum1_25char.player;

// プログラムのスタート地点（Mainクラス）
public class main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // ユーザーに名前を入力してもらう
        System.out.print("名前を入力してください：");
        String name = scanner.nextLine();

        // プレイヤーインスタンスを作成
        player player = new player(name);

        // ステータスを表示
        player.showStatus();
    }
}