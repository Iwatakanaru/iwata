package curriculum_A;

public class Qes1_13 
{
	public static void main(String[] args)
	{
		//4
		byte nByte;
		short nShort;
		int nInt;
		long nLong;
		float nFloat;
		double nDouble;
		char nChar;
		String nString;
		boolean nBoolean;
		
		nByte = 10;
		nShort = 100;
		nInt = 1000;
		nLong = 10000;
		nFloat = 9.5f;
		nDouble = 10.5d;
		nChar = 'a';
		nString = "ハロー";
		nBoolean = true;
		
		System.out.println(+(nInt + nShort + nByte + nLong));
		System.out.println(+(nByte + nByte));
		System.out.println(nChar + nString + nBoolean);
		System.out.println(+(nInt + nShort + nByte + nLong + nFloat + nDouble));
		System.out.println(+(nInt * nShort * nByte * nLong));
		System.out.println(+(nDouble / nShort));
		System.out.println(+(nByte - nShort));
		
		//5
		String num = "20";
		int num1 =23;
		System.out.println("ハローJAVA"+ num + num1);
		
		//6
		String name = "山田太郎";
		byte old = 18;
		float height = 170.5f;
		float weight = 62.2f;
		String food = "寿司";
		
		System.out.println("はじめまして" + name + "です");
		System.out.println("年齢は" + old + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		
		//7
		System.out.println("BMIは"+ String.format("%.2f",weight / ((height / 100) * (height / 100))));
		
		//8
		 name = "鈴木一郎";
		 old = 24;
		 height = 168.5f;
		 weight = 64.2f;
		 food = "オムライス";
		 
		 System.out.println("はじめまして" + name + "です");
		 System.out.println("年齢は" + old + "歳です");
		 System.out.println("身長は" + height + "cmです");
		 System.out.println("体重は" + weight + "kgです");
		 System.out.println("好きな食べ物は" + food + "です");
		 System.out.println("BMIは"+ String.format("%.1f",weight / ((height / 100) * (height / 100))));
		 
		 //9
		 System.out.println("はじめまして" + name + "です");
		 System.out.println("年齢は" + +(old + old) + "歳です");
		 System.out.println("身長は" + +(height+ height) + "cmです");
		 System.out.println("体重は" + +(weight + weight) +"kgです"); 
		 System.out.println("好きな食べ物は" + food + "です");
		 System.out.println("BMIは"+ String.format("%.2f",weight / ((height / 100) * (height / 100))/2));
		 
		 //10
		 System.out.println((old >= 25));
		 
		 //11
		 String old1 = Byte.toString(old);
		 String weight1 = Float.toString(weight);
		 String height1 = Float.toString(height);
		 
		 System.out.println(old1 +weight1 + height1);		 
		 
		 //12
		 int old2 = Integer.parseInt(old1);
		 float height2 = Float.parseFloat(height1); 
		 System.out.println(old2);
		 System.out.println(height2);
			
		 //13
		 System.out.println(old2 == 25 || height2 >= 160 );		 
	}
	
}
