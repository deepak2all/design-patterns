package structural.prototype.bookshop.shallow;

public class ShallowCloneClient {

	public static void main(String[] args) {
		
		/**
		 * Creating of a new object
		 * which involves fetching of data from DB
		 */
		BookShop bs1 = new BookShop();
		bs1.setShopName("Novelty");
		bs1.loadData();
		System.out.println(bs1);
		
		/**
		 * Creating of a new object without prototyping
		 * which involves fetching of data from DB again
		 * (for this object)
		 */
		BookShop bs2 = new BookShop();
		bs2.setShopName("New Novelty");
		bs2.loadData();
		System.out.println(bs2);
		
		/**
		 * PROTOTYPE --> Using Shallow Copy
		 * Creating of a new object using prototyping
		 * prevents fetching of data from DB
		 * (for this object)
		 * as loadData() method isn't called
		 */
		try {
			BookShop bs3 = (BookShop) bs1.clone();
			bs3.setShopName("Shallow Clone");
			System.out.println(bs3);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		/*
		 *  The following are the steps involved in SHALLOW COPY
		 *  1. Use newObj = origObj.clone(), instead of creating object using "new" keyword
		 *     Also clone() returns an "Object"; hence case it to the existing object's class type
		 *  2. Make sure existing object implements the MARKER INTERFACE "Cloneable"
		 *     (as the clone() method is "protected" and henceforth isn't visible until
		 *     the marker interface is implemented)
		 *  3. Make sure the existing object overrides the clone() method, inside its class
		 */
		
		/*
		 * Issue with SHALLOW COPY
		 */
		try {
			System.out.println();
			System.out.println("***********************************************************");
			System.out.println("Issue with SHALLOW COPY");
			System.out.println("***********************************************************");
			BookShop bs4 = (BookShop) bs1.clone();
			System.out.println("====================================================");
			bs1.getBooks().remove(2);
			System.out.println("List of books in shop#1 after removal of book 3 from shop#1");
			System.out.println(bs1);
			System.out.println("====================================================");
			System.out.println("List of books in shop#4 after removal of book 3 from shop#1");
			System.out.println(bs4);
			System.out.println("====================================================");
			System.out.println(
					"We see removal of book from shop#1 is also impacting shop#4,\n"
					+ "which shouldn't happen, ideally (since it should match the DB data) \n"
					+ "This heppens because shop#4 is not having any object of its own \n"
					+ "but is holding just a reference, which is pointing to \n"
					+ "the same object, that's shop#1 is pointing to \n");
			System.out.println("SHALLOW COPY doesn't create multiple objects but instead \n"
					+ "create multiple references, all pointing to the same object \n");
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
