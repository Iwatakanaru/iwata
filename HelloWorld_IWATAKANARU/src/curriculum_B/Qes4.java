package curriculum_B;

public class Qes4 
{
	public static void main(String[] args) 
    {
		for(int nCount = 1;  nCount <= 9; nCount++) //頭の数字
		{
			for(int nSuuzi = 1; nSuuzi <= 9; nSuuzi++  ) //頭の数字にかける数字
			{
				  System.out.print("| " + String.format("%02d", nCount) + " * " + String.format("%02d", nSuuzi) + " = " + String.format("%02d", (nCount * nSuuzi)) + " |");
			}
			System.out.println();//段が変わるたびに改行する
		}
    }
}