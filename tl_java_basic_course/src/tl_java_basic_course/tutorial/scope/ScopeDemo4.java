package tl_java_basic_course.tutorial.scope;

public class ScopeDemo4 {
	
	//자바스크립트는 앞에 형선언이 없으면 전역(scope가없음)
	static void a(){
		String title = "coding everybody";
	}

	public static void main(String[] args) {
		a();
		System.out.println(title);
	}

}
