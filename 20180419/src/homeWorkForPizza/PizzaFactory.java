package homeWorkForPizza;

import java.util.Scanner;

public class PizzaFactory {
	public void makePizza() {
		System.out.println("请选择想要制作的披萨（1、培根披萨 2、海鲜披萨）");
		Scanner input = new Scanner(System.in);
		int flg = input.nextInt();
		switch (flg) {
		case 1:
			

			break;
		case 2:

			break;
		default:
			System.out.println("输入有误！");
			break;
		}
	}
}
