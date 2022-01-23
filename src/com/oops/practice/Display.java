package com.oops.practice;

class DisplayBase {
	
	public static void hello() {
		System.out.println("hello from displayBase class");
	}
}

class DisplayMsg extends DisplayBase{
	
	public static void hello() {
		System.out.println("hello from displayMsg class");
	}
	
}

public class Display{
	public static void main(String[] args) {
		
		DisplayBase d = new DisplayBase();
		d.hello();
		
		d = new DisplayMsg();
		d.hello();
				
		
		DisplayMsg dislay = new DisplayMsg();
		dislay.hello();
		
	}
}
