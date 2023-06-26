package oops;

public class MethodOverRiding2 extends MethodOverRiding{

	
	public  Integer m1() {
		System.out.println("child method");
		return null;
	}
	public static void main(String[] args) {
		MethodOverRiding2 m=new MethodOverRiding2();
		m.m1();
		
		MethodOverRiding m1=new MethodOverRiding2();
		m1.m1();
	}
}
