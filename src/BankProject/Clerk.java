/**
 * @version 1.0
 */
package BankProject;

import java.util.ArrayList;

import com.*;

import ip.*;

/**
 * @author Sayan
 *
 */
public class Clerk extends Employee {
	ArrayList<SBIBank> al = null;

	public double withdrawAmount(long accno, double amount, ArrayList<SBIBank> al) throws WrongChoiceException {
		SBIBank a1 = al.get(0);
		if (accno == a1.getAccNum()) {
			return a1.withdraw(amount);
		} else
			System.out.println("accno not matched");
		throw new WrongChoiceException("Invalid Account Number, Try again");
	}
}
