package tl_java_basic_course.tutorial.generic;

class EmployeeInfo3{
    public int rank;
    EmployeeInfo3(int rank){ this.rank = rank; }
}

//복수개의 generic (보통 T부터 시작해서 T 뒤의 다음 대문자들을 사용한다.
class Person3<T, S>{
    public T info;
    public S id;
    Person3(T info, S id){ 
        this.info = info; 
        this.id = id;
    }
    
    //메소드에서의 사용예
    public <U> void printInfo(U info){
        System.out.println(info);
    }
}

public class GenericDemo3 {

	public static void main(String[] args) {
		Integer id = new Integer(1);

		Person3<EmployeeInfo3, Integer> p1 = new Person3<EmployeeInfo3, Integer>(new EmployeeInfo3(1), id);
		
		System.out.println(p1.id.intValue());
		
		
		
		EmployeeInfo3 e3 = new EmployeeInfo3(1);
		Integer i = new Integer(10);
		Person3 p2 = new Person3(e3, i);
		
		//앞의 건 생략 가능
		p2.<EmployeeInfo3>printInfo(e3);
	}

}
