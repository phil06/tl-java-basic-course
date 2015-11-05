package tl_java_basic_course.tutorial.generic;

class StudentInfo{
    public int grade;
    StudentInfo(int grade){ this.grade = grade; }
}

//class StudentPerson{
//    public StudentInfo info;
//    StudentPerson(StudentInfo info){ this.info = info; }
//}

class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}

//class EmployeePerson{
//    public EmployeeInfo info;
//    EmployeePerson(EmployeeInfo info){ this.info = info; }
//}

class Person1{
	public Object info;
	Person1(Object info){ this.info = info; }
	
}

public class GenericDemo2 {

	public static void main(String[] args) {

//		StudentInfo si = new StudentInfo(2);
//        StudentPerson sp = new StudentPerson(si);
//        System.out.println(sp.info.grade); // 2
//        
//        EmployeeInfo ei = new EmployeeInfo(1);
//        EmployeePerson ep = new EmployeePerson(ei);
//        System.out.println(ep.info.rank); // 1
		
		Person1 p1 = new Person1("부장");
		//Object 로 받기때문에 "부장" 이라는 스트링이 들어가도 문제가 생기지 않는다.
		
		EmployeeInfo ei = (EmployeeInfo)p1.info;
		// java.lang.ClassCastException: java.lang.String cannot be cast to tl_java_basic_course.tutorial.generic.EmployeeInfo
		// ClassCastException = 런타임익셉션을 갖는다. = 컴파일시 오류발생하지 않음
		// TypeSafety
	}

}
