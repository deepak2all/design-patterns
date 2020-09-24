package creational.singleton.log2;

/**
 * We are using synchronized block
 * to prevent modification by multiple threads
 */
public class Logger2 {
	//private static Logger2 logger2;
	private static volatile Logger2 logger2 = null;
	
	private Logger2(){
		
	}
	
	public static Logger2 getInstance(){
		if(logger2 == null) {
			synchronized (Logger2.class) {
				logger2 = new Logger2();
			}
		}
		return logger2;
	}
}
