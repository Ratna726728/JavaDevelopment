package com.usingcomparable;

public class Employee implements Comparable<Employee>{

	int id;
	String name;
	int salary;
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	//sort data by using salary, comparision, id 
	@Override
	public int compareTo(Employee employee) {
		// equal must return 0, > return 1, < return -1
		if (salary == employee.salary)
			return 0;
		else {
			if (salary < employee.salary) {
				return 1;
			}
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	

}