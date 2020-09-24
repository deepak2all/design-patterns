package creational.singleton.log3;

public class LoggerTest3 {

	public static void main(String[] args) {
		Logger3 logger1 = Logger3.getInstance();
		Logger3 logger2 = Logger3.getInstance();
		Logger3 logger3 = Logger3.getInstance();
		System.out.println("HASHCODES's of SINGLETON OBJECTS");
		System.out.println(logger1.hashCode());
		System.out.println(logger2.hashCode());
		System.out.println(logger3.hashCode());
		System.out.println("=========================================");
		
		LoggerTest3 loggerTest1 = new LoggerTest3();
		LoggerTest3 loggerTest2 = new LoggerTest3();
		LoggerTest3 loggerTest3 = new LoggerTest3();
		System.out.println("HASHCODES's of NON-SINGLETON OBJECTS");
		System.out.println(loggerTest1.hashCode());
		System.out.println(loggerTest2.hashCode());
		System.out.println(loggerTest3.hashCode());
		System.out.println("=========================================");
	}
}
