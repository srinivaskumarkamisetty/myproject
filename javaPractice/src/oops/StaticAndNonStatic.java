package oops;

public class StaticAndNonStatic {

	static int x=20;
	int y=30;
	
	public static void main(String[] args) {
		StaticAndNonStatic s1=new StaticAndNonStatic();
		s1.x=888;
		s1.y=999;
		System.out.println(s1.x+"............"+s1.y);
		
		
		StaticAndNonStatic s2=new StaticAndNonStatic();
		System.out.println(s2.x+"............"+s2.y);
	}
}
