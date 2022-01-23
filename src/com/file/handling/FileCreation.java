package com.file.handling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCreation {
	
	public static void main(String args[]) throws FileNotFoundException {
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the file name");
			
			String fileName = sc.nextLine();
			FileOutputStream fos = new FileOutputStream(fileName, true);
			
			String content = sc.nextLine();
			
			byte[] b = content.getBytes();
			
			fos.write(b);
			fos.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}

