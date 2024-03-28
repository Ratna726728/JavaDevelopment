package com.constructors.example;

public class OverExample {
	
	int id;
	String name;
	String city;
	
	public OverExample(int userId, String userName, String userCity) {
		System.out.println(userId);
		System.out.println(userName);
		System.out.println(userCity);
		id = userId;
		name = userName;
		city = userCity;
		
	}
	public OverExample(String userName, int userId, String userCity) {
		System.out.println(userId);
		System.out.println(userName);
		id = userId;
		name = userName;
	}
	public static void main(String[] args) {
		OverExample overExample = new OverExample(10, "Rohit","Mumbai");
		
		OverExample overExample1 = new OverExample("Manish", 25, "Nagpur");
	}

}
