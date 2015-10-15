package tl_java_basic_course.tutorial.method;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MethodDemo7 {

	public static String numbering(int init, int limit){
		int i = init;
		
		String output = "";
		while(i<limit){
			output += 1;
			i++;
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		String result = numbering(1, 5);
        System.out.println(result);
        try { 
            BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
            out.write(result);
            out.close();
        } catch (IOException e) {
        } // 무시
	}

}
