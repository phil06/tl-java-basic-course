package tl_java_basic_course.tutorial.datatype;

public class IntegerDataTypeDemo {

	public static void main(String[] args) {
		byte a;
		a = 127;
		//a = 128;	//error:type mismatch > byte는 -128~127(2^8-1 ~ 2^8) 까지표현 가능하기때문에
		
		a = 'A';
		System.out.println(a);
		a = 'a';
		System.out.println(a);
		
		short b;
		//b = 32768; //error > short는 -2^16-1 ~ 2^16 까지 표현가능
		b = 32767;
		System.out.println(b);
		
		b = 0x7FFF;
		System.out.println(b);
		a = 0x7F;
		System.out.println(a);
	}

}
