package homeWork6;

public class HomeWork6_05 {
	public static void main(String[] args) {
		displaySortedNumbers(556.24, 24.4, 1.4);
	}

	public static void displaySortedNumbers(double num1, double num2, double num3) {
		double[] arrNum = new double[] { num1, num2, num3 };

		for (int i = 0; i < arrNum.length - 1; i++) {
			for (int j = 0; j < arrNum.length - 1 - i; j++) {
				if (arrNum[j] > arrNum[j + 1]) {
					double temp;
					temp = arrNum[j];
					arrNum[j] = arrNum[j + 1];
					arrNum[j + 1] = temp;
				}
			}

		}
		for (double d : arrNum) {
			System.out.print(d + " ");
		}
	}
}
