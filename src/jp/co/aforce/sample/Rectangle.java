package jp.co.aforce.sample;

/*=============オーバーロード　問２=============*/

public class Rectangle {
	int width;
	int height;
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public Rectangle(int width) {
		super();
		this.width = width;
		this.height = width;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getArea (int width,int height) {
		return width * height;
	}

	
}
