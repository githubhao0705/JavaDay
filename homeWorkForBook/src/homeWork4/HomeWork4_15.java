package homeWork4;

import java.util.Scanner;

public class HomeWork4_15 {
	public static void main(String[] args) {
		System.out.print("Enter a letter: ");
		Scanner input = new Scanner(System.in);
		String phoneNumberString;
		phoneNumberString = input.next();
		Character phoneNumber = phoneNumberString.charAt(0);
		int number;
		number = inputPhone(phoneNumber);
		if (number >= 2 && number <= 9) {
			System.out.println("The corresponding number is " + number);
		} else if (number == -1) {
			System.out.println(phoneNumber + " is an invalid input");
		}
	}

	public static int inputPhone(Character c) {
		int flag = (int) (Character.toLowerCase(c));

		if (flag >= 97 && flag <= 99) {
			return 2;
		} else if (flag > 99 && flag <= 102) {
			return 3;
		} else if (flag > 102 && flag <= 105) {
			return 4;
		} else if (flag > 105 && flag <= 108) {
			return 5;
		} else if (flag > 108 && flag <= 111) {
			return 6;
		} else if (flag > 111 && flag <= 115) {
			return 7;
		} else if (flag > 115 && flag <= 118) {
			return 8;
		} else if (flag > 118 && flag <= 122) {
			return 9;
		} else {
			return -1;
		}
	}
}
