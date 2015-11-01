package tl_java_basic_course.tutorial.polymorphism;

class A{
	public String x(){return "A.x";}
}

class B extends A{
	public String x(){return "B.x";}	//오버라이딩
	public String y(){return "y";}
}

public class PolymorphismDemo1 {

	public static void main(String[] args) {
		A obj = new B();
		obj.x();
//		obj.y();
		
		System.out.println(obj.x());
		
//		B obj2 = new A();
	}

}
