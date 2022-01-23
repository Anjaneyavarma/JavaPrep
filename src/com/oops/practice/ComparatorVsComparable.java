package com.oops.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorVsComparable {
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(1,"Akhil",8000));
		list.add(new Employee(3, "Abhi",9000));
		list.add(new Employee(2,"vamsi",10000));

		Collections.sort(list);
		
		for(Employee e : list) {
			System.out.println(e);
		}
	}

}
