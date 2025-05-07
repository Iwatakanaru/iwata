package curriculum_B;

public class Qes5
{
	public static void main(String[] args) 
    {
		for(int nSuuzi = 1;  nSuuzi <= 20; nSuuzi++) //頭の数字
		{
			for(int nCount = 1; nCount <= 9; nCount++  ) //頭の数字にかける数字				
			{
				//%03d 0（穴埋め数字),2(最小桁数),d(整数)
				System.out.print ("| " + String.format("%03d", nCount) + " * " + String.format("%03d", nSuuzi) + " = " + String.format("%03d", (nCount * nSuuzi)) + " | ");
			}
			System.out.println();//段が変わるたびに改行する
		}
    }
}