//program to print name using method.
public class MethodExample {
	
	//method to print name on console
	public String printName(String str) {
		System.out.println("My name is "+str);
		return str;
	}
	
	public static void main(String[] args) {
		String name = "Ratnadeep";
		
		//creating object of MethodExample class
		MethodExample methodExample = new MethodExample();
		
		//calling printName() method using object of class
		methodExample.printName(name);
	}

}
