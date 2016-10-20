/**
 * @version 1.0
 */
package ip;

import java.time.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Sayan
 *
 */
public class Age {

	public static int age(int day, int m, int year) {
		Month month = Month.of(m);
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(year, month, day);
		Period p = Period.between(birthday, today);
		int y = p.getYears();
		if (p.isNegative() || p.isZero()) {
			throw new MyException("Hmm, this date does not look right. Be sure to use your actual DOB, try again");
		} else
			return y;
	}

	@SuppressWarnings("resource")
	public static int getDay() {
		Scanner sc = new Scanner(System.in);
		int day;
		System.out.println("Enter DOB\n");
		while (true) {
			try {
				System.out.println("DD:");
				day = sc.nextInt();
				if (day < 1 || day > 31) {
					System.out.println("invalid Day, Day should be between 1 and 31");
				} else
					return day;
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("invalid Day, please enter integer");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.toString());
				return 0;
			}
		}

	}

	@SuppressWarnings("resource")
	public static int getMonth() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.println(" MM:");
				int month = sc.nextInt();
				if (month < 1 || month > 12) {
					System.out.println("invalid Month, month should be between 1 and 12");
				} else
					return month;
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("invalid Month, please enter integer");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.toString());
				return 0;
			}
		}
	}

	@SuppressWarnings("resource")
	public static int getYear() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.println(" YYYY:");
				int year = sc.nextInt();
				if (year < 1800 || year > 2200) {
					System.out.println("invalid Year, please enter year correctly");
				} else
					return year;
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("invalid Year, please enter integer");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.toString());
				return 0;
			}
		}
	}

}
