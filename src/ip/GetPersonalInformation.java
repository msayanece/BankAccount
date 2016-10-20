/**
 * @version 1.0
 */
package ip;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @version 1.0
 */

/**
 * @author Sayan
 *
 */
public class GetPersonalInformation {
	Scanner sc = new Scanner(System.in);

	public String getName() {
		while (true) {
			try {
				System.out.print("Enter full Name (give space in between words, press ENTER to submit): ");
				String s = sc.nextLine();
				if (s.matches(".*\\d.*")) {
					System.out.println("Name should not have numbers, try  again");
				} else if (s.contains(",") || s.contains("<") || s.contains(".") || s.contains(">") || s.contains("/")
						|| s.contains("?") || s.contains(";") || s.contains(":") || s.contains("[") || s.contains("{")
						|| s.contains("]") || s.contains("}") || s.contains("|") || s.contains("=") || s.contains("+")
						|| s.contains("-") || s.contains("_") || s.contains(")") || s.contains("(") || s.contains("*")
						|| s.contains("&") || s.contains("^") || s.contains("%") || s.contains("$") || s.contains("#")
						|| s.contains("@") || s.contains("!") || s.contains("`") || s.contains("~")) {
					System.out.println("Name should not have Special Symbol, try  again");
				} else if (s.isEmpty()) {
					System.out.println("Name is empty, try  again");
				} else {
					System.out.println(" Name :" + s);
					return s;
				}
			} catch (Exception e) {
				System.out.println(e.toString());
				e.printStackTrace();
				break;
			}
		}
		sc.close();
		return null;
	}

	public String getAddress() {
		while (true) {
			try {
				System.out.print("Enter full Address (give space in between words, press ENTER to submit): ");
				String s = sc.nextLine();
				if (s.contains("<") || s.contains("?") || s.contains("[") || s.contains("{") || s.contains("]")
						|| s.contains("}") || s.contains("|") || s.contains("=") || s.contains("%") || s.contains("$")
						|| s.contains("!") || s.contains("`")) {
					System.out.println("Address should not have Special Symbol, try  again");
				} else if (s.isEmpty()) {
					System.out.println("Address is empty, try  again");
				} else {
					System.out.println(" Address :" + s);
					return s;
				}
			} catch (Exception e) {
				System.out.println(e.toString());
				e.printStackTrace();
				break;
			}
		}
		sc.close();
		return null;
	}

	public long getPhNumber() {
		while (true) {
			long n;
			try {
				System.out.print("Enter Phone Number: ");
				n = sc.nextLong();
				if (n >= 6000000000L && n <= 9999999999L) {
					System.out.print("Phone Number: " + n + "\n");
					return n;
				} else
					System.out.println("Please check phone number, try again");

			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("Enter only Integer, try again");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.toString());
				break;
			}
		}
		return 0;
	}
}