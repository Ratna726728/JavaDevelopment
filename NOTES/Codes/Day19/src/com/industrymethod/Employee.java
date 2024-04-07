package com.industrymethod;

public class Employee {
	
	int id = 101;
	String name = "Rajat";
	String city = "mumbai";
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	public Employee addEmployee() {
		
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setCity(city);
		return emp;
		
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		Employee employee = e.addEmployee();
		System.out.println("Employee data is : "+employee);
	}

}
