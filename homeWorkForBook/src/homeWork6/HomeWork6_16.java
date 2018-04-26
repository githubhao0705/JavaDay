package homeWork6;

import java.util.Scanner;

public class HomeWork6_16 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("输入开始计算的年数：");
		int starYear=input.nextInt();
		System.out.print("输入结束计算的年数：");
		int endYear=input.nextInt();
		for (int i = starYear; i <= endYear; i++) {
			System.out.print(i+"年有"+numberOfDaysInAyear(i)+"天\n");
		}
	}
	// 能被4整除，且不能被100整除，或可以被400整除，为闰年

	// 四年一闰，百年不闰，四百年再闰。 阳历中有闰日的年份叫闰年，相反就是平年，
	// 平年为365天，闰年为366天。
	// 在公历（格里历）纪年中，平年的二月为28天，闰年的二月为29天。
	public static int numberOfDaysInAyear(int year) {
		int days = 365;

		if ((year%4==0&&year%100!=0)||(year%400==0)) {
			days=366;
		}
		
		return days;
	}
}
