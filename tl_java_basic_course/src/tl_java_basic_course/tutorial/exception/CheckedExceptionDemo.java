package tl_java_basic_course.tutorial.exception;

import java.io.*;

// Throws 가 있으면 해당 내용에 대해 Exception 처리를 해야한다고 강제하는것

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		BufferedReader bReader = null;
		String input = null;
		
//		try {
			bReader = new BufferedReader(new FileReader("out.txt"));
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
       
//		try {
//			input = bReader.readLine();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
        System.out.println(input);
	}

}
