package homeWork6;

import java.util.Scanner;

public class HomeWork6_16 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("���뿪ʼ�����������");
		int starYear=input.nextInt();
		System.out.print("������������������");
		int endYear=input.nextInt();
		for (int i = starYear; i <= endYear; i++) {
			System.out.print(i+"����"+numberOfDaysInAyear(i)+"��\n");
		}
	}
	// �ܱ�4�������Ҳ��ܱ�100����������Ա�400������Ϊ����

	// ����һ�򣬰��겻���İ������� �����������յ���ݽ����꣬�෴����ƽ�꣬
	// ƽ��Ϊ365�죬����Ϊ366�졣
	// �ڹ������������������У�ƽ��Ķ���Ϊ28�죬����Ķ���Ϊ29�졣
	public static int numberOfDaysInAyear(int year) {
		int days = 365;

		if ((year%4==0&&year%100!=0)||(year%400==0)) {
			days=366;
		}
		
		return days;
	}
}
