package tl_java_basic_course.tutorial.Inheritance.example2;

class Calculator{
	int left, right;
	
	public Calculator(){}
	
	public Calculator(int left, int right){
		this.left =  left;
		this.right = right;
	}
	
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

class SubstractionableCalculator extends Calculator{
//	int left, right;
	
	public SubstractionableCalculator(int left, int right){
//		this.left = left;
//		this.right = right;
		super(left,right);	//부모 클래스의 생성자
		//하위클래스의 초기화 코드는 꼭 super 이후에 작성해야함
	}
	
	public void substract(){
		System.out.println(this.left - this.right);
	}
}

public class CalculatorConstructorDemo4 {

	public static void main(String[] args) {
		SubstractionableCalculator c1 = new SubstractionableCalculator(10,20);
		c1.sum();
		c1.avg();
		c1.substract();
	}

}
