package com.collections.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
	
	public static void main(String args[]) {
		
		ArrayList list = new ArrayList<String>();
		
		//by using final keyword we can modify, access and manipulate but cannot make reference 
		//to new List
		final List<String> l = new ArrayList<>();
		l.add("vamsi");
		l.add("varma");
		System.out.println(l);
//		l = new ArrayList<String>();
		
		
	}
	
}
