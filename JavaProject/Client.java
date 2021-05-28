package otherPackage;

/**
 * This class represents clients in the bank and has five data fields.
 * @author Abdelrahman Yasser Mohamed
 */
public class Client {
	private String name, nationalID, address, phone;
	private Account account;
	
	// In case of commercial client which doesn't need a national ID and it was set to zero.
	/**
	 * Constructor that sets name, address, phone and account for a commercial client (without National ID).
	 * @param name Name of the client
	 * @param address Address of the client
	 * @param phone Phone of the client
	 * @param account Account information of the client
	 */
	public Client(String name, String address, String phone, Account account) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.account = account;
	}
	
	/**
	 * Constructor that sets name, national id, address, phone and account for a client.
	 * @param name Name of the client
	 * @param nationalID National ID of the client
	 * @param address Address of the client
	 * @param phone Phone of the client
	 * @param account Account information of the client
	 */
	public Client(String name, String nationalID, String address, String phone, Account account) {
		this.name = name;
		this.nationalID = nationalID;
		this.address = address;
		this.phone = phone;
		this.account = account;
	}
	
	/**
	 * The getName method returns the name of the client.
	 * @return returns name of the client
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * The setName method assigns a name to the client.
	 * @param name Name of the client.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * The getNationalID method returns the national id of the client.
	 * @return returns the national id of the client
	 */
	public String getNationalID() {
		return nationalID;
	}
	
	/**
	 * The setNationalID method assigns a national id to the client.
	 * @param nationalID National ID of the client.
	 */
	public void setNationalID(String nationalID) {
		this.nationalID = nationalID;
	}
	
	/**
	 * The getAddress method returns the address of the client.
	 * @return returns the address of the client.
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * The setAddress method assigns an address to the client.
	 * @param address Address of the client.
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * The getPhone method returns the address of the client.
	 * @return returns the client's phone number
	 */
	public String getPhone() {
		return phone;
	}
	
	/**
	 * The setPhone method assigns a phone number to the client.
	 * @param phone Phone number of the client.
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	/**
	 * The getAccount method returns client's account information which is (account number and balance).
	 * @return Client's account information.
	 */
	public Account getAccount() {
		return account;
	}
	
	/**
	 * The setAccount method assigns an account to the client
	 * @param account Client's account.
	 */
	public void setAccount(Account account) {
		this.account = account;
	}
	
	/**
	 * Overriden method to print client information properly.
	 */
	@Override
	public String toString() {
		return "Name: " + name +  "\nAddress: " + address + "\nNational ID: " + nationalID + "\nPhone: " + phone;
	}
}
