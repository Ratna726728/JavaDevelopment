//program to create Non-static method
public class NonStaticExample {
	
	public void print() {
		System.out.println("this is non static method");
	}
	
	public static void main(String[] args) {
		
		//calling of print() method
		NonStaticExample nonStaticExample = new NonStaticExample();
		nonStaticExample.print();
	}
}
