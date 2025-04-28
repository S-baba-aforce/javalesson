package jp.co.aforce.sample;

public class MainPlayer0428 {
	public static void main(String[] args) {
		
		//Player1のインスタンス生成
		Player0428 p1 = new Player0428();
				
		//Player2のインスタンス生成
		Player0428 p2 = new Player0428();	
		
		
		System.out.println("初期状態");
		System.out.println("p1.hp=" + p1.hp1);
		System.out.println("p2.hp=" + p2.hp2);
		
		
		//p1だけがダメージを受ける
		p1.hp1 -= 30;
		
		
		System.out.println("\nダメージ後");
		System.out.println("p1.hp=" + p1.hp1);
		System.out.println("p2.hp=" + p2.hp2);
		
	
	}

}
