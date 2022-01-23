/**
 * 
 */
package com.oops.practice;

/**
 * @author av
 *
 */
public class OverloadMainMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("inside main method with args of String");
		main(2);
		main(new Integer[] {1,2,3,4});
	}
	public static void main(Integer a) {
		System.out.println("inside main method with integer as the input");
	}
	public static void main(Integer[] a) {
		System.out.println("inside main method with integer of array as the input");
	}

}
