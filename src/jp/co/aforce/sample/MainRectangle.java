package jp.co.aforce.sample;

public class MainRectangle {
	public static void main(String[] args) {
		
		//長方形　　幅10、高さ5
		Rectangle rect1 = new Rectangle(10,5);
		int area = rect1.getArea(10,5);
		
		//正方形　　幅10、高さ10
		Rectangle square = new Rectangle(10,10);
		int area2 = square.getArea(10,10);
		
		
		System.out.println("rect1の面積は" + area +"\nsquareの面積は" + area2);
		
	}

}
