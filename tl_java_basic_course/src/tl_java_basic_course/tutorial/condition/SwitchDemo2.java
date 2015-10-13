package tl_java_basic_course.tutorial.condition;

public class SwitchDemo2 {

	public static void main(String[] args) {
		int val = 1;
		//val = 2;
		//val = 3;
		val = 4;
		if(val == 1){
			System.out.println("one");
		}else if(val == 2){
			System.out.println("two");
		}else if(val == 3){
			System.out.println("three");
		}else{
			System.out.println("default");
		}
		
		//2080법칙 (20프로의 공연이 80프로의 트래픽을 발생시킴)
		//if나 switch 사용시 자주사용하는것을 위에 두는 것이 좋음
	}

}
