package tl_java_basic_course.tutorial.loop;

public class BreakDemo {

	public static void main(String[] args) {
		for(int i = 0 ; i < 10 ; i++){
			if(i == 5){
				break;
			}
			System.out.println("Codnig Everybody" + i);
		}
	}

}
