package markSheet;

/* Author: Gaurav M
 * Subject: Inheritance example in java 
 */

public class Result extends Subjects {

	public int totalResult() {

		int totalResult;

		Result rt = new Result();

		rt.languages();

		rt.social_science();

		rt.maths();

		totalResult = rt.langSum + rt.mathsSum + rt.sosciSum;

		System.out.println("Total Result " + totalResult);

		return totalResult;
	}

	public static void main(String[] args) {
		// Calculating total result

		Result totalResult = new Result();

		totalResult.totalResult();

	}

}
