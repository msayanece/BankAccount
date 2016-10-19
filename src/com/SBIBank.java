/**
 * @version 1.0
 */
package com;

import java.time.LocalDate;

/**
 * @author Sayan
 *
 */
public abstract class SBIBank {

	/**
	 * SBI Bank information
	 */
	protected static final String bankname = "State Bank of India";
	private static final String bankcode = "SBIN";
	protected static final String IFSC5digits = bankcode + "0";
	protected static double bankbalance = 100000000.0;

	public abstract void display();

	public abstract void setAccNum(long accnum);

	public abstract void setAccHolderName(String accholdername);

	public abstract void setAccHolderAge(int accholderage);

	public abstract void setAccHolderAddr(String accholderaddr);

	public abstract void setAccHolderPhone(long accholderphone);

	public abstract void setAccHolderDOB(int dd, int mm, int yyyy);

	public abstract void setBalance(double balance);

	public abstract void setModeOfOperation(String Modeofoperation);

	public abstract void setOverDrawn(String overdrawn);

	public abstract long getAccNum();

	public abstract String getAccHolderName();

	public abstract int getAccHolderAge();

	public abstract String getAccHolderAddr();

	public abstract long getAccHolderPhone();

	public abstract String getAccHolderDOB();

	public abstract double getBalance();

	public abstract String getModeOfOperation();

	public abstract LocalDate getDateOfIssue();

	public abstract String getOverDrawn();

	public abstract void deposit(double amount);

	public abstract double withdraw(double amount);

	protected static double getCredit(double amount) {
		if (amount < bankbalance) {
			bankbalance = bankbalance - amount;
			return amount;
		} else {
			System.out.println(
					"Insufficient fund: Not possible to get amount now, please visit any other time... thank you!");
			return 0.0;
		}
	}
}
