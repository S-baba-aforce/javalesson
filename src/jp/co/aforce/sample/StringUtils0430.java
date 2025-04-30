package jp.co.aforce.sample;

public class StringUtils0430 {
	public static String toUpperCase(String letter) {
		return letter.toUpperCase();
	}
	public static void main(String[] args) {
		String small = StringUtils0430.toUpperCase("apple");
		System.out.println("大文字は" + small);

	}

}
