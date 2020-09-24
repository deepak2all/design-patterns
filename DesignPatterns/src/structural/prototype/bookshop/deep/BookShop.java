package structural.prototype.bookshop.deep;

import java.util.ArrayList;
import java.util.List;

/**
 * loadData is the method that connects to DB and fetches the book details
 * In order to prevent multiple fetches, across multiple objects,
 * the bookshop object can be cloned and assigned while creating subsequent objects
 * 
 */
public class BookShop implements Cloneable{
	public String shopName;
	List<Book> books = new ArrayList<>();
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getBooks() {
		return books;
	}
	
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void loadData() {
		// Use JDBC url to get the connection object
		// Get the statement obj
		// Execute the query
		// Store the results in the result set
		// Iterate to load data from result set
		for(int i=1; i<=10; i++){
			Book b = new Book();
			b.setBookId(i);
			b.setBookName("Book " + i);
			getBooks().add(b);
		}
		
	}

	
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		BookShop deepClonedShop = new BookShop();
		//deepClonedShop.setBooks(this.getBooks()); //Doesn't return desired result
		
		/*for(Book b: this.getBooks()){
			deepClonedShop.getBooks().add(b);
		}*/
		// Converting enhanced for-loop to lambda
		this.getBooks().stream().forEach(x -> deepClonedShop.getBooks().add(x));
		return deepClonedShop;
	}
	
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", books=" + books + "]";
	}
	
}
