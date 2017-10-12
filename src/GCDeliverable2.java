import java.time.Period;
import java.time.LocalDate;
import java.util.Scanner;

public class GCDeliverable2 {

	public static void main(String[] args) {

		// declare vars
		LocalDate date1 = LocalDate.of(1, 1, 1);
		LocalDate date2 = LocalDate.of(1, 1, 1);
		
		Period p = Period.between(date1, date2);

		int userM1 = 0;
		int userD1 = 0;
		int userY1 = 0;
		int userM2 = 0;
		int userD2 = 0;
		int userY2 = 0;

		// init scanner
		Scanner dateScan = new Scanner(System.in);

		// prompt user
		System.out.println("Enter a numerical date in the format --> MM DD YYYY:");
		// get input
		while (userM1 == 0 && userD1 == 0 && userY1 == 0) {
			userM1 = dateScan.nextInt();
			userD1 = dateScan.nextInt();
			userY1 = dateScan.nextInt();
			if (((userM1 >= 1) && (userM1 <= 12)) && ((userD1 >= 1) && (userD1 <= 31))
					&& ((userY1 >= -9999) && (userY1 <= 9999))) {
				break;
			} else {
				userM1 = 0;
				userD1 = 0;
				userY1 = 0;
				System.out.println("Invalid date. Try again:");
			}
		}
		// System.out.println(userM1 + " " + userD1 + " " + userY1);

		// prompt user
		System.out.println("Enter another numerical date in the format --> MM DD YYYY:");
		// get input
		while (userM2 == 0 && userD2 == 0 && userY2 == 0) {
			userM2 = dateScan.nextInt();
			userD2 = dateScan.nextInt();
			userY2 = dateScan.nextInt();
			if (((userM2 >= 1) && (userM2 <= 12)) && ((userD2 >= 1) && (userD2 <= 31))
					&& ((userY2 >= -9999) && (userY2 <= 9999))) {
				break;
			} else {
				userM2 = 0;
				userD2 = 0;
				userY2 = 0;
				System.out.println("Invalid date. Try again:");
			}
		}

		date1 = LocalDate.of(userY1, userM1, userD1);
		date2 = LocalDate.of(userY2, userM2, userD2);

		System.out.println("Your dates are " + date1 + " and " + date2 + ".");
		
		p = Period.between(date1, date2);
		
		System.out.println("There are " + p.getYears() + " years, " + p.getMonths() + " months, " + " and " + p.getDays() + " days between the dates you entered.");
		
		return;
	}
}
