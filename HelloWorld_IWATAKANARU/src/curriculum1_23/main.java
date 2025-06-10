package curriculum1_23;

public class main
{
    public static void main(String[] args) 
    {
    	curriculum1_23 lion = new curriculum1_23();

        lion.setName("ライオン");
        lion.setLength(2.1);
        lion.setSpeed(80);

        System.out.println("動物名：" + lion.getName());
        System.out.println("体長：" + lion.getLength() + "m");
        System.out.println("速度：" + lion.getSpeed() + "km/h");
    }
}