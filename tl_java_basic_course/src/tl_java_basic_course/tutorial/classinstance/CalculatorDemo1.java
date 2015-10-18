package tl_java_basic_course.tutorial.classinstance;

class Calculator {
	static double PI = 3.14;
	int left, right;
	
	public void setOperands(int left, int right){
		this.left = left;
		this.right = right;
	}
	
	public void sum(){
		System.out.println(this.left + this.right);
	}
	
	public void avg(){
		System.out.println((this.left + this.right) / 2);
	}
}

public class CalculatorDemo1 {
	
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.PI);
		//인스턴스를 통해서 PI에 접근
		Calculator c2 = new Calculator();
		System.out.println(c2.PI);
		//클래스를 통해서 PI에 접근
		System.out.println(Calculator.PI);
	}

}
