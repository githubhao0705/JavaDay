package homeWorkForPizza;

import java.util.Scanner;

public class PizzaFactory {
	public void makePizza() {
		System.out.println("��ѡ����Ҫ������������1��������� 2������������");
		Scanner input = new Scanner(System.in);
		int flg = input.nextInt();
		switch (flg) {
		case 1:
			

			break;
		case 2:

			break;
		default:
			System.out.println("��������");
			break;
		}
	}
}
