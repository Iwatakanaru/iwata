package curriculum1_27;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class curriculum1_27 
{
	 // 学名をマッピングするためのMap
    private static final Map<String, String> scientificNames = new HashMap<>();

    static 
    {
        scientificNames.put("ライオン", "パンテラ レオ");
        scientificNames.put("ゾウ", "ロキソドンタ・サイクロティス");
        scientificNames.put("パンダ", "アイルロポダ・メラノレウカ");
        scientificNames.put("チンパンジー", "パン・トゥログロディテス");
        scientificNames.put("シマウマ", "チャップマンシマウマ");
    }

    // 動物クラス
    static class Animal 
    {
        private String name;
        private double length;
        private int speed;

        public Animal(String name, double length, int speed) 
        {
            this.name = name;         
            this.length = length;
            this.speed = speed;
        }

        public String getScientificName() 
        {
            return scientificNames.getOrDefault(name, "不明");
        }

        public void printInfo() {
            System.out.println("動物名：" + name);
            System.out.println("体長：" + length + "m");
            System.out.println("速度：" + speed + "km/h");
            System.out.println("学名：" + getScientificName());
            System.out.println();
        }
    }

    // メイン処理
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("コンソールに文字を入力してください");

        // 例: ライオン:2.1:80,ゾウ:3.2:40,...
        String input = scanner.nextLine();

        // カンマ区切りで動物ごとに分割
        String[] animalDataList = input.split(",");

        for (String data : animalDataList) 
        {
            String[] parts = data.split(":");

            if (parts.length == 3) 
            {
                String name = parts[0];
                double length = Double.parseDouble(parts[1]);
                int speed = Integer.parseInt(parts[2]);

                Animal animal = new Animal(name, length, speed);
                animal.printInfo();
            } 
            else 
            {
                System.out.println("データ形式が正しくありません：" + data);
            }
        }
    }
}
