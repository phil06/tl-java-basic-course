package tl_java_basic_course.tutorial.operator;

public class PrePostDemo {

	//단항 연산자 : 하나의 항을 대상으로 연산이 이루어지는 연산자
	public static void main(String[] args) {
		int i = 3;
		i++;
		System.out.println(i);
		++i;
		System.out.println(i);
		System.out.println(++i);	// i값에 1이 더해진 값을 출력
		System.out.println(i++);	// i값 출력 후 i값 증가
		System.out.println(i);
		
		--i;
		System.out.println(i);
		i--;
		System.out.println(i);
		
		System.out.println(i--);
		System.out.println(i);
		
		System.out.println(--i);
	}

}
