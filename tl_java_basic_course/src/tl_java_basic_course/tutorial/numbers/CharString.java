package tl_java_basic_course.tutorial.numbers;

public class CharString {
	public static void main(String[] args){
		System.out.println('생');
		System.out.println("생활코딩");	//문자가 결합된 문자열
		System.out.println("생");	//문자가 하나여도 쌍따옴표로 묶이면 문자열이됨
		
		//System.out.println('생활코딩');	//error:invalid character constant
		
		//연산자 사용
		System.out.println("생활코딩" + "입니다");
		System.out.println("생활코딩"+'?');
		System.out.println("1"+"1"); //쌍따옴표 구간은 문자열이기 때문에 연산되지 않음
		System.out.println("1+1");
		System.out.println("가나"+1);
		
		//이스케이프 문자 사용
		//System.out.println("egoing said "Welcome programming world"");	//error:syntax error
		System.out.println("egoing said \"Welcome programming world\"");	//단순한 문자로 인식
		//System.out.println("역슬래시 \");	//error:String literal is not properly closed by a double-quote
		System.out.println("egoing said \n \"Welcome programming world\"");	//\n 은 특수한 기호(줄바꿈)로 해석됨
	
		
	}
}
