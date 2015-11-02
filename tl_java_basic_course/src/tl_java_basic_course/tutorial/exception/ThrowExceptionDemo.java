package tl_java_basic_course.tutorial.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// 책임의 전가

class B{
    void run() throws FileNotFoundException, IOException{
        BufferedReader bReader = null;
        String input = null;
//        try {
            bReader = new BufferedReader(new FileReader("out.txt"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        try{
            input = bReader.readLine();
//        } catch (IOException e){
//            e.printStackTrace();
//        }       
        System.out.println(input); 
        bReader.close();
    }
}
class C{
    void run() throws FileNotFoundException, IOException{
        B b = new B();
//        try {
			b.run();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e){
//			e.printStackTrace();
//		} 
    }
}

public class ThrowExceptionDemo {

	public static void main(String[] args) {
		 C c = new C();
         try {
			c.run();
		} catch (FileNotFoundException e) {
			System.out.println("out.txt 파일이 필요합니다");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
