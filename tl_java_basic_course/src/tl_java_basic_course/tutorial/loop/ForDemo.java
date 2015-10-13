package tl_java_basic_course.tutorial.loop;

public class ForDemo {
	// For문 (while 이 진화했다)
	// for(초기화 ; 종료조건 ; 반복실행){...}
	public static void main(String[] args) {
		for(int i = 0 ; i < 10 ; i++){
			System.out.println("Coding Everybody" + i);
		}
		
		for(int i = 0 ; i < 10 ; i=i+2){
			System.out.println("Coding Everybody" + i);
		}
		
		int a = 0, b = 0;
		for(a=0;a<10;a++){
			for(b=0;b<10;b++);
			System.out.println(b);	
		}
	}

}
