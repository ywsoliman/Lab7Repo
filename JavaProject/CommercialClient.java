package otherPackage;

/**
 * This class represents commercial clients in the bank and inherits from Client class.
 * @author Abdelrahman Yasser Mohamed
 */
public class CommercialClient extends Client {
	
	private String commercialID;
	
    /**
     * The constructor sets name ,address, phone ,account,commercial ID
     * @param name of client
     * @param address of client
     * @param phone of client
     * @param account of client
     * @param commercialID of client
     */
	public CommercialClient(String name, String address, String phone, Account account, String commercialID) {
		super(name, address, phone, account);
		this.commercialID = commercialID;
		setNationalID("00000000000000");
	}
	
    /**
     *  getCommercialID method returns the commercial ID of client.
     * @return commercial ID 
     */
	public String getCommercialID() {
		return commercialID;
	}
	
    /**
     *  setCommercialID method assigns the commercial ID of client.
     * @param commercialID of client
     */
	public void setCommercialID(String commercialID) {
		this.commercialID = commercialID;
	}
	
	/**
	 *  Overriden method to print commercial client information properly. 
	 */
	@Override
	public String toString() {
		return "Name: " + getName() +  "\nAddress: " + getAddress() + "\nCommercial ID: " + commercialID + "\nPhone: " + getPhone();
	}
}