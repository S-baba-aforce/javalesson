package jp.co.aforce.sample;

//1

public class Counter0430 {

			/*静的フィールドをcountを定義*/
			static int count = 0;
			
			/*countをインクリメントするメソッドを作成*/
			public Counter0430 () {
				count ++;
			}
			
			/*複数のインスタンスを生成してcountの値を表示*/
			public static void main(String[] args) {	
				Counter0430 num1 = new Counter0430();
				Counter0430 num2 = new Counter0430();
				Counter0430 num3 = new Counter0430();
				
				System.out.println("カウント" + Counter0430.count);
	}

}
