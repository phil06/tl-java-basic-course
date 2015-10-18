package tl_java_basic_course.tutorial.scope;

public class ScopeDemo {
	
	static void a(){
		//지역변수
		int i = 0;	//유혀범위(scope)
	}

	public static void main(String[] args) {
		for(int i = 0 ; i < 5 ; i++){
			a();
			System.out.println(i);
		}
	}

}
