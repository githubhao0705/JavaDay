package homeWork6;

public class HomeWork6_13 {
	public static void main(String[] args) {
		System.out.println(count(20));
	}

	public static double count(int number) {
		double sum = 0;
		// 记得把i类型变成double
		for (double i = 1; i <= number; i++) { 
			sum += i / (i + 1);
		}
		return sum;
	}
}
