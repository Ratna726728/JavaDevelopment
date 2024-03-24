//Program to create a static method
public class StaticExample {
	
	//a method which is define with static keyword
	public static void test() {
		System.out.println("This is a static method test");
	}
	
	public static void main(String[] args) {
		//we can call static method by three ways
		
		System.out.println("First way- By using class name");
		StaticExample.test();
		System.out.println();
		
		System.out.println("Second way- By creating object of class");
		StaticExample staticExample = new StaticExample();
		staticExample.test();
		System.out.println();
		
		System.out.println("Third way- By method name only");
		test();
	}

}
