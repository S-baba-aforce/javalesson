package jp.co.aforce.sample;

import java.util.Scanner;

public class Themapark0502 {

	public static void main(String[] args) {
//		int age = 0;
	
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("年齢を入力してください：");
//		
//		String str = scanner.nextLine();
		
//		if (age <= 3) {
//			System.out.println("年齢：" + age + "料金は無料");
//		} else if (age >=4 && age <= 12 ) {
//			System.out.println("年齢：" + age + "料金は500円");
//		} else if (age >= 13 && age <=17) {
//			System.out.println("年齢：" + age + "料金は800円");
//		} else if (age >= 18 && age <=59) {
//			System.out.println("年齢：" + age + "料金は1200円");
//		} else  {
//			System.out.println("年齢：" + age + "料金は700円");
//		}
		
		for (int age = 0; age < 130; age ++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("年齢を入力してください：");
			
			String str = scanner.nextLine();
			if (age <= 3) {
				System.out.println("年齢：" + age + "料金は無料");
			} else if (age >=4 && age <= 12 ) {
				System.out.println("年齢：" + age + "料金は500円");
			} else if (age >= 13 && age <=17) {
				System.out.println("年齢：" + age + "料金は800円");
			} else if (age >= 18 && age <=59) {
				System.out.println("年齢：" + age + "料金は1200円");
			} else  {
				System.out.println("年齢：" + age + "料金は700円");
			}
		}
		
		try {
			int age = 0;
			if (age < 0 && age > 130) {
				throw new IllegalArgumentException("チケットを購入できません。");
			} 
			System.out.println("登録が完了しました。");
		 
		}	catch (IllegalArgumentException e) {
				System.out.println("例外が発生しました：" + e.getMessage());
			}
	}
}


