package tl_java_basic_course.tutorial.conversion;

public class TypeConversion {
	public static void main(String[] args){
		double a = 3.4F;	// 정보의 손실이 일어나지 않는 경우의 형변환은 자동으로 가능함
		//float b = 3.0;	//정보의 손실이 일어나므로 자동 현변환 불가
		
		/* byte - short(char) - int - long - float - double */
		int c = 2;
		System.out.println(a+c);
		
		//명시적 형변환
		float c1 = (float) 100.0;
		int c2 = (int) 100.0F;
		
		System.out.println(c1);
		System.out.println(c2);
		
//		double ret2 = 982734234234534534;
//		int ret1 = (int)ret2;
//		System.out.println(ret1);
		

	}
}
