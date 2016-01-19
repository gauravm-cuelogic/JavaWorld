package collections;

/* Author: Gaurav M
 * Subject: Example of Priority Queue
 */

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {

		PriorityQueue<String> pqueue = new PriorityQueue<String>();
		pqueue.add("A.R.Rehaman");
		pqueue.add("Ajay Atul");
		pqueue.add("Vishal Shekhar");
		pqueue.add("Pankaj Padghan");
		pqueue.add("Shankar Ehasaan Loy");

		System.out.println("Head: " + pqueue.element());
		System.out.println("Head: " + pqueue.peek());

		Iterator<String> itr = pqueue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

		pqueue.remove();
		pqueue.poll();

		Iterator<String> itr2 = pqueue.iterator();
		while (itr2.hasNext()) {

			System.out.println(itr2.next());

		}

	}

}
