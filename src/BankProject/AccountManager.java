/**
 * @version 1.0
 */
package BankProject;

import java.util.*;
import com.*;
import ip.*;

/**
 * @author Sayan
 *
 */
class AccountManager extends Employee {

	public ArrayList<SBIBank> al = new ArrayList<SBIBank>();

	public ArrayList<SBIBank> openAccount() {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		// creating object
		GetPersonalInformation pi = new GetPersonalInformation();
		SBIBank b1 = new AmeerpetBranch();

		// set accnum
		b1.setAccNum(30866756424L); // how to generate acc no?
		System.out.println();

		// set acchname
		System.out.println("Enter your Details: ");
		b1.setAccHolderName(pi.getName());

		// set addr
		b1.setAccHolderAddr(pi.getAddress());

		// set ph no
		b1.setAccHolderPhone(pi.getPhNumber());

		// set DOB
		int dd1, mm1, yyyy1;
		while (true) {
			try {
				while (true) {
					dd1 = Age.getDay();
					mm1 = Age.getMonth();
					yyyy1 = Age.getYear();

					if (yyyy1 > 1800 && yyyy1 <= 2020) {
						b1.setAccHolderDOB(dd1, mm1, yyyy1);
						System.out.println("Your DOB is: " + b1.getAccHolderDOB());
						break;
					} else {
						System.out.println("invalid DOB, try again");
					}
				}
				// set age
				int age1 = Age.age(dd1, mm1, yyyy1);
				b1.setAccHolderAge(age1);
				System.out.println("Your age is: " + b1.getAccHolderAge());
				break;
			} catch (MyException re) {
				System.out.println(re.getMessage());`
			}
		}

		// set mode of operation
		while (true) {
			try {
				System.out.println("Mode of Operation(Type 'joint' or 'single'?): ");
				String m = scn.nextLine();
				b1.setModeOfOperation(m);
				break;
			} catch (MyException e) {
				System.out.println(e.getMessage());
			}
		}
		// set primary bal
		while (true) {
			try {
				System.out.print("Enter Account primary Balance: ");
				b1.setBalance(scn.nextDouble());
				scn.nextLine();
				break;
			} catch (InputMismatchException e) {
				scn.nextLine();
				System.out.println("Enter only numbers");
			} catch (MyException e) {
				System.out.println(e.getMessage());
			}
		}

		// set overdrawn

		while (true) {
			try {
				System.out.println("Do you want overdrawn facility? (Type 'yes' or 'no'?): ");
				String m = scn.nextLine();
				b1.setOverDrawn(m);
				break;
			} catch (MyException e) {
				System.out.println(e.getMessage());
			}
		}
// scn.close();
		// adding object to ArrayList
		al.add(b1);
		return al;
	}

	void displayInformation(long acno) {
		SBIBank a1 = al.get(0);
		if (acno == a1.getAccNum()) {
			System.out.println("account information: ");
			a1.display();
		} else
			System.out.println("Invalid Account Number, Try again");
	}
}