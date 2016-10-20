/**
 * @version 1.0
 * 
 */
package BankProject;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.SBIBank;

import ip.MyException;

/**
 * @author Sayan
 *
 */
public final class Customer {
	/**
	 * @param args
	 */
	public static void main(String[] args)  {
		ArrayList<SBIBank> al = null;

		Clerk c1 = new Clerk();
		AccountManager acm = new AccountManager();
		int choice;
		// int exit;
		double amount;
		long accno;
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.print(
						"Enter 1 to open a new account \nEnter 2 to Withdraw amount \nEnter 3 to Display Account Information \n:");
				choice = sc.nextInt();
				sc.nextLine();
				
				switch (choice) {
				case 1:
					al = acm.openAccount();
					break;
				case 2:
					while (true) {
						try {
							System.out.print("Enter Account Number: ");
							accno = sc.nextLong();
							sc.nextLine();
							if (accno < 10000000000L || accno > 99999999999L) {
								throw new MyException("Invalid Input, Account Number should be of 11 digits");
							} else {
								System.out.print("Enter amount:");
								amount = sc.nextDouble();
								System.out.print("Amount Withdrawn: " + c1.withdrawAmount(accno, amount, al) + "\n");
								break;
							}
						} catch (IndexOutOfBoundsException e) {
							int ch;
							System.out.println("Account not found, please recheck");
							while (true) {
								try {
									System.out.println("press 1 to go back to main menu \npress 2 to try again");
									ch = sc.nextInt();
									sc.nextLine();
									if (ch == 1) {
										break;
									} else if (ch == 2) {
										System.out.print("Again...");
										break;
									} else
										throw new MyException(
												"Hmm, looks like you have entered wrong number, try only 1 or 2...");
								} catch (InputMismatchException ipme) {
									sc.nextLine();
									System.out
											.println("Oops, looks like wrong Input given, Try only Integer numbers...");
								} catch (MyException re) {
									System.out.println(re.getMessage());
								}
							}
							if (ch == 1)
								break;
						} catch (InputMismatchException ipme) {
							sc.nextLine();
							System.out.println("Oops, looks like wrong Input given, Try only Integer numbers...");
						} catch (NullPointerException npe) {
							System.out.println("No such Account found...");
						} catch (MyException re) {
							System.out.println(re.getMessage());
						}
					}
					break;
				case 3:
					while (true) {
						try {
							System.out.print("Enter Account Number: ");
							accno = sc.nextLong();
							sc.nextLine();
							if (accno < 10000000000L || accno > 99999999999L) {
								throw new MyException("Invalid Input, Account Number should be of 11 digits");
							} else {
								acm.displayInformation(accno);
								break;
							}
						} catch (IndexOutOfBoundsException e) {
							int ch;
							System.out.println("Account not found, please recheck");
							while (true) {
								try {
									System.out.println("press 1 to go back to main menu \npress 2 to try again");
									ch = sc.nextInt();
									sc.nextLine();
									if (ch == 1) {
										break;
									} else if (ch == 2) {
										System.out.print("Again...");
										break;
									} else
										throw new MyException(
												"Hmm, looks like you have entered wrong number, try only 1 or 2...");
								} catch (InputMismatchException ipme) {
									sc.nextLine();
									System.out
											.println("Oops, looks like wrong Input given, Try only Integer numbers...");
								} catch (MyException re) {
									System.out.println(re.getMessage());
								}
							}
							if (ch == 1)
								break;
						} catch (InputMismatchException ipme) {
							sc.nextLine();
							System.out.println("Oops, looks like wrong Input given, Try only Integer numbers...");
						} catch (MyException re) {
							System.out.println(re.getMessage());
						}
					}
					break;
				default:
					System.out.println("Wrong choice, Try only 1, 2 or 3");
					break;
				}
			} catch (InputMismatchException ipme) {
				sc.nextLine();
				System.out.println("Wrong Choice, only Integer Numbers allowed...");
			} catch (MyException re) {
				sc.nextLine();
				System.out.println(re.getMessage());
			}  catch (Exception e) {
				e.printStackTrace();
				break;
			}
		}
		sc.close();
	}
}
