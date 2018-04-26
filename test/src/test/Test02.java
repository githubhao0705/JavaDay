package test;

public class Test02 {
	enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	};

	public static void main(String[] args) {
		Day day1 = Day.FRIDAY;
		Day day2 = Day.THURSDAY;

		System.out.println(day1.name());
		System.out.println(day1.ordinal());
		System.out.println(day2.name());
		System.out.println(day2.ordinal());

		System.out.println(day1.equals(day2));
		System.out.println(day1.toString());
		System.out.println(day1.compareTo(day2));
	}
}
