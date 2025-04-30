package jp.co.aforce.sample;

//2

public class Student0430 {
	static String schoolName = "A-force高等学校";
	String name;
	
	public Student0430(String name) {
		this.name = name;
		
	}
	
	public static void main(String[] args) {
		Student0430 s1 = new Student0430("sohee");
		Student0430 s2 = new Student0430("wonbin");
		Student0430 s3 = new Student0430("anton");
		
		System.out.println(s1.name + "は" + schoolName + "の生徒です。");
		System.out.println(s2.name + "は" + schoolName + "の生徒です。");
		System.out.println(s3.name + "は" + schoolName + "の生徒です。");
	}

}
