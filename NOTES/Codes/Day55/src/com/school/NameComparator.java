package com.school;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

	
	@Override
	public int compare(Student student1, Student student2) {
		//sort data by using name
		//return student1.name.compareTo(student2.name);
		
		//sort data by using salary
		if(student1.salary == student2.salary) {
			return 0;
		}else {
			if(student1.salary < student2.salary) {
				return 1;
			}
			return -1;
		}
		
	}

}
