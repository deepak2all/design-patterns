package creational.singleton.log3;

import java.io.Serializable;

/*
 * To prevent object creation
 * 1. By Cloning (or)
 * 2. Through Serialization
 * 3. Any additional thread that managed to enter the lock
 * 4. By Reflection
 */
public class Logger3 implements Serializable, Cloneable {

	private static final long serialVersionUID = 431153858666304894L;
	private static volatile Logger3 logger3 = null;

	private Logger3(){
		
	}
	
	public static Logger3 getInstance(){
		// Added synchronized keyword to address multithreading
		if(logger3 == null){
			synchronized(Logger3.class){
				// Check if some instance was created while locking
				// DOUBLE CHECKED LOCKING is addressing by making
				// logger3 "volatile"
				// Write happens before read in case of "volatile"
				// So no have baked objects will be created
				if(logger3 == null){
					logger3 = new Logger3();
				}
			}
		}
		return logger3; 
	}
	//Added to address Serialization
	private Object readResolve()  {
		System.out.println("Resolving to address Serialization");
	    return logger3;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		//return super.clone();
		// Done to address cloning
		return logger3;
	}
}
