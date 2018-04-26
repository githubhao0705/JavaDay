package homeWork;

import java.util.Scanner;

public class TestForAgeException {
	public static void main(String[] args) {
		Age a=new Age();
		try {
			test(a);
			System.out.println(a.getAge());
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(a.getAge());
		}
	}
	
	public static void test(Age age) throws AgeException {
		Scanner input =new Scanner(System.in);
		System.out.print("输入年龄：");
		int number=input.nextInt();
		if (1<number||100>number) {
			throw new AgeException("年龄不能小于1，或大于100！");
		}else {
			age.setAge(input.nextInt());
		}
	}
}
