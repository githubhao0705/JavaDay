package homeWork;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������γ̴��ţ�1~3֮������֣���");
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
				System.out.println("����������������룡");
				break;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("����������������룡");
		} finally {
			System.out.print("��ӭ������飡");
		}
	}
}
