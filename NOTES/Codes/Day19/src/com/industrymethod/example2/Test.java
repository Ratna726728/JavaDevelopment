package com.industrymethod.example2;

public class Test {
	public static Employee getEmployeeDetails() {
		int id = 10;
		String name = "Vishal";
		String city = "Nagpur";
		
		return new Employee(id, name, city);
	}
	public static void main(String[] args) {
		Employee e = getEmployeeDetails();
		System.out.println("id = "+e.id);
		System.out.println("name = "+e.name);
		System.out.println("city = "+e.city);
	}

}
