package tl_java_basic_course.tutorial.interfaces.example3;

interface I1{
	public void x();
	public void z();
	public void y(int a1);
}

interface I2{
	public void z();
	public void y(String a1);
}

public class A implements I1, I2 {
	public void x(){}
	public void z(){}
	public void y(int a1){}
	public void y(String a1){}
}
