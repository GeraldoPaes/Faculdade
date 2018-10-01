public class Book {
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	
	public Book(String name, Author author, double price, int qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Author getAuthor() {
		return this.author;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double p) {
		this.price = p;
	}
	
	public int getQtyInStock() {
		return this.qtyInStock;
	}
	
	public void setQtyInStock(int q) {
		this.qtyInStock = q;
	}
	
	public String toString() {
		return "BOOK'S INFORMATION:\nName: " + this.name + "\nAuthor: " + this.author.getName() + "\nPrice: R$" + this.price + "\nStock: " + this.qtyInStock;
	}
}
