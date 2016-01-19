package markSheet;

/* Author: Gaurav M
 * Subject: Inheritance example in java 
 */

public class Subjects {

	int langSum;
	int sosciSum;
	int mathsSum;

	public int languages() {

		int english = 22;
		int hindi = 20;
		int marathi = 30;

		langSum = english + hindi + marathi;

		System.out.println("Total marks of languages: " + langSum);

		return langSum;
	}

	public int social_science() {

		int history = 20;
		int civics = 20;

		sosciSum = history + civics;

		System.out.println("Total marks of social science subjects: " + sosciSum);

		return sosciSum;
	}

	public int maths() {

		int algebra = 20;
		int geomatry = 30;

		mathsSum = algebra + geomatry;

		System.out.println("Total marks of maths: " + mathsSum);

		return mathsSum;
	}
}