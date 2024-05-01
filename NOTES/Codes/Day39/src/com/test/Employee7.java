package com.test;

public class Employee7 {
	
	private int id;
	private String name;
	private String salary;
	
	public Employee7(int id, String name, String salary) {
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

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

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee7 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	

}