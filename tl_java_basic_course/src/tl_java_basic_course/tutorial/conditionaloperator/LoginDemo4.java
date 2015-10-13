package tl_java_basic_course.tutorial.conditionaloperator;

public class LoginDemo4 {

	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		
		// 연산자 순서
		// https://opentutorials.org/course/1223/5331
		if((id.equals("egoing") || id.equals("k8805") || id.equals("sorialgi")) 
				&& password.equals("111111")){
			System.out.println("right");
		}else{
			System.out.println("wrong");
		}
		
		// 틀린점 찾기 /////////////////////////////////////
		
//		String id = args[0];
//		String password = args[1];
//		
//		if( id.equals("korea") || id.equals("orea") || id.equals("rea")  && password.equals("1234")){
//			System.out.println("Welcome to Korea Bank");
//		}else{
//			System.out.println("Your id or Password is wrong");
//		}
	}

}
