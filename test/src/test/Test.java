package test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean b = true;
		int n1 = 0;
		int n2 = 1;
		System.out.println("�����뱻����");
		while (b) {
			if (input.hasNextInt()) {
				n1 = input.nextInt();
				b = false;
			}else {
				String string = input.next();
				System.out.println("��������Ͳ�ƥ��,����������");
			}
		}
		b = true;
		System.out.println("���������");
		while (b) {
			if (input.hasNextInt()) {
				n2 = input.nextInt();
				if (n2 == 0) {
					System.out.println("��������Ϊ0");
				}else {
					b = false;
				}
			}else {
				String string = input.next();
				System.out.println("��������Ͳ�ƥ��,����������");
			}
		}
		System.out.println("���Ϊ:"+n1/n2);
	}
}
