package homeWork;

import java.util.Scanner;

public class Register {
	public static void verify() {
		System.out.println("***��ӭ����ע��ϵͳ***\n");
		while (true) {
			Scanner input = new Scanner(System.in);
			String userName, passWord0, passWord1;
			System.out.print("�������û�����");
			userName = input.nextLine();
			System.out.print("���������룺");
			passWord0 = input.nextLine();
			System.out.print("�������ٴ��������룺");
			passWord1 = input.nextLine();
			
			if (userName.length() < 3 || passWord0.length() < 6) {
				System.out.println("�û������Ȳ���С��3�����볤�Ȳ���С��6��");
				continue;
			}
			if (!passWord0.equals(passWord1)) {
				System.out.println("������������벻��ͬ��");
				continue;
			}
			System.out.println("ע��ɹ������μ��û��������롣");
			break;
		}
	}
}
