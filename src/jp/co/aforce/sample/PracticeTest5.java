package jp.co.aforce.sample;

import java.util.ArrayList;

public class PracticeTest5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		//1
		int fortune = new java.util.Random().nextInt();
		switch (fortune) {
			case 0: fortune = 1;
				System.out.println("吉です");
				break;
			case 1: fortune = 2;
				System.out.println("中吉です");
				break;
			case 2: fortune = 3;
				System.out.println("大吉です");
				break;
			default:
				System.out.println("凶です");
				break;
		}		
		
		//2
		for (int num1 = 1; num1 <=100; num1 ++) {
			if (num1 %7 == 0) {
				System.out.println(num1 + ",");
			}
		}
		
		//3
		for (int num = 1; num <= 9; num ++) {
//			System.out.println(num + "の段");
			for (int num2 = 1; num2 <= 9; num2 ++ ) {
				int k = num * num2;
				System.out.print(k + " ");
			}
			System.out.println("");
		}
		
		//4
		
		//5
		ArrayList<String> employees = new ArrayList<>();
		employees.add("斎藤");
		employees.add("田中");
		employees.add("山田");
		employees.add("鈴木");
		employees.add("高橋");
		
		ArrayList<String> submitters = new ArrayList<>();
		employees.add("斎藤");
		employees.add("高橋");
		
//		System.out.println(employees.get(1));
//		System.out.println(employees.get(2));
//		System.out.println(employees.get(3));
		
		//6
		for (int number = 2; number <= 100; number ++) {
			for (int number2 = 2; (number % number2 != 0 && number2 < number) || number == number2; number2 ++) {
				if (number == number2) {
					System.out.println(number);
				}
			}
		}
		
	}
}
