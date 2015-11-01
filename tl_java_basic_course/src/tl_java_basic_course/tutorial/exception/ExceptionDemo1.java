package tl_java_basic_course.tutorial.exception;

class A{
    private int[] arr = new int[3];
    A(){
        arr[0]=0;
        arr[1]=10;
        arr[2]=20;
    }
    public void z(int first, int second){
    	try{
    		System.out.println(arr[first] / arr[second]);
//    	}catch(Exception e){
    	}catch(ArithmeticException e){
//    		System.out.println(e.getMessage());
    		e.printStackTrace();
    	}catch(ArrayIndexOutOfBoundsException e){
    		System.out.println("ArrayIndexOutOfBoundsException e");
    	}catch(Exception e){
    		//Exception 은 광범위한 상위의 예외이기 때문에 이게 제일 위에 오면 다음 catch 구분에 닿을 수 없게됨
    		System.out.println("Exception e");
    	}finally{
    		System.out.println("finally");
    	}
        
    }
}

public class ExceptionDemo1 {

	public static void main(String[] args) {
		  A a = new A();
	      a.z(10, 0);
	      a.z(1, 0);
	      a.z(2, 1);
	}

}
