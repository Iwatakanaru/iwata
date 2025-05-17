package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 
{
    public static void main(String[] args) 
    {
        // 商品一覧
        String[] products = { "パソコン", "冷蔵庫", "扇風機", "洗濯機", "加湿器", "テレビ", "ディスプレイ", "その他商品" };

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 商品ごとの在庫をランダムに生成
        java.util.Map<String, Integer> stockMap = new java.util.HashMap<>();
        for (String product : products) {
            int stock = random.nextInt(12); // 0～11
            
            if (product.equals("ディスプレイ")) 
            {
                stockMap.put(product, 11 - stock); // ディスプレイ
            } 
            else 
            {
                stockMap.put(product, stock);
            }
        }

        // ユーザー入力（「、」区切り）
        System.out.print("商品名を入力してください：");
        String[] keywords = scanner.nextLine().trim().split("、");

        for (String keyword : keywords) 
        {
            keyword = keyword.trim(); // 前後の空白を除去

            switch (keyword) 
            {
                case "パソコン":
                case "冷蔵庫":
                case "扇風機":
                case "洗濯機":
                case "加湿器":
                case "テレビ":
                case "ディスプレイ":
                    System.out.println(keyword + "の残り台数は" + stockMap.get(keyword) + "台です");
                    break;

                case "その他商品":
                    System.out.println("『 " + keyword + " 』は指定の商品ではありません");
                    break;

                default:
                    System.out.println("『 " + keyword + " 』は商品一覧に存在しません");
                    break;
            }
        }

        scanner.close();
    }
}