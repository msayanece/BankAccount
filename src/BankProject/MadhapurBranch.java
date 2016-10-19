/**
 * @version 1.0
 */
package BankProject;

import java.time.LocalDate;
import com.*;
import ip.*;

/**
 * @author Sayan
 *
 */
public class MadhapurBranch extends SBIBank {

	private static final String branchname = "MADHAPUR";
	private static final String branchcode = "010102";
	private static final String branchIFSC = IFSC5digits + branchcode;
	private static final String branchaddr = "MADHAPUR, HYDERABAD-500081, District: RANGA REDDY, State: ANDHRA PRADESH, INDIA";
	private static final long branchphone = 9885632770L;
	private static double branchbalance = getCredit(50000.0);

	/**
	 * Non-static member declaration Account holder information
	 */
	private long accnum;
	private String accholdername;
	private String nominyname;
	private String nominyaddr;
	private long nominyphone;
	private String accholderDOB;
	private int accholderage;
	private String accholderaddr;
	private long accholderphone;

	/**
	 * Non-static member declaration Account information
	 */
	private double balance = 100;
	private String overdrawn;
	private LocalDate dateofissue = LocalDate.now();
	private String modeofoperation;

	/**
	 * @getter & setter of accnum
	 * @return the accnum
	 */
	public long getAccNum() {
		return accnum;
	}

	/**
	 * @param accnum
	 *            the accnum to set
	 */
	public void setAccNum(long accnum) {
		if (accnum > 30000000000L && accnum < 30999999999L) {
			this.accnum = accnum;
		} else
			System.out.println("Invalid Account Number, cannot create account");
	}

	/**
	 * @getter & setter of accholdername
	 * @return the accholdername
	 */
	public String getAccHolderName() {
		return accholdername;
	}

	/**
	 * @param accholdername
	 *            the accholdername to set
	 */
	public void setAccHolderName(String accholdername) {
		this.accholdername = accholdername;
	}

	/**
	 * @return the nominyname
	 */
	public String getNominyName() {
		return nominyname;
	}

	/**
	 * @param nominyname
	 *            the nominyname to set
	 */
	public void setNominyName(String nominyname) {
		this.nominyname = nominyname;
	}

	/**
	 * @return the nominyaddr
	 */
	public String getNominyAddr() {
		return nominyaddr;
	}

	/**
	 * @param nominyaddr
	 *            the nominyaddr to set
	 */
	public void setNominyAddr(String nominyaddr) {
		this.nominyaddr = nominyaddr;
	}

	/**
	 * @return the nominyphone
	 */
	public long getNominyPhone() {
		return nominyphone;
	}

	/**
	 * @param nominyphone
	 *            the nominyphone to set
	 */
	public void setNominyPhone(long nominyphone) {
		this.nominyphone = nominyphone;
	}

	/**
	 * @getter & setter of accholderage
	 * @return the accholderage
	 */
	public int getAccHolderAge() {
		return accholderage;
	}

	/**
	 * @param accholderage
	 *            the accholderage to set
	 */
	public void setAccHolderAge(int accholderage) throws MyException{
		if (accholderage >= 10 && accholderage <= 150) {
			this.accholderage = accholderage;
		} else {
			throw new InvalidAgeException(
					"Age must be between 10 years and 150 years, your age is: " + accholderage + " years, try again");
		}
	}

	/**
	 * @getter & setter of accholderaddr
	 * @return the accholderaddr
	 */
	public String getAccHolderAddr() {
		return accholderaddr;
	}

	/**
	 * @param accholderaddr
	 *            the accholderaddr to set
	 */
	public void setAccHolderAddr(String accholderaddr) {
		this.accholderaddr = accholderaddr;
	}

	/**
	 * @getter & setter of accholderphone
	 * @return the accholderphone
	 */
	public long getAccHolderPhone() {
		return accholderphone;
	}

	/**
	 * @param accholderphone
	 *            the accholderphone to set
	 */
	public void setAccHolderPhone(long accholderphone) {
		if (accholderphone >= 6000000000L && accholderphone <= 9999999999L) {
			this.accholderphone = accholderphone;
		} else {
			System.out.println("Invalid Phone number, cannot create account");
		}
	}

	/**
	 * @getter & setter of accholderDOB
	 * @return the accholderDOB
	 */
	public String getAccHolderDOB() {
		return accholderDOB;
	}

	/**
	 * @param dd,
	 *            mm, yyyy the accholderDOB to set
	 */
	public void setAccHolderDOB(int dd, int mm, int yyyy) {
		this.accholderDOB = dd + "/" + mm + "/" + yyyy;
	}

