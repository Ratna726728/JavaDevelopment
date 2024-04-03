package com.inheritance.types.hirarchical;

public class Test {

	public static void main(String[] args) {
		
		HomeLoan home = new HomeLoan();
		CarLoan car = new CarLoan();
		PersonalLoan personal = new PersonalLoan();
		
		//homeloan class and loan class can access
		home.getHomeLoanDetails();
		home.getLoanDetails();
		
		//carloan class and loan class can access
		car.getCarLoanDetails();
		car.getLoanDetails();
		
		//personalloan class and loan class can access
		personal.getPersonalLoanDetails();
		personal.getLoanDetails();
	}
}
