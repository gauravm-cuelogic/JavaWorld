package bankAccount;

/* Author: Gaurav M
 * Subject: Constructor in JAVA
*/

public class Employee {

	public static void main(String[] args) {
		
		BankAccount bankAccount = new BankAccount("HDFC");
		
		bankAccount.depositAccount(1000);
		bankAccount.depositAccount(2000);
		
		//System.out.println("Final account balance is: " +bankAccount.balance);
	}

}