package interfaceExample;

/* Author: Gaurav M
 * Subject: Example of Interface 
 */

public class TotalSales implements SmartPhoneVendors {

	@Override
	public void apple() {

		System.out.println("Total Sales is 13 million dollors in the year 2015-2016");
	}

	@Override
	public void samsung() {

		System.out.println("Total Sales is 18 million dollors in the year 2015-2016");
	}

	@Override
	public void microsoft() {

		System.out.println("Total Sales is 20 million dollors in the year 2015-2016");

	}

	public static void main(String[] args) {

		TotalSales ts = new TotalSales();
		ts.apple();
		ts.samsung();
		ts.microsoft();

	}

}
