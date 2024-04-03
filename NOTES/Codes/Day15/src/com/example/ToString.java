package com.example;

public class ToString {
	int id;
	String name;
	String city;
	@Override
	public String toString() {
		return "ToString [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	public static void main(String[] args) {
		ToString to = new ToString();
		to.id=3;
		to.name="Raj";
		to.city="Nagpur";
		
		System.out.println(to);
		//output:
		//ToString [id=3, name=Raj, city=Nagpur]
	}
	
	
}