package tl_java_basic_course.tutorial.method;

public class MethodDemo1 {

	//정의부
	public static void numbering(){
		int i = 0;
		while(i < 10){
			System.out.println(i);
			i++;
		}
	}
	
	public static void main(String[] args) {
		//호출부
		numbering();
		numbering();
		numbering();
	}

}
