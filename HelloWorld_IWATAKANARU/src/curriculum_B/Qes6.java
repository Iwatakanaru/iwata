package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 
{
	public static void main(String[] args) 
	{
        // 入力商品
        String input = "パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ、その他商品";
        String[] products = input.split("、");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 検索機能
        System.out.print("商品名を入力してください：");
        String keyword = scanner.nextLine().trim();

        for (String product : products) 
        {
        	int stock = random.nextInt(12); // 0〜11のランダム在庫

            switch (product) 
            {
                case "テレビ":
                case "ディスプレイ": //テレビとディスプレイの場合
                	int actualStock = product.equals("ディスプレイ") ? (11 - stock) : stock;
                    System.out.println(product.equals(keyword) ? product + "の残り台数は" + actualStock + "台です" : "");
                    break;

                case "パソコン": //パソコンの場合
                	System.out.println(product.equals(keyword) ? product + "の残り台数は" + stock + "台です" : "" );
                	  break;
           
                case "冷蔵庫": //冷蔵庫の場合
                	 System.out.println(product.equals(keyword) ? product + "の残り台数は" + stock + "台です":"" );
                	  break;
                	
                case "扇風機": //扇風機の場合
                	 System.out.println(product.equals(keyword) ? product + "の残り台数は" + stock + "台です":"" );
                	  break;
                	
                case "洗濯機": //洗濯機の場合
                	 System.out.println(product.equals(keyword) ? product + "の残り台数は" + stock + "台です":"" );
                	  break;
                	
                case "加湿器"://加湿器の場合
                    System.out.println(product.equals(keyword) ? product + "の残り台数は" + stock + "台です": "" );
                    break;
                    
               default://その他商品の場合
                    System.out.println(product.equals(keyword) ? "『 " + product + " 』は指定の商品ではありません" : "" );
                    break;
            }
        }

        scanner.close();
    }
}