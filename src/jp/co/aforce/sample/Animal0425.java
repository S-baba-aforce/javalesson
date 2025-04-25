package jp.co.aforce.sample;

//オーバーライド　問１
/*==========動物クラス============-*/

public class Animal0425 {
	
	public void makeSound() {
		System.out.println("動物の鳴き声");
	}
	public static void main(String[] args) {
	Animal0425 animal = new Dog0425();
		animal.makeSound();
	Animal0425 animal2 = new Cat0425();
		animal2.makeSound();	
	}
	
	
}
