package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice04304 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//3
		List<String> fruits = new ArrayList<String>();
		fruits.add("りんご");
		fruits.add("みかん");
		fruits.add("ぶどう");
		
		Collections.sort(fruits);
		
		for (String fruit: fruits) {
			System.out.println(fruit);
		}
	}

}
