package tl_java_basic_course.tutorial.condition;

public class SwitchDemo {

	public static void main(String[] args) {
		int one = 0, two = 0, three = 0;
		
		System.out.println("wsitch(1)");
		//switch(1){
		//switch(2){
		//switch(3){
		switch(4){
			case 1:
			//case one:	//case expressions must be constant expressions
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			default:
				System.out.println("default");
		}
		
	}

}
