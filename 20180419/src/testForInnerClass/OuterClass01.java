package testForInnerClass;

import testForInnerClass.OuterClass.InnerClass;

public class OuterClass01 {
	public static void main(String[] args) {
		InnerClass test1 = new OuterClass().new InnerClass();
		
		test1.innerClassTest();
	}
}

class OuterClass {
	int num;
	int j;
	// 内部类
	public class InnerClass {
		// static int n; //成员内部类不能声明静态变量
		int n;
		int num; // 成员内部类中声明的变量名可以与外部声明的变量名相同

		public void innerClassTest() {
			System.out.println(n); // 可以在内部类中直接访问自己的变量
			System.out.println(this.n); // 加上this.也可访问
			System.out.println(OuterClass.this.num); // 在内外部有重名变量时，需要用 外部类名.this.变量名 才可访问外部变量
			System.out.println(j);// 如没有重名，可直接访问
		}
	}
}