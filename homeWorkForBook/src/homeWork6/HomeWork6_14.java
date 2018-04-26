package homeWork6;

public class HomeWork6_14 {
	public static void main(String[] args) {
		System.out.println(count(301));
	}

	public static double count(int number) {
		double renum = 0;
		double sum = 0;
		for (double i = 1; i <= number; i++) {
			renum = (Math.pow(-1, i + 1)) / (2 * i - 1);
			sum += renum;
		}
		return sum * 4;
	}
}
