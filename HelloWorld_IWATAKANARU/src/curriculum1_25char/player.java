package curriculum1_25char;

import java.util.Random;

public class player extends character 
{
	private String name;

    // プレイヤーの名前と、ランダムなステータスを設定するコンストラクタ
    public player(String name)
    {
        super(generateRandom(), generateRandom(), generateRandom(), generateRandom(), generateRandom());
        this.name = name;
    }

    // ステータスに使用するランダム値を生成するメソッド（0〜999）
    private static int generateRandom() {
        return new Random().nextInt(1000);
    }

    // 名前のgetterとsetter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // プレイヤーのステータスを表示するメソッド
    public void showStatus() {
        System.out.println("こんにちは 「" + name + "」 さん");
        System.out.println("ステータス");
        System.out.println("HP：" + getHp());
        System.out.println("MP：" + getMp());
        System.out.println("攻撃力：" + getAttack());
        System.out.println("素早さ：" + getSpeed());
        System.out.println("防御力：" + getDefense());
        System.out.println();
        System.out.println("さあ冒険に出かけよう！");
    }
}