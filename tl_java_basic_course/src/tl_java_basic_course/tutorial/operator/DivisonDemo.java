package tl_java_basic_course.tutorial.operator;

public class DivisonDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		float c = 10.0F;
		float d = 3.0F;
		
		System.out.println(a/b);
		System.out.println(c/d);
		System.out.println(a/d);	// 큰표현이 가능한 자료형으로 자동(암시적) 형 변환 된다.
		System.out.println(d/b);

	}

}
