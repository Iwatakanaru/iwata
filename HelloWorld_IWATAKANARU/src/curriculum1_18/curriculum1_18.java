package curriculum1_18;

import java.util.Random;

public class  curriculum1_18
{

	 // Q1
    public static void printMessage(String text, int number) 
    {
        System.out.println(text + " JavaSE " + number);
    }

    // Q2（元のメソッド）
    public static void multiply(int a, int b) 
    {
        System.out.println("乗算結果: " + (a * b));
    }

    // Q2 オーバーロード1：double型
    public static void multiply(double a, double b)
    {
        System.out.println("乗算結果(double): " + (a * b));
    }

    // Q2 オーバーロード2：int型3つ
    public static void multiply(int a, int b, int c) 
    {
        System.out.println("乗算結果(3つ): " + (a * b * c));
    }

    // Q3
    public static void printArray(int[] arr) 
    {
        System.out.println("配列の出力:");
        for (int num : arr) 
        {
            System.out.println(num);
        }
    }

    // Q4（オーバーロード：加算）
    public static void add(double a, double b) 
    {
        System.out.println("加算結果: " + (a + b));
    }

    // Q5
    public static int[] generateRandomNumbers(int count) 
    {
        Random rand = new Random();
        int[] result = new int[count];
        System.out.println("ランダム値:");

        for (int i = 0; i < count; i++) 
        {
            int num;
            do
            {
                num = rand.nextInt(100) + 1; // 1～100のランダム値
            } while (num == 0);
            result[i] = num;
            System.out.println(num);
        }
        return result;
    }

    // Q6
    public static double calculateAverage(int[] numbers)
    {
        if (numbers.length == 0) return 0.0;

        int sum = 0;
        for (int num : numbers) 
        {
            sum += num;
        }
        double avg = (double) sum / numbers.length;
        System.out.println("平均値: " + avg);
        return avg;
    }

    // Q7
    public static boolean isAboveThreshold(double average) 
    {
        boolean result = average >= 50.0;
        System.out.println("50以上か？: " + result);
        return result;
    }

    // テスト用mainメソッド
    public static void main(String[] args) 
    {
        // Q1
        printMessage("Hello", 11);

        // Q2（元）
        multiply(5, 6);

        // Q2 オーバーロードのテスト
        multiply(2.5, 3.0);     // double
        multiply(2, 3, 4);      // 3つのint

        // Q3
        int[] sampleArray = {10, 20, 30, 40};
        printArray(sampleArray);

        // Q4
        add(5.5, 4.5);

        // Q5
        int[] randomNumbers = generateRandomNumbers(5);

        // Q6
        double average = calculateAverage(randomNumbers);

        // Q7
        isAboveThreshold(average);
    }
}