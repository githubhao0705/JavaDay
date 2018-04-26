package homeWork6;

import homeWork5.HomeWork5_39;

public class HomeWork6_11 {
	public static void main(String[] args) {
		System.out.println("��弁悳駆\t\t\t滑署");
		System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
		for (int i = 10000; i <= 100000; i+=5000) {
			System.out.print(i);
			System.out.printf("%23s", HomeWork5_39.computeCommission(i));
			System.out.println();
		}
	}
	
	
}
