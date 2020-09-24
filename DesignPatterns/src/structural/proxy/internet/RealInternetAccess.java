package structural.proxy.internet;

public class RealInternetAccess implements OfficeInternetAccess {
	
	private String employeeName;
	
	public RealInternetAccess(String empName){
		this.employeeName = empName;
	}

	@Override
	public void grantInternetAccess() {
		// TODO Auto-generated method stub
		System.out.println("Internet access granted for employee: " + employeeName);
	}

}
