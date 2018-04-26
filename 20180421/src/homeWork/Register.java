package homeWork;

import java.util.Scanner;

public class Register {
	public static void verify() {
		System.out.println("***欢迎进入注册系统***\n");
		while (true) {
			Scanner input = new Scanner(System.in);
			String userName, passWord0, passWord1;
			System.out.print("请输入用户名：");
			userName = input.nextLine();
			System.out.print("请输入密码：");
			passWord0 = input.nextLine();
			System.out.print("请输入再次输入密码：");
			passWord1 = input.nextLine();
			
			if (userName.length() < 3 || passWord0.length() < 6) {
				System.out.println("用户名长度不能小于3，密码长度不能小于6！");
				continue;
			}
			if (!passWord0.equals(passWord1)) {
				System.out.println("两次输入的密码不相同！");
				continue;
			}
			System.out.println("注册成功！请牢记用户名和密码。");
			break;
		}
	}
}
