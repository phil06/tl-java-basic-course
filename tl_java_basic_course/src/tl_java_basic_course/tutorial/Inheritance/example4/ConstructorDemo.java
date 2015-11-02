package tl_java_basic_course.tutorial.Inheritance.example4;

public class ConstructorDemo {
	
//	public ConstructorDemo(){}
	//생성자가 정의되어있지 않으면 자동으로 생성자를 생성한다(컴파일시에)
	//클래스와 이름이 같으면서 매개변수가 없는것이 기본 생성자이다.
	public ConstructorDemo(int param1){}
	//어떠한 생성자를 만들게 되면 기본생성자를 생성하지 않는다.

	public static void main(String[] args) {
		ConstructorDemo c = new ConstructorDemo();
		//메인에서 자기자신을 인스턴스화 가능
		
		
	}

}
