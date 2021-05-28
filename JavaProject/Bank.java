package otherPackage;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a bank which consists of users and clients
 * and has three data fields.
 * @author Youssef Waleed Sayed
 */
public class Bank {
	
	private String name, address, phone;
	
	/**
	 * ArrayList of accounts and clients in the bank.
	 */
	private List<Account> accountList = new ArrayList<Account>();
	private List<Client> clientList = new ArrayList<Client>();
	
	/**
	 * Constructor that sets the name, address and phone of a bank.
	 * @param name The name of the bank
	 * @param address The address of the bank
	 * @param phone The phone number of the bank
	 */
	public Bank(String name, String address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	/**
	 * This method is used to add client to the client list and because each client has an account,
	 * it also adds the client's account to the account list.
	 * @param c is a parameter of type Client to the addClient method.
	 */
	public void addClient(Client c) {
		clientList.add(c);
		accountList.add(c.getAccount());
	}
	
	/**
	 * This is method is used to display each client and its account in the bank.
	 */
	public void display() {
		
		for (Client c : clientList) {
			System.out.println(c);
			System.out.println(c.getAccount());
			System.out.println("####################");
		}
		
	}
	
	/**
	 * The searchAccount method searches for account number in account list
	 * @param accountNumber The account number
	 * @return Account information with the given account number which is index
	 */
	public Account searchAccount(int accountNumber) {
		for (Account acc : accountList) {
			if (acc.getAccountNumber() == accountNumber) {
				return acc;
			}
		}
		return null;
	}

	/**
	 * The getName method returns the name of the bank.
	 * @return returns the name of the bank
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * The setName method assigns a name to the bank.
	 * @param name The name of the bank.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * The getAddress method returns the address of the bank.
	 * @return returns the address of the bank.
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * The setAddress method assigns an address to the bank.
	 * @param address The address of the bank.
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * This getPhone method returns the phone of the bank.
	 * @return returns the bank's phone number.
	 */
	public String getPhone() {
		return phone;
	}
	
	/**
	 * This setPhone method assigns a phone number to the bank.
	 * @param phone The phone number of the bank.
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
