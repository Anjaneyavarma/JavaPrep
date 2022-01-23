package com.file.handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileInStream {
	
	public static void main(String args[]) {
		
		try {
			File file = new File("filename.txt");
			
			BufferedReader br = new BufferedReader(new FileReader(file));
			int r = 0;
			while((r = br.read())!=-1) {
				System.out.print((char) r);
			}
			
			System.out.println();
			
			FileReader fr = new FileReader(file);
			int f = 0;
			while((f = fr.read())!=-1) {
				System.out.print((char) f);
			}
					
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
