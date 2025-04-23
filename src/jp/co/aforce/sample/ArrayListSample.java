package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {
	public static void main(String args[]) {
		
		List<String> fruitsList = new ArrayList<String>();
		
			fruitsList.add("apple");
			fruitsList.add("potato");
			System.out.println(fruitsList);
			
			fruitsList.add(1, "grape");           //addで指定の位置に追加
			fruitsList.add(1, "peach");
			System.out.println(fruitsList);
			
			String element1 = fruitsList.get(2);  //「get」でリストの中の要素を参照
			
			fruitsList.remove(3);                 //「remove」で要素を削除（potateを削除）<インデックスを用いて>
			System.out.println(fruitsList);
				
			fruitsList.remove("peach");           //対象を指定して削除
			System.out.println(fruitsList);			
	}

}
