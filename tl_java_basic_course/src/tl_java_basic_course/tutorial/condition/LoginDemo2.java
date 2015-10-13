package tl_java_basic_course.tutorial.condition;

public class LoginDemo2 {

	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		//if(id.equals("egoing")){
		if(id == "egoing"){
			//if(password.equals("111111")){
			if(password == "111111"){
				System.out.println("right");
			}else{
				System.out.println("wrong");
			}
		}else{
			System.out.println("wrong");
		}
		
		// && 연산자 사용
		// equal() 사용시 상수를 앞에놓고 쓰면 널체크가 되서 좋지만(진리는 아님, 널을 넘겨야 하는 경우도 있기때문에)
		if(id.equals("egoing") && password.equals("111111")){
			System.out.println("right");
		}else{
			System.out.println("wrong");
		}
	}

}
