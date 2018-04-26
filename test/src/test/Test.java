package test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean b = true;
		int n1 = 0;
		int n2 = 1;
		System.out.println("请输入被除数");
		while (b) {
			if (input.hasNextInt()) {
				n1 = input.nextInt();
				b = false;
			}else {
				String string = input.next();
				System.out.println("输入的类型不匹配,请重新输入");
			}
		}
		b = true;
		System.out.println("请输入除数");
		while (b) {
			if (input.hasNextInt()) {
				n2 = input.nextInt();
				if (n2 == 0) {
					System.out.println("除数不能为0");
				}else {
					b = false;
				}
			}else {
				String string = input.next();
				System.out.println("输入的类型不匹配,请重新输入");
			}
		}
		System.out.println("结果为:"+n1/n2);
	}
}
