package jp.co.aforce.sample;

/*=============オーバーロード　問２=============*/

public class Rectangle {
	int weide;
	int height;
	
	public Rectangle(int weide, int height) {
		super();
		this.weide = weide;
		this.height = height;
	}

	public Rectangle(int weide) {
		super();
		this.weide = weide;
		this.height = weide;
	}
	
	public int getArea (int weide,int height) {
		return weide * height;
	}

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		rect1.getArea();
		Rectangle square = new Rectangle();
		square.getArea();
		
		
		System.out.println("rect1の面積は" + rect1 +"squareの面積は" + square);
	}

}
