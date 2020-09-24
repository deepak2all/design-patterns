package creational.singleton.keyissues;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TestSingleton {
	public static void main(String[] args) {
		System.out.println("Default behaviour of Singleton");
		Singleton s1 = Singleton.getInstance();
		//Singleton s2 = new Singleton(); // Restricted using private constructor
		System.out.println("s1:: " + s1.hashCode());
		Singleton s2 = Singleton.getInstance();
		System.out.println("s2:: " + s2.hashCode());
		
		/*
		 * Need to make sure it doesn't break because of
		 * 1. Reflection
		 * 2. Serialization / de-serialization
		 * 3. Cloning
		 * 4. Multi-threaded classes
		 * 5. Multiple class loaders
		 * 6. Garbage collection
		 */
		
		// Using REFLECTION to Break Singleton
		System.out.println("Using REFLECTION to Break Singleton");
		try {
			Class<Singleton> clazz = (Class<Singleton>) Class.forName("com.singleton2.Singleton");
			Constructor<Singleton> cSingleton = clazz.getDeclaredConstructor();
			cSingleton.setAccessible(true);
			Singleton s3 = cSingleton.newInstance();
			System.out.println("s3:: " + s3.hashCode());
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Addressed by throwing RuntimeException in constructor if already an
		// instance exists
		
		System.out.println("Using SERIALIZATION / DESERIALIZATION to Break Singleton");
		// Using SERIALIZATION / DESERIALIZATION to Break Singleton
		// Works only if the Singleton class implements "Serializble" interface
		// Otherwise you'll get java.io.NotSerializableException ...
		// SERIALIZATION --> Storing the obj as a file to transfer it across a network
		// NOTE :: private static final long serialVersionUID 
		// The JVM associates a version (long) number with each serializable class. 
		// It is used to verify that the saved and loaded objects have the same attributes and thus are compatible on serialization.
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\MISC2\\tmp\\s2.ser"));
			oos.writeObject(s2);
			
			//Read it back using DESERIALIZATION
			ObjectInputStream ios = new ObjectInputStream(new FileInputStream("E:\\MISC2\\tmp\\s2.ser"));
			Singleton s4 = (Singleton) ios.readObject();
			System.out.println("s4:: " + s4.hashCode());
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Using CLONING to Break Singleton");
		// Using CLONING to Break Singleton
		// Works only if the Singleton class implements "Cloneable" interface
		// and henceforth overrides clone() in the Singleton class 
		try {
			Singleton s5 = (Singleton) s2.clone();
			System.out.println("s5:: " + s5.hashCode());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Breaking Singleton using Multi-threading
		// This happens when multiple threads try to create Singleton object
		// This mainly happens in cases of lazy loading
		// EAGER LOADING 
		// private static Singleton mySingleton = new Singleton();
		// Adv:: Prevents break during mult-threading
		// Disadv:: 
		// 1) Creating instance unnecessarily without knowing when it'd be used
		// 2) If the initial loading fails when classloader tries to load, the subsequently loads won't happen
		// until we re-load that class
		// So we delay it until it's demanded
		
		// Here we'll use a method useSingleton which creates Singleton instances
		// We'll assume that the method is called by two threads at same time
		ExecutorService service = Executors.newFixedThreadPool(2);
		System.out.println("Printing hashcodes of objects created using multi-threading");
		service.submit(TestSingleton::useSingleton);
		service.submit(TestSingleton::useSingleton);
		service.shutdown();
		// This can be handled by making getInstance as "synchronized"
		
		// Breaking Singleton using Classloaders
		// Generally a classloader checks if a class is loaded by parent classloader
		// If parent classloader doesn't load, it's then loaded by the child classloader
		// But imagine a case where classloaders doesn't share parent-child relationship
		// If web container has singleton the webapp class loader will load the singleton
		// Also if we are referring to singleton in EAR as well, then app container will
		// also load the singleton at the same time and hence
		// we'd have 2 separate instances of Singleton in the same JVM
		
		
		// GARBAGE collection
		// This happens only in version 1.1 were even static classes were garbage collected
		// This issue is addressed in the subsequent versions of JDK
		
		
		// Scenarios in real life
		// 1. Runtime in JDK --> You'd have only one runtime for running an appln
		// 2. Log Manager --> Hold logs config accros happen so that it's uniform
		// 3. Heavy cache
		// 4. Resource management --> Eg. Database connection
		
	}
	
	static void useSingleton(){
		Singleton s = Singleton.getInstance();
		System.out.println(s.hashCode());
	}
	
}
