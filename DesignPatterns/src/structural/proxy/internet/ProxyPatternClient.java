package structural.proxy.internet;

public class ProxyPatternClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OfficeInternetAccess access = new ProxyInternetAccess("Deepak K");
		access.grantInternetAccess();
		access = new ProxyInternetAccess("Dev");
		access.grantInternetAccess();
	}
	
	/**
	 * The primary difference between decorator and proxy patterns are the
	 * reponsibilitied they bear
	 * Decorators focus on adding responsibilities
	 * but proxies focus on controlling the access to an object.
	 */

}
