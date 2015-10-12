package tl_java_basic_course.tutorial.compare;

public class EqualStringDemo {

	public static void main(String[] args) {
		String a = "Hello world";
		String b = new String("Hello world");
		System.out.println(a == b);		// 객체를 비교(memory)
		System.out.println(a.equals(b));	// 값을 비교(value)
	}

}
