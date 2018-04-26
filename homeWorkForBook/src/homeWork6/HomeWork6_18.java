package homeWork6;

import java.util.Scanner;

public class HomeWork6_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("输入需要判断的密码：");
		boolean b = checkPassword(input.nextLine());
		System.out.println(b);
	}

	public static boolean checkPassword(String str) {
		return hasDigitsOrLetter(str)&&hasTwoDigits(str)&&checkLength(str);
	}
	
	//判断里面有数字或字母，使用Character类的方法isLetterOrDigit
	public static boolean hasDigitsOrLetter(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetterOrDigit(str.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	//判断里面含有两个以上数字 使用Character类的方法isDigit
	public static boolean hasTwoDigits(String str) {
		int flg = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				flg++;
			}
			if (flg >= 2) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean checkLength(String str) {
		return str.length()>=8;
	}
}
