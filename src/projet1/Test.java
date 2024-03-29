package projet1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 1;
		boolean isLeapYear = false;
		int totalSundays = 0;
		int currentDay = 2;// Starts on a Tuesday
		while (year <= 100) {
			isLeapYear = false;
			if ((year % 4) == 0)
				isLeapYear = true;
			else
				isLeapYear = false;
			for (int month = 1; month <= 12; month++) {
				if (currentDay == 7) {
					totalSundays++;  //Si c'est le jour n°7 le nombre dimanche s'incrémente
				}
				if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
					// January,March,May,July,August,October,December
					currentDay += 3;
				} else if (month == 4 || month == 6 || month == 9 || month == 11) {
					// April,June,September,November
					currentDay += 2;
				} else if (month == 2 && isLeapYear) {
					// February has 29 days in a Leap Year
					currentDay += 1;
				}

				if (currentDay > 7) {
					currentDay = currentDay - 7;   //On réinisialise la semaine
				}
			}
			year++;
		}
		System.out.println("The total number of Sundays that fell in the first of the month is: " + totalSundays);
	}

}
