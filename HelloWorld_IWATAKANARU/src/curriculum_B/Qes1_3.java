package curriculum_B;
import java.util.Random;
import java.util.Scanner;

public class Qes1_3 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        // ユーザー名を入力
        System.out.print("ユーザー名を入力してください: ");
        
        String userName = "";
        while (true)
        {
            userName = scanner.nextLine();

            if (userName == null || userName.trim().isEmpty()) //0文字かnullの時
            {
                System.out.println("名前を入力してください");
            }
            else if (userName.length() > 10) //名前が10文字以上
            {
                System.out.println("名前を10文字以内にしてください");
            }
            else if (!userName.matches("[a-zA-Z0-9]+")) // 半角英数字チェック(2番)
            {
                System.out.println("半角英数字のみで名前を入力してください");
            }
            else 
            {    
                System.out.println("ユーザー名「" + userName + "」を登録しました");
                break;
            }
        }

        
        // じゃんけん(3番）
        int count = 0;
        String[] hands = {"グー", "チョキ", "パー"};

        while (true)
        {
            count++; // ゲームの回数をカウント

            // ユーザーの手入力
            int userHand = -1;
            while (userHand < 0 || userHand > 2) 
            {
            	
                System.out.print("あなたの手を入力してください (0: グー, 1: チョキ, 2: パー): ");
                userHand = scanner.nextInt();
                
                if (userHand < 0 || userHand > 2) 
                {
                    System.out.println("無効な入力です。0, 1, 2 のいずれかを入力してください。");
                }
            }

            // 相手の手をランダムで決定
            int opponentHand = rand.nextInt(3);
            // ユーザーと相手の手を表示
            System.out.println(userName + "の手は「" + hands[userHand] + "」");
            System.out.println("相手の手は「" + hands[opponentHand] + "」");

            // 勝敗判定
            if (userHand == opponentHand) 
            {
                System.out.println("DRAW あいこ もう一回しましょう！");
            } 
            else if ((userHand == 0 && opponentHand == 1) || (userHand == 1 && opponentHand == 2) || (userHand == 2 && opponentHand == 0))
            {
                // ユーザーが勝った場合
                System.out.println("やるやん。");
                System.out.println("次は俺にリベンジさせて");
                break;
            } 
            else 
            {
                // ユーザーが負けた場合
                if (userHand == 0) // ユーザーがグー
                {
                    System.out.println("俺の勝ち！");
                    System.out.println("負けは次につながるチャンスです！\nネバーギブアップ！");
                }
                else if (userHand == 1) // ユーザーがチョキ
                {
                    System.out.println("俺の勝ち！");
                    System.out.println("たかがじゃんけん、そう思ってないですか？");
                    System.out.println("それやったら次も、俺が勝ちますよ");
                }
                else if (userHand == 2) // ユーザーがパー
                {
                    System.out.println("俺の勝ち！");
                    System.out.println("なんで負けたか、明日まで考えといてください。");
                    System.out.println("そしたら何かが見えてくるはずです");
                }
            }
        }

        // 勝つまでの回数を表示
        System.out.println("勝つまでにかかった合計回数は" + count + "回です");

        scanner.close();
    }
}