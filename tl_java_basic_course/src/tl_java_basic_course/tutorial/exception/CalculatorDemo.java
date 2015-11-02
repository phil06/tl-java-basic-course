package tl_java_basic_course.tutorial.exception;

class Calculator{
    int left, right;
    public void setOprands(int left, int right){
//    	if(right == 0){
//    		throw new IllegalArgumentException("두번째 인자는 0을 허용하지 않습니다");
//    		throw new ArithmeticException("0으로 나눌 수 없습니다.");
//    	}
        this.left = left;
        this.right = right;
    }
    public void divide(){
    	
//    	if(right == 0){
//    		throw new ArithmeticException("0으로 나눌 수 없습니다.");
//    	}
    	
    	try{
	        System.out.print("계산결과는 ");
	        System.out.print(this.left/this.right);
	        System.out.print(" 입니다.");
    	}catch(Exception e){
    		System.err.println("오류가 발생했습니다" + e.getMessage());
//    		
    		System.err.println("\n\ne.toString()\n" + e.toString());
    		System.err.println("\n\ne.stackTrace()");
    		e.printStackTrace();
    		System.err.println("err.println()");
    	}
    	System.out.println("Divide End");
    	
    	//System.err.println 으로 찍으면 순서대로 
    }
    
//    try{
//    	예외의 발생이 예상되는 로직
//    } catch(예외클래스 인스턴스){
    
//    	예외가 발생했을때 실행되는 로직
//    } finally {
//    	예외 여부와 관계없이 실행되는 로직
//    }
} 

public class CalculatorDemo {

	public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        c1.divide();
	}

}
