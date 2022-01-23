package com.oops.practice;

import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class WordOccurance {
	
	public static void main(String[] args) {
		
		String str = "I am am learning java java java";
		
		String[] loop = str.split(" ");
		
		Set<String> set = new HashSet<>();
		
		for(String l : loop) {
			set.add(l);
		}
		
		//word occurance
		for(String s : set) {
			int count = 0;
			for(int i=0;i<loop.length;i++) {
				if(s.equals(loop[i])) {
					count++;
				}
			}
			System.out.println(s+"-"+count);
		}
		
		//duplicate occurance
		System.out.println();
		for(String s : set) {
			int count = 0;
			for(int i=0;i<loop.length;i++) {
				if(s.equals(loop[i])) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(s+"-"+count);
			}
		}
		
	}
	
}
