package tl_java_basic_course.tutorial.exception;

class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide(){
    	try{
	        System.out.print("계산결과는 ");
	        System.out.print(this.left/this.right);
	        System.out.print(" 입니다.");
    	}catch(Exception e){
    		System.out.println("오류가 발생했습니다" + e.getMessage());
    		
    		System.out.println("\n\ne.toString()\n" + e.toString());
    		System.out.println("\n\ne.stackTrace()");
    		e.printStackTrace();
    	}
    	System.out.println("Divide End");
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
