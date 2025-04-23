package jp.co.aforce.sample;

/********* 2章　4 - 16 **********/
	
/*4 変数 num に小数 4.5 を代入し、その値を半分にして表示するプログラム。*/		
public class calculate {
	public static void main(String args[]) {
		double num = 4.5;
			System.out.println(num * 2);
			
			
		/*5 変数 num に小数 7.8 を代入し、その値を整数部分と小数部分に分けて表示するプログラム。*/
			
		double num1 = 7.8;
			int inPart = (int)num1;
			double decimalPart = num1 - inPart;
			
			System.out.println(num1 - decimalPart);
			System.out.println(num1 - inPart);
	
		/*6 変数 num に小数 3.2 を代入し、その値を10倍にして表示するプログラム。*/
		double num2 = 3.2;
			System.out.println(num2 * 2);
			
		/*7 変数 num に整数 0 を代入し、その値が0かどうかを判定するプログラム。*/
		int num3 = 0;
			if (num3 == 0) {
				System.out.println(num3 + "は0");
			}	else {
				System.out.println(num3 + "は0でない");
			}
			
		/*8 変数 num に整数 -5 を代入し、その値が負の数かどうかを判定するプログラム。*/	
			int num4 = -5;
			 if (num4 < 0) {
				 System.out.println(num4 + "は負の数");
			 } else {
				 System.out.println(num4 + "は正の数");
			 }
		/*9 変数 num に整数 15 を代入し、その値が5の倍数かどうかを判定するプログラム。*/
			 int num5 = 15;
			 	if (num5 % 5 == 0) {
			 		System.out.println(num5 + "は5の倍数");
			 	} else {
			 		System.out.println(num5 + "は5の倍数でない");
			 	}
		/*10 変数 num1 に整数 8 を、num2 に整数 3 を代入し、それらの和を計算して表示するプログラム。*/
			 int num6 = 8;
			 int num7 = 3;
			 	System.out.println(num6 + num7);
			 	
		/*11 変数 num1 に整数 10 を、num2 に整数 4 を代入し、それらの差を計算して表示するプログラム。*/	 	
			 int num8 = 10;
			 int num9 = 4;
			 	System.out.println(num8 - num9);
			 	
		/*12 変数 num1 に整数 6 を、num2 に整数 7 を代入し、それらの積を計算して表示するプログラム。*/	 	
			 int num10 = 6;
			 int num11 = 7;
			 	System.out.println(num10 * num11);
			 	
		/*13*/
			 String name ="Baba Shunta";
			 int age = 23;
			 age = age + 1;
			 	System.out.println(name + "は次の誕生日で" + age +"歳です。");
			 	
		/*14*/
			 int num12 = 8;
			 int num13 = 3;
			 	System.out.println(num12 + num13);
			 	System.out.println(num12 - num13);
			 	System.out.println(num12 * num13);
			 	System.out.println(num12 / num13);
			 	
		/*15*/
			 int test1 = 75;
			 int test2 = 88;
			 int test3 = 92;
			 int sum = test1 +test2 +test3;
			 	System.out.println(sum / 3);
			 	
		/*16*/
			 int price = 12000;
			 double discount = 0.3;
			 double price2 = price * discount;
			 double price3 = price - price2;
			 	System.out.println((int)price3);
	}		
	
}
