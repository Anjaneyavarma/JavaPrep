package com.collections.practice;

import java.util.ArrayList;

public class CustomArrayList extends ArrayList{
	
	@Override
	public boolean add(Object e) {
		if(this.contains(e)) {
			return true;
		}
		else {
			return super.add(e);
		}
	}
	
	public static void main(String args[]) {
		
		CustomArrayList list = new CustomArrayList();
		
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(2);
		
		System.out.println(list);
	}

}
