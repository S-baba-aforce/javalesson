package jp.co.aforce.sample;

import java.util.ArrayList;

public class LectureWhileFor0424 {
	public static void main(String args[]) {
		
		
		/*======while文======*/
		int i = 5;
		while (i < 5) {
			System.out.println("iの値:" + i);	
			i++;
		}
		
		
		/*======do while======*/
		i = 5;
		do {
			System.out.println("iの値:" + i);
			i++;
		} while (i < 5);
		
		
		/*=======for文（二重ループ）=======*/
		for (i = 1; i <= 10; i++) {
			System.out.println("iの値は" + i);
			for (int i2 =1; i2 <= 10; i2++) {
				System.out.println(i2);
			}
		}
		
		
		/*=======拡張for文=======*/
		ArrayList<String> employees = new ArrayList<>();
		employees.add("田中太郎");
		employees.add("山田花子");
		employees.add("佐藤次郎");
		
		for (String employee: employees) {
			System.out.println(employee);
		}
		
	}

}
