package otherPackage;

/**
 * This class represents special accounts in the bank and inherits from Account class.
 * @author Ahmed Mounir Hassan
 */
public class SpecialAccount extends Account {

	/**
     * Constructor that sets accountNumber, balance  of an SpecialAccount.
     * @param accountNumber account number of the special account .
     * @param balance balance of the special account .
     */
	public SpecialAccount(int accountNumber, double balance) {
		super(accountNumber, balance);
	}

	/** 
     * Override method from base class (Account) to withdraw an amount of money from  specialAccount .
     * the client can withdraw until his balance reach -1000 .
     * manage the change that may happen in the balance .
     */
	@Override
	public void withdraw() {
		System.out.print("SPECIAL ACCOUNT | Enter how much you want to withdraw: ");
		double specialWithdraw = sc.nextDouble();
		if (getBalance() >= -1000) {
			setBalance(getBalance() - specialWithdraw);
			if (getBalance() < -1000) {
				setBalance(getBalance() + specialWithdraw);
				System.out.println("You exceeded the limited amount to withdraw.");
			} else {
				System.out.println("Successful operation");
			}
		} else {
			System.out.println("Rejected Operation.");
		}
	}
}
