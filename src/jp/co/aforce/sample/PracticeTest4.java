package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class PracticeTest4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//2
		List<String> animalList = new ArrayList<String>();
		
		animalList.add(0,"犬");
		animalList.add(1,"猫");
		animalList.add(2,"うさぎ");
		animalList.add(3,"へび");
		
		//3
		String like = "へび" ;
		if  (like == animalList.get(3)) {
			System.out.println(like + "はリストに含まれています");
		} else {
			System.out.println(like + "はリストに含まれていません");
		}
		
		
		//4
//		Calendar calendar = new Calendar;
		
		
	}

}
