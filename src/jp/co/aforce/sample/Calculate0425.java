package jp.co.aforce.sample;

/*========オーバーロード=問１=========*/

public class Calculate0425 {
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
	public static void main(String[] args) {
		int total1 = sum (3, 5);
		int total2 = sum (24, 53, 47);
		
		System.out.println("2つの整数の和は" + total1);
		System.out.println("3つの整数の和は" + total2);
	}
}
