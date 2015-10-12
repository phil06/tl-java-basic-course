package tl_java_basic_course.tutorial.operator;

public class ConcatDemo {
	public static void main(String[] args){
		String firstString = "This is";
		String secondString = " a concatenated string.";
		String thirdString = firstString + secondString;
		System.out.println(thirdString);
		
		System.out.println('A' + 24 + " test? " + 99 + 'z');	// '+' 연산자는 왼쪽에서 오른쪽 방향으로의 결합을 갖는다.
	}
}
