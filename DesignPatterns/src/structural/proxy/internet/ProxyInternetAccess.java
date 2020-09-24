package structural.proxy.internet;

public class ProxyInternetAccess implements OfficeInternetAccess {

	private String employeeName;
	
	// Using composition over inheritance (Object used as a field variable)
	private RealInternetAccess realaccess;
	
	public ProxyInternetAccess(String employeeName) {
		// TODO Auto-generated constructor stub
		this.employeeName = employeeName;
	}

	@Override
	public void grantInternetAccess() {
		// TODO Auto-generated method stub
		if(getRole(employeeName) > 4 ){
			// Creating the object of a different class
			// which has the same method grantInternetAccess
			realaccess = new RealInternetAccess(employeeName);
			realaccess.grantInternetAccess();
		}
		else {
			System.out.println("No internet access granted. Your job level is below 5");
		}
	}

	private int getRole(String employeeName) {
		// TODO Auto-generated method stub
		// Check role from the database based on the Name and designation
		// return job level or job designation
		return (int) Math.floor((Math.random() * 10) + 1);
	}

}
