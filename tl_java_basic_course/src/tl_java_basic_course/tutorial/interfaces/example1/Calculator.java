package tl_java_basic_course.tutorial.interfaces.example1;

public class Calculator implements Calculatable {
//	int left, right;
	int first, second, third;
	
//	public void setOperands(int left, int right){
//		this.left = left;
//		this.right = right;
//	}
	
	public void setOperands(int first, int second, int third){
		this.first = first;
		this.second = second;
		this.third = third;
	}
	
//	public void sum(){
//		System.out.println(this.left + this.right);
//	}
	
//	public void avg(){
//		System.out.println((this.left + this.right) / 2);
//	}
	
	public int sum(){
		return this.first + this.second + this.third;
	}
	
	public int avg(){
		return (this.first + this.second + this.third) / 3;
	}
}
