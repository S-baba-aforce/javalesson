package jp.co.aforce.sample;

//オーバーライド　問２

public class Ningen0425 {
	
	public String toString(String name, int age) {
		return name + age;
	}
	public static void main(String[] args) {
		Ningen0425 ningen = new Ningen0425(); 
		System.out.println(ningen.toString("Teahyun",26));
		Ningen010425 ningen2 = new Ningen010425(); 
		System.out.println(ningen2.toString("Boemgyu",24));
	}	
}

class  Ningen010425 extends Ningen0425 {
	
	public String toString(String name, int age) {
		return name + age;
	}	
}
	