	/**
	 * @getter & setter of balance
	 * @return the balance
	 */
	public double getBalance() {
		if (balance < 0)
			System.out.println("Your Account balance is negative, kindly deposit amount within 20 days ");
		// System.out.println("Current balance is: " + balance);
		return balance;
	}

	/**
	 * @param balance
	 *            the balance to set
	 */
	public void setBalance(double balance) throws InitialBalanceException{
		if (balance < 200) {
			throw new InitialBalanceException("Min Starting balance is 200, try again");
		} else if (balance % 100 != 0) {
			throw new InitialBalanceException("balance should be multiply of 100, try again");
		} else
			this.balance = balance;
	}

	/**
	 * @return the overdrawn
	 */
	public String getOverDrawn() {
		return overdrawn;
	}

	/**
	 * @param overdrawn
	 *            the overdrawn to set
	 */
	public void setOverDrawn(String overdrawn) throws WrongChoiceException{
		if (overdrawn.equalsIgnoreCase("Yes") || overdrawn.equalsIgnoreCase("No")) {
			this.overdrawn = overdrawn;
		} else
			throw new WrongChoiceException("Wrong choice, try again...");
	}

	/**
	 * @getter & setter of dateofissue
	 * @return the dateofissue
	 */
	public LocalDate getDateOfIssue() {
		return dateofissue;
	}

	/**
	 * @getter & setter of modeofoperation
	 * @return the modeofoperation
	 */
	public String getModeOfOperation() {
		return modeofoperation;
	}

	/**
	 * @param modeofoperation
	 *            the modeofoperation to set
	 */
	public void setModeOfOperation(String modeofoperation) throws WrongChoiceException {
		if (modeofoperation.equalsIgnoreCase("single") || modeofoperation.equalsIgnoreCase("joint")) {
			this.modeofoperation = modeofoperation;
			if (modeofoperation.equalsIgnoreCase("joint")) {
				System.out.println("Enter other account holder Details:");
				GetPersonalInformation nad = new GetPersonalInformation();
				setNominyName(nad.getName());
				setNominyAddr(nad.getAddress());
				setNominyPhone(nad.getPhNumber());
			}

		} else {
			throw new WrongChoiceException("Wrong choice, try again...");
		}
	}

	/**
	 * @Business Methods
	 * @display
	 */
	public void display() {
		System.out.println("branchname: " + branchname);
		System.out.println("branchcode: " + branchcode);
		System.out.println("branchIFSC: " + branchIFSC);
		System.out.println("branchaddr: " + branchaddr);
		System.out.println("branchphone: " + branchphone);

		if (accnum > 0)
			System.out.println("accnum: " + accnum);
		System.out.println("accholdername: " + accholdername);
		System.out.println("accholderage: " + accholderage);
		System.out.println("accholderDOB: " + accholderDOB);
		System.out.println("accholderaddr: " + accholderaddr);
		System.out.println("accholderphone: " + accholderphone);
		System.out.println("modeofoperation: " + modeofoperation);
		System.out.println("dateofissue: " + dateofissue);
		System.out.println("overdrawn: " + overdrawn);
		System.out.println("balance: " + balance);
		System.out.println();
	}

	public void deposit(double amount) {

		balance = balance + amount;
		branchbalance = branchbalance + amount;
	}

	public double withdraw(double amount) {
		double credit;
		if (overdrawn.equalsIgnoreCase("no") && amount > balance) {
			System.out.println("Insufficient balance");
			return 0.0;
		} else if (overdrawn.equalsIgnoreCase("no") && amount <= balance) {
			if (amount <= branchbalance) {
				branchbalance = branchbalance - amount;
				balance = balance - amount;
				return amount;
			} else {
				credit = getCredit(amount - branchbalance);
				if (credit == 0.0) {
					return credit;
				} else {
					branchbalance = branchbalance + credit;
					branchbalance = branchbalance - amount;
					balance = balance - amount;
					return amount;
				}
			}
		} else if (balance > -10000.0) {
			if (amount <= branchbalance) {
				branchbalance = branchbalance - amount;
				balance = balance - amount;
				return amount;
			} else {
				credit = getCredit(amount - branchbalance);
				if (credit == 0.0) {
					return credit;
				} else {
					branchbalance = branchbalance + credit;
					branchbalance = branchbalance - amount;
					balance = balance - amount;
					return amount;
				}
			}
		} else {
			System.out.println("Not enough balance, not possible to overdraw...please deposit amount");
			return 0.0;
		}

	}
}