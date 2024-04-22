package com.methods;
//int length() method.
public class Example {

	public static void main(String[] args) {
		String str = "lower case upper case";
		System.out.println("the string str is : "+str);
		//finding the length of string
		int length = str.length();
		System.out.println("Length of str is : "+length);
		//finding the character at specific index
		char c = str.charAt(4);
		System.out.println("character at index 4 is : "+ c);
		//substring from a specific index point
		String str1 = str.substring(3);
		System.out.println("Substring is : "+ str1);
		//substring from a specific index to specific index
		String str2 = str.substring(3, 8);
		System.out.println("Substring is : "+ str2);
		//concatation
		String str3 = "italic bold";
		String output = str.concat(str3);
		System.out.println("New concated string is : "+ output);
		//return index of value
		int result = str.indexOf("upper");
		System.out.println("index of upper is : "+ result);
		int result1 = str.indexOf("means");
		System.out.println("index of means is : "+ result1);
		//return index of specific value
		int output1 = str.indexOf("se", 3);
		System.out.println("character from index 3 is found at :"+output1);
		//return the last index of character
		int result2 = str.lastIndexOf("case");
		System.out.println("last index of character case is : "+ result2);
		//boolean equals
		boolean out = str.equals("lower case upper case");
		System.out.println("result is : "+out);
		boolean out1 = str.equals("LOWER CASE UPPER CASE");
		System.out.println("result is : "+out1);
		//boolean  equalsIgnoreCase (String anotherString)
		boolean out2 = str.equalsIgnoreCase("lower case upper case");
		System.out.println(out2);
		boolean out3 = str.equalsIgnoreCase("Lower case upper case");
		System.out.println(out3);
	}
}
