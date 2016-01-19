package collections;

/* Author: Gaurav M
 * Subject: Example of Hashset 
 */

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("Martin");
		hs.add("Edwaord");
		hs.add("Ricky");

		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
