package jp.co.aforce.sample;


public class ifpractice {                         
	public static void main(String args[]) {
		
	/*============if文============*/	
		int a = 50;
		int b = 50;
		if (a == b) {
			System.out.println("aとbの値は同じ");
		}
		
		boolean isSunny = false;
		if (isSunny ) {
				System.out.println("傘を持っていきましょう");
		}
		
		
		int temperature = 25;                         //if else文
		if (temperature >= 30) {
			System.out.println("真夏日です。");
		} else {
			System.out.println("真夏日ではありません。");		
		}
		
		
		int score = 75;                                //if else文
		if (score >= 80) {
			System.out.println("優");
		} else if (score >= 70) {
			System.out.println("良");
		} else if (score >= 60) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}
		
		
		int time = 14;                                 //if文　論理演算子との組み合わせ
		boolean isHoliday = false;
		
		if (isHoliday || (time<9 || time>18)) {
			System.out.println("勤務時間内です。");
		} else {
			System.out.println("勤務時間外です。");
		}
		
		
		boolean hasLicense = true;                      //入れ子
		boolean hasCar = true;
		
		if (hasLicense) {
			System.out.println("運転免許を持っています。");
			if (hasCar) {
				System.out.println("車も持っています。");
			} else {
				System.out.println("しかし、車は持っていません。");
			}
		} else {
			System.out.println("運転免許を持っていません。");
		}
		
		
	/*=========switch文==========*/
		
		String color = "yellow";
		String message;
		switch (color) {
				case "red":
					message = "停止してください。";
					break;
				case "yellow":
					message = "注意して下さい。";
					break;
				case "green":
					message = "進んでください。";
					break;
				default:                                        //基本マナーとして表示すべき。使わない場合はコメントで処理がないことを伝える。
					message ="不正な信号の色です。";
				}
		System.out.println("現在の信号:" + color + "-" + message);
	}
}
