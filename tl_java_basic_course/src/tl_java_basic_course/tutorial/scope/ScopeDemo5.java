package tl_java_basic_course.tutorial.scope;

public class ScopeDemo5 {

	public static void main(String[] args) {
		int i;
		for(i = 0 ; i < 5 ; i++){
			System.out.println(i);
		}
		System.out.println(i);
	}

}
