package tl_java_basic_course.tutorial.condition;

public class Condition3Demo {
	public static void main(String[] args){
		if(true){
			System.out.println(1);
		}else{
			System.out.println(2);	//Dead Code
		}
		
		if(false){
			System.out.println(1);	//Dead Code
		}else{
			System.out.println(2);	
		}
	}
}
