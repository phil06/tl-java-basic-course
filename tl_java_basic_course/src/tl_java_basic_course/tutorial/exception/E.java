package tl_java_basic_course.tutorial.exception;

import java.io.IOException;

// 부모중에 RuntimeException 이 있는건 = unchecked = 예외를 처리하지 않아도 된다.
// 부모중에 runtimeException 이 없는건 = checked   = 반드시 예외를 처리하는 처리기가 존재해야함

public class E {
	   void throwArithmeticException(){
	        throw new ArithmeticException();
	    }
	    void throwIOException(){
//	        try {
				throw new IOException();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
	    }
	    
//	    void throwIOException1() throws IOException{
//	        throw new IOException();
//	    }
}
