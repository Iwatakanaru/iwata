package sushi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class sushi 
{
		// フィールド（クラス内で使う変数）を定義	
		private String greeting;
	    private String tasteComment;
	    private String description;
	    private String currentDateTime;

	    public sushi()
	    {
	    	
	    	// thisを使ってフィールドに値をセットする
	        this.greeting = "こんにちは！ここは日本です！";
	        this.tasteComment = "この寿司はうまい";
	        this.description = "寿司は和食です";
	        
	        // 現在の日時を取得
	        LocalDateTime now = LocalDateTime.now();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	        
	        // フィールドに現在日時を文字列として保存
	        this.currentDateTime = "今の現在日時は" + now.format(formatter) + "です";
	    }
	    
	    // メッセージを表示するメソッド
	    public void displayMessage() 
	    {
	    	// 各フィールドを表示（thisは省略可だが、今回は意図を明確にするため使う）
	        System.out.println(this.greeting);
	        System.out.println(this.tasteComment);
	        System.out.println(this.description);
	        System.out.println(this.currentDateTime);
	    }
}
