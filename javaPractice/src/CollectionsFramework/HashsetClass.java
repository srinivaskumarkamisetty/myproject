package CollectionsFramework;

import java.util.HashSet;

public class HashsetClass {
	public static void main(String[] args) {
        
		HashSet al=new HashSet(100,(float)0.75);
		
		al.add("vasu");
		al.add(1);
		al.add(true);
		al.add(null);
		al.add("raju");
		System.out.println(al);
		al.remove(null);//Remove vale
		System.out.println(al.contains("raju"));//Contains Method
		
	}
}

