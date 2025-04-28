package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class PracticeTest3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		//1
		String[] products = {"シャープペンシル","ボールペン","リングノート","クリップ","消しゴム"};
		
		//2
		System.out.println(products[1]);
		
		//3
		List<String> nameList = new ArrayList<String>();
		
		nameList.add(0,"山田太郎");
		nameList.add(1,"鈴木花子");
		nameList.add(2,"佐藤二郎");
		nameList.add(3,"山田太郎");
		nameList.add(4,"高橋三郎");
		
		//4
		//インデックス番号を指定した方が、二人の山田太郎を区別して認識できるから。
		
		//5
		System.out.println(nameList.get(2));
		
		//6
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(15);
		list1.add(16);
		list1.add(19);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(11);
		list2.add(12);
		list2.add(18);
		list2.add(20);
		
		list1.addAll(list2);
		
		Collections.sort(list1);
		
		for (Integer num:list1) {
			System.out.println(num);
		}
		
		
		//7	
		ArrayList<Integer> list3 = new ArrayList<>();	
		list3.add(13);
		list3.add(14);
		list3.add(17);
		list3.add(21);
		
		
		ArrayList<Integer> twoList = new ArrayList<>();
			for (Integer num: list1) {
				twoList.add(num);
			}
			for (Integer num: list3) {
				twoList.add(num);
			}
			
		Collections.sort(twoList);
		
		for (Integer num: twoList) {
			System.out.println(num);
		}
		
	}

}
