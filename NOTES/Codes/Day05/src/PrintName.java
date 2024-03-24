// Design the separate method as String getStudentName (String name) which return student name and print it.
public class PrintName {
	
	public String getStudentName(String name) {
		System.out.println("The student name >> "+name);
		return name;
	}
	public static void main(String[] args) {
		String s1 = "Aditya";
		
		//creating the object of class
		PrintName printname = new PrintName();
		printname.getStudentName(s1);
	}

}
