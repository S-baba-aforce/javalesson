package jp.co.aforce.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practice0423 {
	public static void main(String args[]) {
		
		//1
		Map<String, Integer> fruitesMap = new HashMap<>();
		
		fruitesMap.put("りんご", 100);
		fruitesMap.put("みかん", 80);
		fruitesMap.put("バナナ", 120);
		fruitesMap.put("いちご", 300);
		System.out.println(fruitesMap);
		
		Scanner fruitesScan = new Scanner (System.in);
		System.out.println("購入したいフルーツは何ですか？");
		String choice = fruitesScan.nextLine();
		fruitesScan.close();                                     //スキャンを閉じる
		
		//値段を取得
		Integer price = fruitesMap.get(choice);
		
		if (price!=null) {
			System.out.println("￥" + price + "です");
		} else {
			System.out.println("申し訳ありませんが、その商品は取り扱っておりません。");
		}
	}
}
