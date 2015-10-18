package tl_java_basic_course.tutorial.scope;

public class ScopeDemo2 {
	static int i = 0;	//전역변수
	
	static void a(){
		//메소드의 괄호 안에서만 유효한 지역변수
		i = 0;	
	}

	public static void main(String[] args) {
		//for문 안에서만 유효한 지역변수
		for(i = 0 ; i < 5 ; i++){
			a();
			System.out.println(i);
		}
	}

}
