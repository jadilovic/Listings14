package Code;

public class LeapYear {

	public static boolean isLeapYear(int year) {
		// TODO Auto-generated method stub
		return isDivisible(year, 4) && (!isDivisible(year, 100) || isDivisible(year, 400));
	}

	public static boolean isDivisible(int year, int denominator){
		return year % denominator == 0;
	}
}
