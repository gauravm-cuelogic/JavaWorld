package bankAccount;

/* Author: Gaurav M
 * Subject: Constructor in JAVA
*/

public class BankAccount {

	public String name;
	public float balance; 
	
	public BankAccount(String bankName) {
		// TODO Auto-generated constructor stub
		
		this.name = bankName;
		System.out.println("Bank Name is: " +bankName);
	}	
	
	public void depositAccount(float depositedAmount){
		
		balance = balance + depositedAmount;
		
		System.out.println("Deposited amount is " +depositedAmount);
		System.out.println("Final balance after deposit is: " +balance);
		
	}
	
	public float withdrawAccount(float withdrawAmount){
		
		if(balance >= withdrawAmount){
		
		balance = balance - withdrawAmount;
		System.out.println("Withdraw amount is: " +withdrawAmount);
		System.out.println("Final balance after withdrawl is: " +withdrawAmount);
		}
		
		else{
			
			System.out.println("Amount can not be withdrawn because of insfficient balance");
		}
		
		return balance;
	}
}