package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		                                    
		System.out.println("�����뱻������");
		int n1=0;
		try {
			n1=input.nextInt();
		} catch (InputMismatchException e) {
			// TODO: handle exception  ��Ӧ�ԵĴ�ʩ
			System.out.println("��������Ͳ�ƥ�䡣");
		}
		System.out.println("GOOD");
	}
}
