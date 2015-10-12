package tl_java_basic_course.tutorial.condition;

public class LoginDemo {

	public static void main(String[] args) {
		String id = args[0];
		if(id.equals("egoing")){
			System.out.println("right");
		}else{
			System.out.println("wrong");
		}
		
		String pw = args[1];
		if(pw.equals("hi"))
			System.out.println("yes");
		else
			System.out.println("no");	
		
	}

}
