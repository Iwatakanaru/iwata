package curriculum_B;
import java.util.Scanner;

public class Qes7 
{
	 public static void main(String[] args) 
	 {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("生徒の人数を入力してください（2人以上）：");
	        int studentCount = scanner.nextInt();

	        //生徒の人数が2人に満たない場合
	        while (studentCount < 2) 
	        {
	            System.out.print("※2人以上を入力してください：");
	            studentCount = scanner.nextInt();
	        }
	        
	        // 教科
	        int subjectCount = 4;
	        String[] subjects = {"英語", "数学", "理科", "社会"};

	        // 各生徒の点数を保存する
	        int[][] scores = new int[studentCount][subjectCount];

	        // 各教科の合計を保存
	        int[] subjectTotals = new int[subjectCount];

	        //点数入力
	        for (int i = 0; i < studentCount; i++) 
	        {
	        	
	            for (int j = 0; j < subjectCount; j++) 
	            {
	                System.out.print(  + (i + 1) + "人目の[" +subjects[j] + "]の点数を入力してください：");scores[i][j] = scanner.nextInt();subjectTotals[j] += scores[i][j];
	            }
	            System.out.println();
	        }

	        // 各生徒の平均点
	        for (int i = 0; i < studentCount; i++) 
	        {
	            int total = 0;
	            
	            for (int j = 0; j < subjectCount; j++) 
	            {
	                total += scores[i][j];
	            }
	            double avg = (double) total / subjectCount;
	            System.out.printf("%d人目の平均点は%.2f\n", (i + 1), avg);
	        }

	        //各教科の平均点
	        for (int i = 0; i < subjectCount; i++) 
	        {
	            double avg = (double) subjectTotals[i] / studentCount;
	            System.out.printf("%sの平均点は%.2f\n", subjects[i], avg);
	        }
	        
	        //教科全体の平均点
	        int grandTotal = 0;
	        
	        for (int i = 0; i < subjectCount; i++) 
	        {
	            grandTotal += subjectTotals[i];
	        }
	        
	        double overallAverage = (double) grandTotal / (studentCount * subjectCount);
	        System.out.printf("全体の平均点は%.2f\n", overallAverage);

	        scanner.close();
	  }
}

