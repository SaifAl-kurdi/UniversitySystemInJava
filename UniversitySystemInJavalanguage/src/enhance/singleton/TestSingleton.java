package enhance.singleton;

public class TestSingleton {

	public static void main(String[] args) {

		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		Singleton singleton3 = Singleton.getInstance();

		
		System.out.println("The first user pointer is: " + singleton1);
		System.out.println("The secound user pointer is: " + singleton2);
		System.out.println("The third user pointer is: " + singleton3);

		if (singleton1 == singleton2 && singleton2 == singleton3) {
			System.out.println("Three objects for user are pointing to the same memory location");
		}

	}

}
