package com.test;
//Design method void multTable (int no) and print 
//the multiplication table. ( Example enter the no=5 then 
//output like 5*1=5.......5*10=50)

import java.util.Scanner;

public class Table {
	
	public static void multTable(int a) {
		for(int i=1;i<=10; i++) {
		
			System.out.println(a+"*"+i+"="+(a*i));
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the number for which you want to print table: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		multTable(num);
	}

}
