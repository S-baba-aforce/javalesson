package jp.co.aforce.sample;

//0502=====8

import java.util.ArrayList;
import java.util.List;

public class FrutiresList0502 {

	public static void main(String[] args) {
		
		List<String>fruites = new ArrayList<>();
		fruites.add("リンゴ");
		fruites.add("バナナ");
		fruites.add("さくらんぼ");
		
		fruites.remove("バナナ");
		
		fruites.add("オレンジ");
		
		System.out.println(fruites);
	}

}
