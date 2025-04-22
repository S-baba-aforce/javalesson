package jp.co.aforce.sample;


/*3 変数 num に整数 7 を代入し、その整数が偶数か奇数かを判定するプログラム。*/
public class EvenOrOdd {
	public static void main(String args[]) {
		int num = 7;
		if (num % 2 == 0) {
		System.out.println(num + "は偶数");
		}	else {
		System.out.println(num + "は奇数");
		}
	}
}
