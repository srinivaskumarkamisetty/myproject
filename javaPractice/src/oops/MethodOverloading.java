package oops;

public class MethodOverloading {

	
	public void m1(int a, long b) {
		System.out.println("Integer method");
	}
	public void m1(long b, int a) {
		System.out.println("float method");
	}

	
	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		//m.m1(10, 20);
	}
}
