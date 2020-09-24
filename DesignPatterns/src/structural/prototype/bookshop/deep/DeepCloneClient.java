package structural.prototype.bookshop.deep;

public class DeepCloneClient {

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
		 * PROTOTYPE --> Using Deep Copy / Deep Cloning
		 * Creating of a new object using prototyping
		 * prevents fetching of data from DB
		 * (for this object)
		 * as loadData() method isn't called
		 */
		try {
			BookShop bs3 = bs1.clone();
			bs3.setShopName("Deep Clone");
			System.out.println(bs3);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		/*
		 *  The following are the steps involved in DEEP COPY
		 *  1. Use newObj = origObj.clone(), instead of creating object using "new" keyword
		 *  2. Make sure existing object implements the MARKER INTERFACE "Cloneable"
		 *     (as the clone() method is "protected" and henceforth isn't visible until
		 *     the marker interface is implemented)
		 *  3. Make sure the existing object overrides the clone() method, inside its class
		 *  4. Modify the clone() method to
		 *  	(a) Return the actual class instead of object
		 *  	(b) Write logic to copy the whatever data you need, into the new object created
		 */
		
		/*
		 * DEEP COPY resolves the issue that occurred with SHALLOW COPY
		 */
		try {
			System.out.println();
			System.out.println("***********************************************************");
			System.out.println("DEEP COPY resolves the issue that occurred with SHALLOW COPY");
			System.out.println("***********************************************************");
			BookShop bs4 = (BookShop) bs1.clone();
			System.out.println("====================================================");
			bs1.getBooks().remove(2);
			System.out.println("List of books in shop#1 after removal of book 3 from shop#1");
			System.out.println(bs1);
			System.out.println("====================================================");
			System.out.println("List of books in shop#4 after removal of book 3 from shop#4");
			System.out.println(bs4);
			System.out.println("====================================================");
			System.out.println(
					"We see removal of book from shop#1 is NOT impacting shop#4.\n"
					+ "Hence it's data matches with the DB data) \n"
					+ "This heppens because shop#4 is having an object of its own \n");
			System.out.println("DEEP COPY create multiple objects \n"
					+ "Then, it copies the reqd. data from the existing object to the new object \n");
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
