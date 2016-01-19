package collections;

/* Author: Gaurav M
 * Subject: Example of ArryaList
 */

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String args[]) {

		// Creating an object of employee class
		Employee emp1 = new Employee(1001, "Gaurav", 27);
		Employee emp2 = new Employee(1002, "Amey", 26);
		Employee emp3 = new Employee(1003, "Ajay", 27);

		ArrayList<Employee> al = new ArrayList<Employee>();

		al.add(emp1);
		al.add(emp2);
		al.add(emp3);

		Iterator<Employee> itr = al.iterator();

		// Using while loop TEST
		while (itr.hasNext()) {
			Employee emp = (Employee) itr.next();
			System.out.println(emp.EmpCode + " " + emp.EmpName + " " + emp.EmpAge);
		}

		// Using for loop
		/*
		 * for(String obj:al){ System.out.println(obj); }
		 */

	}

}
