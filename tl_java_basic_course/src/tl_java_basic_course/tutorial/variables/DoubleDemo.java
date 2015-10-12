package tl_java_basic_course.tutorial.variables;

public class DoubleDemo {
	public static void main(String[] args){
		double a;	//실수
		a = 1.1;
		System.out.println(a+1.1);
		
		int b;
		//b = 2.4;	//error:type mismatch
		b = 10;

		double resultA;
		resultA = a + b;
		//resultB = a + b;	//error:type mismatch
		System.out.println(resultA);
		
	}
}
