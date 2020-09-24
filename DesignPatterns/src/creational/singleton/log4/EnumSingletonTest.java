package creational.singleton.log4;

public class EnumSingletonTest {

	public static void main(String[] args) {
		System.out.println("Default behaviour of Singleton");
		EnumSingleton s1 = EnumSingleton.INSTANCE;
		//EnumSingleton s2 = new EnumSingleton(); // Can't be instantiated
		System.out.println("ENUM s1:: " + s1.hashCode());
		EnumSingleton s2 = EnumSingleton.INSTANCE;
		System.out.println("ENUM s2:: " + s2.hashCode());
	}
	
	// Singleton can also be replaced with utility class with static members 
	// and static methods.
	// Though it works theoritically it doesn't support Go4 which states
	// the Singleton as
	// Sole instance that's extensible by sub-classing and clients should
	// be able to extend instance without modifying the code
}
