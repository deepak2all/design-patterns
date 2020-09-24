package creational.singleton.log2;

public class LoggerTest2 {

	public static void main(String[] args) {
		Logger2 logger1 = Logger2.getInstance();
		Logger2 logger2 = Logger2.getInstance();
		Logger2 logger3 = Logger2.getInstance();
		System.out.println("HASHCODES's of SINGLETON OBJECTS");
		System.out.println(logger1.hashCode());
		System.out.println(logger2.hashCode());
		System.out.println(logger3.hashCode());
		System.out.println("=========================================");
		
		LoggerTest2 loggerTest1 = new LoggerTest2();
		LoggerTest2 loggerTest2 = new LoggerTest2();
		LoggerTest2 loggerTest3 = new LoggerTest2();
		System.out.println("HASHCODES's of NON-SINGLETON OBJECTS");
		System.out.println(loggerTest1.hashCode());
		System.out.println(loggerTest2.hashCode());
		System.out.println(loggerTest3.hashCode());
		System.out.println("=========================================");
	}

}
