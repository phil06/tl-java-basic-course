package tl_java_basic_course.tutorial.method;

public class MethodDemo6 {
	
	public static String numbering(int init, int limit){
		int i = init;
		
		String output = "";
		while(i<limit){
			output += 1;
			i++;
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		String result = numbering(1,5);
		System.out.println(result);
	}

}
