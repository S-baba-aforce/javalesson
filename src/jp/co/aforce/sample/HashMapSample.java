package jp.co.aforce.sample;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {                       //「key」（参照型を利用[インデックスではない]）を用いて、要素を管理
	public static void main(String args[]) {
		
		Map<String, Integer> nameMap = new HashMap<>();  //要素の型名　結果　＝　マップ変数名.put(キー.追加する要素)

		nameMap.put("Bob", 1);    //「put」で追加     ( key , value )
		nameMap.put("Alice", 2);
		nameMap.put("John", 2);
		nameMap.put("Tom", 1);
		System.out.println(nameMap);
		
		Integer value = nameMap.get("Alice");       //要素取得
		System.out.println(value);
		
		Integer value1 = nameMap.get("Tarou");
		System.out.println(value1);
		
		nameMap.remove("Alice");                 //要素削除		
	}	
}
