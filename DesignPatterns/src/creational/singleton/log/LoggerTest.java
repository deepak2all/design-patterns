package creational.singleton.log;

public class LoggerTest {

	public static void main(String[] args) {
		// 1. Prevent obj creation via Constructor
//		   Logger logger = new Logger();
		/* To prevent crating multiple instances,
		 * we need to prevent obj creation via
		 * Constructor.
		 * Can do this by making it Private
		 */
		
		/*
		 * Since there's NO public constructor
		 * we create a public method called getInstance
		 * to create only single instance of Logger
		 * (by checking for "null" condition)
		 */
		/*
		 * Also the method should be static
		 * as object can be created for this class
		 */
		Logger logger1 = Logger.getInstance();
		Logger logger2 = Logger.getInstance();
		Logger logger3 = Logger.getInstance();
		System.out.println("2 different obj will ALWAYS have diff hash codes");
		System.out.println("HASHCODES's of SINGLETON OBJECTS");
		System.out.println(logger1.hashCode());
		System.out.println(logger2.hashCode());
		System.out.println(logger3.hashCode());
		System.out.println("=========================================");
		
		LoggerTest loggerTest1 = new LoggerTest();
		LoggerTest loggerTest2 = new LoggerTest();
		LoggerTest loggerTest3 = new LoggerTest();
		System.out.println("HASHCODES's of NON-SINGLETON OBJECTS");
		System.out.println(loggerTest1.hashCode());
		System.out.println(loggerTest2.hashCode());
		System.out.println(loggerTest3.hashCode());
		System.out.println("=========================================");
	}

}
