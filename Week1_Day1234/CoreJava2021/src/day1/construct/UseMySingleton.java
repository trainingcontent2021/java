package day1.construct;

public class UseMySingleton {

	public static void main(String[] args) {
		MySingleton a = MySingleton.getInstance();
	       MySingleton b = MySingleton.getInstance();
	       a.x = a.x + 10;
	       System.out.println("Value of a.x = " + a.x);
	       System.out.println("Value of b.x = " + b.x);

	}

}
