package tl_java_basic_course.tutorial.generic;

// 클래스가 아닌 인터페이스로도 사용 가능하다.
abstract class Info{
    public abstract int getLevel();
}

class EmployeeInfo4 extends Info{
    public int rank;
    EmployeeInfo4(int rank){ this.rank = rank; }
    public int getLevel(){
        return this.rank;
    }
}

//Info의 자식들만을 T로 받게 강제화 할 수 있다.
//여기에서의 extends 는 기존거와 다르게 부모가 누구냐 라는 뜻이된다. (특정함)
//extends 외에 super 라는 것도 있음
class Person4<T extends Info>{
    public T info;
    Person4(T info){     	
    	this.info = info; 
//    	info.getLevel(); 
    	//extends 하지 않는 상황이라면 기본 Object 에서 사용가능한것만 가능 어떤 타입으로 특정할 수 없으니까
    	}
}

public class GenericDemo4 {
	public static void main(String args[]){
		Person4 p1 = new Person4(new EmployeeInfo4(1));
//        Person4<String> p2 = new Person4<String>("부장");
	}
}
