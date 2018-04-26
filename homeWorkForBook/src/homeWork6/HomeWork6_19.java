package homeWork6;

import java.util.Scanner;

public class HomeWork6_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("�����������������ߵ�ֵ��");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();

		if (isValid(side1, side2, side3)) {
			System.out.println("������������޷���������Σ�");
		}else {
			System.out.println("�����ε����Ϊ��"+area(side1, side2, side3));
		}
	}

	public static boolean isValid(double side1, double side2, double side3) {
		Double a = area(side1, side2, side3);
		if (a.isNaN()) {
			return true;
		}
		return false;
	}

	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
}
