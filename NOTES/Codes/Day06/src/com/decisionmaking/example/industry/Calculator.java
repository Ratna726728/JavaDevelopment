package com.decisionmaking.example.industry;

public class Calculator {

	public static void main(String[] args) {
		CalculatorTest calculatorTest = new CalculatorTest();
		
		String operation = "Multiplication";
		
		switch(operation){
		case "Addition":
			int add = calculatorTest.getAddition(10, 20);
			System.out.println("Addition is >> "+ add);
			break;
		case "Subtraction":
			int sub = calculatorTest.getSubtraction(10, 20);
			System.out.println("Subtraction is >> "+ sub);
			break;
		case "Multiplication":
			int mult = calculatorTest.getMultiplication(10, 20);
			System.out.println("Muliplication is >> "+ mult);
			break;
		case "Division":
			int div = calculatorTest.getDivision(10, 20);
			System.out.println("Division is >> "+ div);
			break;
		default:
			System.out.println("Incorrect choice. Please provide proper choice again");
		}
	}
}
