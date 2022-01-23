package com.file.handling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("/Users/av/Desktop/Eclipse Workspace/filename.txt");
		
		boolean flag = file.createNewFile();
		
		if(flag) {
			System.out.println("New file created");
		}
		else {
			System.out.println("File already present");
		}
	}

}
