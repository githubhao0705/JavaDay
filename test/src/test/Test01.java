package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		                                    
		System.out.println("请输入被除数：");
		int n1=0;
		try {
			n1=input.nextInt();
		} catch (InputMismatchException e) {
			// TODO: handle exception  所应对的措施
			System.out.println("输入的类型不匹配。");
		}
		System.out.println("GOOD");
	}
}
