package tl_java_basic_course.tutorial.overloading.example1;

public class OverloadingDemo {

	void A (){
		System.out.println("void A()");
	}
	  
	void A (int arg1){
		System.out.println("void A (int arg1)");
	}
	    
	void A (String arg1){
		System.out.println("void A (String arg1)");
	}
	    
	//리턴값이 다른 메소드를 오버로딩 할 수 있는가?
	//반환값은 메소드를 사용 한 이후의 처리이기 때문에 에러
	int A (){
		System.out.println("void A()");
	}
	    
	public static void main(String[] args) {
	    	
        OverloadingDemo od = new OverloadingDemo();
        od.A();
        od.A(1);
        od.A("coding everybody");
	        
	}
}
