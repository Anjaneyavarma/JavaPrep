package com.collections.practice;

import java.util.HashSet;
import java.util.Set;

import com.oops.practice.Employee;

public class SetImplementation {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("vamsi");
		set.add("vamsi");
		set.add("varma");
		
		System.out.println(set);
		
		Employee emp1 = new Employee(1, "vamsi",800);
		Employee emp2 = new Employee(1, "vamsi",800);
		Set<Employee> empSet = new HashSet<>();
		empSet.add(emp2);
		empSet.add(emp1);
		
		System.out.println(empSet);
	}

}
