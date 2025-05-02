package jp.co.aforce.sample;

public class ExceptionPractice0501 {

	public static void main(String[] args) {
		
		/*1*/
		
//		String str = null;
//		System.out.println(str.length());               //ここでヌルポが発生
//		System.out.println("プログラムは継続します");   //→表示されない
	
		/*2*/
		
//		str2 = null;
//		try {
//			System.out.println(str2.length());
//		} catch (NullPointerException e) {
//			System.out.println("ヌルポが発生しました：" + e.getMessage());
//		}
//		System.out.println("プログラムは継続します");
		
		/*3*/
	
//		String str3 = null;
//		try {
//			int[] nums = {1,2,3};
// 			System.out.println(nums[5]);  //→ ArrayIndexOutOfBoundsException が発生
//		} catch (NullPointerException e) {
//			System.out.println("ヌルポが発生しました：" + e.getMessage());
//		}
//		
//		System.out.println("プログラムは継続します");
		
		
		
		/*4*/
		try {
			int age = 15;
			if (age < 18) {
				throw new IllegalArgumentException("18歳未満は登録できません。");
			}
			System.out.println("登録が完了しました。");
		} catch (IllegalArgumentException e) {
			System.out.println("例外が発生しました：" + e.getMessage());
		}
		
	}

}
