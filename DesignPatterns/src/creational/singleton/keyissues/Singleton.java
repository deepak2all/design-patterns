package creational.singleton.keyissues;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable{
	// But the best approach is creating Singleton using ENUM
	// as per jdk1.5
	// as it automatically addresses reflection, serialization
	// cloning and multi-threading
	/**
	 * 
	 */
	private static final long serialVersionUID = -1359597140832338680L;
	private static volatile Singleton mySingleton = null;
	
	private Singleton(){
		// Added to address Reflection
		/*if (mySingleton != null){
			throw new RuntimeException("Cannot create.. please use getInstance()");
		}*/
	}
	
	public static Singleton getInstance(){
		// Added synchronized keyword to address multithreading
		if(mySingleton == null){
			synchronized(Singleton.class){
				// Check if some instance was created while locking
				// DOUBLE CHECKED LOCKING is addressing by making
				// mySingleton "volatile"
				// Write happens before read in case of "volatile"
				// So no have baked objects will be created
				if(mySingleton == null){
					mySingleton = new Singleton();
				}
			}
		}
		return mySingleton; 
	}
	
	protected Object clone() throws CloneNotSupportedException{
		//return super.clone();
		// Done to address cloning
		return mySingleton;
	}
	
	//Added to address Serialization
	private Object readResolve()  {
		System.out.println("Resolving to address Serialization");
	    return mySingleton;
	}
}
