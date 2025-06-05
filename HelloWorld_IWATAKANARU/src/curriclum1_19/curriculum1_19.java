package curriclum1_19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class curriculum1_19 
{
	public static void main(String[] args) 
	{
        // Q1：Dogクラスを呼び出して変数に代入
        dog dog1 = new dog("ポチ");
        System.out.println("動物の名前: " + dog1.getName());

        // Q2：Dogクラスを呼び出して変数に代入
        dog dog2 = new dog("ハチ");
        System.out.println("動物の名前: " + dog2.getName());

        System.out.println("動物の数: " + dog.getAnimalCount());

        // 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd H:m:s");
        String currentDate = formatter.format(new Date());
        System.out.println("現在の日時: " + currentDate);
    }
	
}
