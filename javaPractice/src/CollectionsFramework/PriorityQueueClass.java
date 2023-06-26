package CollectionsFramework;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueClass {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();

		pq.add("A");
		pq.add("B");
		pq.add("C");
		pq.offer("D");
		pq.offer("B");

		System.out.println(pq);

		System.out.println(pq.element()); // it will give exception incase Queue is Empty
		System.out.println(pq.peek()); // it will give Null incase Queue is Empty
		
		System.out.println(pq.remove()); // It will give exception if queue is Empty
		System.out.println(pq.poll());  // It will give Null if queue is Empty
		System.out.println(pq);
		
		System.out.println("By using ForEach Loop");
		for (Object e : pq) {
			System.out.println(e);
		}
		System.out.println("By Using Iterator");
		Iterator i=pq.iterator();
		while(i.hasNext()) {
			System.out.println((i.next()));
		}
	}
}
