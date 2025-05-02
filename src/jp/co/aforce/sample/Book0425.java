package jp.co.aforce.sample;

//クラス基礎ー問3

public class Book0425 {
	String title;
	String author;
	int price;
	
	public void showInfo() {
		System.out.println("タイトル;" + title +"著者;" + author + "価格" + price);
	}
	
	public static void main(String[] args) {
		
		Book0425 book = new Book0425();
		
		book.title = "A";
		book.author = "Bob";
		book.price = 1500;
		
		book.showInfo();
		
	}

}
