package jp.co.aforce.sample;

public class MultipleCatchTest0501 {

	public static void main(String[] args) {
		
		
		
//		try {
//			String str = null;
//			System.out.println(str.length());
//		} catch (ArithmeticException e) {
//			System.out.println("ArithmeticException が発生しました");
//		} catch (NullPointerException e) {
//			System.out.println("NullPointerException が発生しました");
//		} catch (Exception e) {
//			System.out.println("Exception が発生しました");
//		}
		
		try {
			System.out.println("try ブロック開始");
			throw new RuntimeException("エラー発生");
		} catch (Exception e) {
			System.out.println("catch ブロック: " + e.getMessage());
		} finally {
			System.out.println("finally ブロック");
		}
		System.out.println("プログラム終了");
	}

}
