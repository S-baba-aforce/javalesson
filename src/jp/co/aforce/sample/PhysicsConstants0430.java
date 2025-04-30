package jp.co.aforce.sample;

public class PhysicsConstants0430 {
	public static final double speed = 9.8; //  m/s2
	

	public static void main(String[] args) {
		double time = 10; //秒
		double distance = speed * time;
		System.out.println("光が一秒間に進む距離は" + distance );

	}

}
