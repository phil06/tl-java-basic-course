package tl_java_basic_course.tutorial.conversion;

public class TypeConversion {
	public static void main(String[] args){
		double a = 3.4F;	// 정보의 손실이 일어나지 않는 경우의 형변환은 자동으로 가능함
		//float b = 3.0;	//정보의 손실이 일어나므로 자동 현변환 불가
		
		/* byte - short(char) - int - long - float - double */
		int c = 2;
		System.out.println(a+c);
	}
}
