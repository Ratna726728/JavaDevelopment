package com.industrymethod.example1;

public class Test {
	
	public static Employee getEmployeeById() {
		int id = 10;
		return new Employee(id);
	}
	
	public static void main(String[] args) {
		Employee e = getEmployeeById();
		System.out.println(e.id);
	}

}
