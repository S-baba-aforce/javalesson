package jp.co.aforce.sample;

public class BookData0502 {
	
	private String title;
	private String name;
	private int quantity;
	private int price;
	
	public BookData0502 (String title, String name, int quantity, int price) {
		this.title = title;
		this.name = name;
		this.quantity =quantity;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public int calcTotal() {
		return this.price +=price;
	}
	
	public double getRatio() {
		return (double)quantity/(double)price;
	}
}
