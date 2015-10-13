package tl_java_basic_course.tutorial.compare;

public class EqualStringDemo {

	public static void main(String[] args) {
		String a = "Hello world";
		String b = new String("Hello world");
		System.out.println(a == b);		// 객체를 비교(memory)
		System.out.println(a.equals(b));	// 값을 비교(value)
		
		//자바는 변수가 달라도 값이 동일하면 == 연산자(동일성비교) 사용할때 메모리 주소가 같아짐???
		//new 는 항상 heap 에 새로운 메모리를 할당하는 일을 한다.
		// '==' 는 동일성 기호
		// '.equals()' 는 동등성 기호
		// stack 은 GC가 통과되지 않음
//		stack || static memory(method area = permanent generation )
//		heap || 
			
	}

}

