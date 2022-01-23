package com.oops.practice;

import java.util.HashMap;
import java.util.Map;

public class Demo {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1, "vamsi",800);
		Employee emp2 = new Employee(1, "vamsi",9000);
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp1.equals(emp2));
		
		Map<Employee, String> map = new HashMap<Employee, String>();
		map.put(emp1, "India");
		map.put(emp2, "hos");
		
		System.out.println("size "+map.size());
		System.out.println(map.get(emp2));
		
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		
		System.out.println(i1.equals(i2));
		System.out.println(i2.hashCode());
		
	}

}
