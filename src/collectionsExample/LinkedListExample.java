package collectionsExample;

/* Author: Gaurav M
 * Subject: Example of Linked List
 */

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		LinkedList<String> lst = new LinkedList<String>();
		lst.add("Swati");
		lst.add("Ramesh");
		lst.add("Suresh");

		Iterator<String> itr = lst.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
