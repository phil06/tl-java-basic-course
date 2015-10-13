package tl_java_basic_course.tutorial.conditionaloperator;

public class AndDemo {
	//논리연산자(비교와Boolean, 조건문, 논리연산자)
	
	public static void main(String[] args){
		// && ( & 아님 <- 비트연산자임)
		// 앞항의 값에 따라 뒤 항을 비교하냐 안하냐의 차이
		if(true && true){
			System.out.println(1);
		}
		
		if(true && false){
			System.out.println(2);
		}	
		
		if(false && true){
			System.out.println(3);
		}	
		
		if(false && false){
			System.out.println(4);
		}		
	}
}
