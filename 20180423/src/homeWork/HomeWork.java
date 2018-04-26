package homeWork;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入课程代号（1~3之间的数字）：");
		try {
			int flg = input.nextInt();
			switch (flg) {
			case 1:
				System.out.println("C");
				break;
			case 2:
				System.out.println("C#");
				break;
			case 3:
				System.out.println("C++");
				break;
			default:
				System.out.println("输入错误，请重新输入！");
				break;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("输入错误，请重新输入！");
		} finally {
			System.out.print("欢迎提出建议！");
		}
	}
}
