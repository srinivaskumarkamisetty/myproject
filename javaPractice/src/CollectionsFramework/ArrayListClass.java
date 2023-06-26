package CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add("vasu");
		al.add("srinu");
		al.add("vadhina");
		al.add(10);
		al.add(true);

		System.out.println(al);
		System.out.println(al.size());// Number of elements in ArrayList
		System.out.println(al.remove(0));// Remove Element by index
		System.out.println(al.remove("srinu"));// Remove by object
		System.out.println("After Removing values =" + al); // After Removing from ArrayList
		al.add(2, "mom");
		System.out.println("After inserting new value = " + al);
		System.out.println("Retreving by index  =" + al.get(3));
		al.set(3, "java");
		System.out.println("Replacing element" + al);

		// Reading elements using for loop

		System.out.println("Reading elements using for loop::");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));

		}
		// Reading elements using for each loop
		System.out.println("Reading elements using for each loop::");
		for (Object e : al) {
			System.out.println(e);
		}
		// Reading elements using for each loop by Itertor
		System.out.println("Reading elements using Iterator::");
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
