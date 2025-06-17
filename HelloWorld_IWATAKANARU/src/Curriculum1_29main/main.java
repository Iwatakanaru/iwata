package Curriculum1_29main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import curriculum1_29sub.sub;

public class main 
{

	 // 都道府県データ（0〜10のインデックス付き）
    private static final sub[] PREFECTURES = 
    {
        new sub("北海道", "札幌市", 83424),
        new sub("青森県", "青森市", 9646),
        new sub("岩手県", "盛岡市", 15275),
        new sub("宮城県", "仙台市", 7282),
        new sub("秋田県", "秋田市", 11638),
        new sub("山形県", "山形市", 9323),
        new sub("福島県", "福島市", 13784),
        new sub("茨城県", "水戸市", 6097),
        new sub("栃木県", "宇都宮市", 6408),
        new sub("群馬県", "前橋市", 6362),
        new sub("埼玉県", "さいたま市", 3798)
    };

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // 番号入力の案内
        System.out.println("番号をカンマ区切りで入力してください（例: 8,5,9）:");
        String input = scanner.nextLine();

        // 昇順か降順かの選択を促す
        System.out.println("昇順(asc) or 降順(desc) を入力してください:");
        String order = scanner.nextLine().trim().toLowerCase();

        // 入力文字列をカンマで分割して配列に
        String[] tokens = input.split(",");

        // 番号と都道府県をセットで保持するリスト（インデックス順ソート用）
        List<IndexedPrefecture> selectedList = new ArrayList<>();

        // 入力番号をチェックして対応する都道府県を追加
        for (String token : tokens) 
        {
            try {
                int index = Integer.parseInt(token.trim());  // 文字列を数字に変換
                if (index >= 0 && index < PREFECTURES.length) {
                    // インデックスと都道府県のセットをリストに追加
                    selectedList.add(new IndexedPrefecture(index, PREFECTURES[index]));
                } else {
                    System.out.println("無効な番号: " + index);
                }
            } catch (NumberFormatException e) {
                System.out.println("無効な入力: " + token);
            }
        }

        // インデックス番号（0～10）で昇順にソートするコンパレータを用意
        Comparator<IndexedPrefecture> comparator = Comparator.comparingInt(ip -> ip.index);

        // 降順希望ならコンパレータを逆順にする
        if (order.equals("desc")) {
            comparator = comparator.reversed();
        } else if (!order.equals("asc")) {
            // 入力がascでもdescでもない場合は警告を表示（昇順扱い）
            System.out.println("無効な順序指定です。昇順(asc)を使用します。");
        }

        // ソート実行
        selectedList.sort(comparator);

        // ソートされた都道府県情報を表示
        for (IndexedPrefecture ip : selectedList) {
            ip.prefecture.printInfo();
        }

        scanner.close();
    }

    // インデックス番号と都道府県情報を一緒に保持するための内部クラス
    private static class IndexedPrefecture {
        int index;
        sub prefecture;

        IndexedPrefecture(int index, sub prefecture) {
            this.index = index;
            this.prefecture = prefecture;
        }
    }
}
