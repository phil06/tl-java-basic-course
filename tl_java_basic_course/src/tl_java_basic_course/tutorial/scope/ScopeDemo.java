package tl_java_basic_course.tutorial.scope;

public class ScopeDemo {
	static int i = 0;
	
	static void a(){
		//지역변수
		i = 0;	//유효범위(scope)
	}

	public static void main(String[] args) {
		for(int i = 0 ; i < 5 ; i++){
			a();
			System.out.println(i);
		}
	}

}
