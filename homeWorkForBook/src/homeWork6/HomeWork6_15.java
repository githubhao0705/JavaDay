package homeWork6;

import java.util.Scanner;

public class HomeWork6_15 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(
				"Taxable Income        Single        Married Joint        Married Separate        Head of a House");
		for (int i = 50000; i <= 60000; i += 50) {
			computeTax(i);
		}
	}

	public static void computeTax(double taxableIncome) {
		double tax0 = 0;
		double tax1 = 0;
		double tax2 = 0;
		double tax3 = 0;

		if (taxableIncome <= 8350)
			tax0 = taxableIncome * 0.10;
		else if (taxableIncome <= 33950)
			tax0 = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
		else if (taxableIncome <= 82250)
			tax0 = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
		else if (taxableIncome <= 171550)
			tax0 = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (taxableIncome - 82250) * 0.28;
		else if (taxableIncome <= 372950)
			tax0 = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
					+ (taxableIncome - 171550) * 0.33;
		else
			tax0 = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
					+ (372950 - 171550) * 0.33 + (taxableIncome - 372950) * 0.35;

		if (taxableIncome <= 16700)
			tax1 = taxableIncome * 0.10;
		else if (taxableIncome <= 67900)
			tax1 = 16700 * 0.10 + (taxableIncome - 16700) * 0.15;
		else if (taxableIncome <= 137050)
			tax1 = 16700 * 0.10 + (67900 - 16700) * 0.15 + (taxableIncome - 67900) * 0.25;
		else if (taxableIncome <= 208850)
			tax1 = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (taxableIncome - 137050) * 0.28;
		else if (taxableIncome <= 372950)
			tax1 = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28
					+ (taxableIncome - 208850) * 0.33;
		else
			tax1 = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28
					+ (372950 - 208850) * 0.33 + (taxableIncome - 372950) * 0.35;

		if (taxableIncome <= 8350)
			tax2 = taxableIncome * 0.10;
		else if (taxableIncome <= 33950)
			tax2 = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
		else if (taxableIncome <= 68520)
			tax2 = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
		else if (taxableIncome <= 104425)
			tax2 = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68520 - 33950) * 0.25 + (taxableIncome - 68520) * 0.28;
		else if (taxableIncome <= 186475)
			tax2 = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68520 - 33950) * 0.25 + (104425 - 68520) * 0.28
					+ (taxableIncome - 104425) * 0.33;
		else
			tax2 = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68520 - 33950) * 0.25 + (104425 - 68520) * 0.28
					+ (186475 - 104425) * 0.33 + (taxableIncome - 186475) * 0.35;

		if (taxableIncome <= 11950)
			tax3 = taxableIncome * 0.10;
		else if (taxableIncome <= 45500)
			tax3 = 11950 * 0.10 + (taxableIncome - 11950) * 0.15;
		else if (taxableIncome <= 117450)
			tax3 = 11950 * 0.10 + (45500 - 11950) * 0.15 + (taxableIncome - 45500) * 0.25;
		else if (taxableIncome <= 190200)
			tax3 = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (taxableIncome - 117450) * 0.28;
		else if (taxableIncome <= 372950)
			tax3 = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28
					+ (taxableIncome - 190200) * 0.33;
		else
			tax3 = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28
					+ (372950 - 190200) * 0.33 + (taxableIncome - 372950) * 0.35;

		System.out.println((int) taxableIncome + "                  " + (int) tax0 + "             " + (int) tax1
				+ "                   " + (int) tax2 + "                    " + (int) tax3);
	}
}
