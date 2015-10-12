package tl_java_basic_course.tutorial.operator;

public class ArithmeticDemo {
	public static void main(String[] args){
		//산술연산자 ( + , - , * , / , % )
		int result = 1 + 2;
		System.out.println(result);
		
		result = result - 5;
		System.out.println(result);
		
		result = result  * 10;
		System.out.println(result);
		
		result = result / 4;
		System.out.println(result);
		
		result = result % 3;
		System.out.println(result);
		
		result = 0 / 4;
		System.out.println(result);
		
		result = 4 / 0;	// "/ by zero"
		System.out.println(result);
		
	}
}
