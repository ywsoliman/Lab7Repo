package otherPackage;

import java.util.Scanner;
/**
 * This class represents accounts in the bank and has two data fields.
 * @author Ahmed Mounir Hassan
 */
public class Account {
	
	Scanner sc = new Scanner(System.in);
	
	private int accountNumber;
	private double balance;
	
	/**
	 *  Constructor that sets accountNumber, balance  of an Account.
	 * @param accountNumber the accountNumber of an Account.
	 * @param balance the balance of an Account.
	 */
	public Account(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	/**
	 *  The getBalance method returns the balance of Account.
	 * @return the balance of Account
	 */
	public double getBalance() {
		return balance;
	}
	
	/**
	 *  The setBalance method assigns the balance to Account.
	 * @param balance the balance of Account .
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	 * The getAccountNumber method returns the account number.
	 * @return returns account number.
	 */
	public int getAccountNumber() {
		return accountNumber;
	}
	
	/**
	 *  The setAccountNumber method assigns accountNumber to Account.
	 * @param accountNumber the accountNumber of an account .
	 */
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	/**
	* to withdraw an amount of money from an account.
	* manage the change that may happen in the balance.
	*/
	public void withdraw() {
		System.out.print("Enter how much money you want to withdraw: ");
		double withdraw = sc.nextDouble();
		if (balance > withdraw) {
			balance -= withdraw;
		} else {
			System.out.println("No enough money.");
		}
	}
	
	/**
     * to deposit an amount of money to account
     * manage the change that may happen in the balance .
     */
	public void deposit() {
		System.out.print("Enter how much money you want to deposit: ");
		double deposit = sc.nextDouble();
		balance += deposit;
	}
	
	/**
	 * Overriden method to print account information properly.
	 */
	@Override
	public String toString() {
		return "Account Number: " + accountNumber + "\nBalance: " + balance;
	}
	
}
