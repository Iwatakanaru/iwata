package curriculum_B;

public class Qes4 
{
    public static void main(String[] args) 
    {
        for(int nCount = 1; nCount <= 9; nCount++) // 段（掛ける数）
        {
            for(int nSuuzi = 1; nSuuzi <= 9; nSuuzi++) // 掛けられる数
            {
                // 最初以外の項目の前に " || " をつける
                if(nSuuzi > 1) 
                {
                    System.out.print(" || ");
                }
                System.out.print(String.format("%02d * %02d = %02d", nCount, nSuuzi, nCount * nSuuzi));
            }
            System.out.println(); // 段が終わったら改行
        }
    }
}