package otherPackage;

import java.util.Scanner;
/**
 * 
 * @author Youssef Waleed Sayed
 * @author Ahmed Mounir Hassan
 * @author Abdelrahman Yasser Mohamed
 *
 */
public class Main {
	
	static int accountCtr = 1;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Bank bank = new Bank("HSBC", "Egypt", "010");
		
		Account account;
		Client client;
		
		
		while (true) {
			
			System.out.println("1- Add Client\n2- List All Accounts and Clients\n3- Deposit\n4- Withdraw\n5- Exit");
			int choice = sc.nextInt();
			
			if (choice == 1) {
				
				System.out.println("1- Normal Account\n2- Special Account");
				int accountChoice = sc.nextInt();
				System.out.println("Enter balance: ");
				double balance = sc.nextDouble();
				
				if (accountChoice == 1) {
					
					
					account = new Account(accountCtr, balance);
					System.out.println("1- Normal Client\n2- Commercial Client");
					int clientChoice = sc.nextInt();
					
					System.out.println("Enter Name, National ID, Address and Phone (IN ORDER)");
					String name, nationalID, address, phone;
					name = sc.next(); nationalID = sc.next(); address = sc.next(); phone = sc.next();
					
					if (clientChoice == 1) {
						
						client = new Client(name, nationalID, address, phone, account);
						bank.addClient(client);
						
					} else if (clientChoice == 2) {
						
						System.out.println("Enter Commercial ID: ");
						String commercialID = sc.next();
						client = new CommercialClient(name, address, phone, account, commercialID);
						bank.addClient(client);
						
					}
					
					
					
				} else if (accountChoice == 2) {
					
					account = new SpecialAccount(accountCtr, balance);
					System.out.println("1- Normal Client\n2- Commercial Client");
					int clientChoice = sc.nextInt();
					
					System.out.println("Enter Name, National ID, Address and Phone (IN ORDER)");
					String name, nationalID, address, phone;
					name = sc.next(); nationalID = sc.next(); address = sc.next(); phone = sc.next();
					
					if (clientChoice == 1) {
						
						client = new Client(name, nationalID, address, phone, account);
						bank.addClient(client);
						
					} else if (clientChoice == 2) {
						
						System.out.println("Enter Commercial ID: ");
						String commercialID = sc.next();
						client = new CommercialClient(name, address, phone, account, commercialID);
						bank.addClient(client);
						
					}
				}
				
			} else if (choice == 2) {
				
				bank.display();
				
			} else if (choice == 3) {
				
				System.out.println("Enter account number: ");
				int accountNumber = sc.nextInt();
				bank.searchAccount(accountNumber).deposit();
				
			} else if (choice  == 4) {
				
				System.out.println("Enter account number: ");
				int accountNumber = sc.nextInt();
				bank.searchAccount(accountNumber).withdraw();
				
			} else if (choice == 5) {
				break;
			}
			accountCtr++;
			
		}
		
	}
	
}
