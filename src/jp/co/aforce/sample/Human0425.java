package jp.co.aforce.sample;

public class Human0425 {
	String name;
	int age;
	
	//コンストラクターの定義
	public Human0425(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//メソッド
	public void takeInfo () {
		//名前と年齢を表示
		System.out.println("名前は" + name + "です。年齢は" + age +"です。");
	}

}
