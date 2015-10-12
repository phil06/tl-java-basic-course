package tl_java_basic_course.tutorial.constant;

public class ConstantDemo {

	public static void main(String[] args) {
		//int a = 2.2;	//type mismatch
		float a = 2.2F;	//명시적으로 'F'를 표현해주지 않으면 java에선 default data type int 를 기본으로 인식함
		
		double b = 2.2;
		
		//int c = 2147483638;
		int c = 2147483637;
		long d = 2147483638;
		
		System.out.println(d);
	}

}
