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
	// �ڲ���
	public class InnerClass {
		// static int n; //��Ա�ڲ��಻��������̬����
		int n;
		int num; // ��Ա�ڲ����������ı������������ⲿ�����ı�������ͬ

		public void innerClassTest() {
			System.out.println(n); // �������ڲ�����ֱ�ӷ����Լ��ı���
			System.out.println(this.n); // ����this.Ҳ�ɷ���
			System.out.println(OuterClass.this.num); // �����ⲿ����������ʱ����Ҫ�� �ⲿ����.this.������ �ſɷ����ⲿ����
			System.out.println(j);// ��û����������ֱ�ӷ���
		}
	}
}