import java.util.Scanner;

public class homeWork {
	public static void main(String[] args) {
		// ����ϰ��01
		// ��һ������500��Ǯ,�ڶ�������300,����������100,����������Ҫ��������ϰ

		// ����ϰ��02
		// �������һ����ĸ �����ж���ĸ�ķ���
		// (a e i o u Ԫ����ĸ y w ��Ԫ����ĸ �������Ǹ�����ĸ)
		// switch ((char) (Math.random() * 26 + 97)) {
		// case 'a':
		// case 'e':
		// case 'i':
		// case 'o':
		// case 'u':
		// System.out.println("Ԫ����ĸ");
		// break;
		// case 'y':
		// case 'w':
		// System.out.println("��Ԫ����ĸ");
		// break;
		// default:
		// System.out.println("������ĸ");
		// break;
		// }

		// ����ϰ��03
		// ����:
		// 1, ��������Ʊ�ļ۸�,
		// ԭ�ۻ�ƱΪ5000,����ͷ�Ȳմ�����,���òմ�����
		// ����ͷ�Ȳ�9��,���ò�8��
		// Ҫ��:
		// ��д����ʵ��:
		// ����������·����λ�������Ʊ�ļ۸�,
		// 1����ͷ�Ȳ�
		// 2�����ò�
		// 4-10��Ϊ����,�����·�Ϊ����

		// Scanner input =new Scanner(System.in);
		// String str1="�����뵱ǰ�·ݣ����������ֱ�ʾ����";
		// String str2="����������Ҫ����Ĳ�λ"+"\n"+"��ͷ�Ȳ����á�1����ʾ�����ò����á�2����ʾ����";
		// String str3="�㹺����ǣ�ͷ�Ȳ�"+"\n"+"��ǰΪ������"+"\n"+"�ۺ�ۣ�";
		// String str4="�㹺����ǣ�ͷ�Ȳ�"+"\n"+"��ǰΪ������"+"\n"+"�ۺ�ۣ�";
		// System.out.println(str1);
		// int month =input.nextInt();
		// if (month<1||month>12) {
		// System.out.println("�����޷�ʶ�����������룡");
		// return;
		// }
		// System.out.println(str2);
		// int level =input.nextInt();
		// switch (month) {
		// case 4:
		// case 5:
		// case 6:
		// case 7:
		// case 8:
		// case 9:
		// case 10:
		// if (level==1) {
		// System.out.print(str3);
		// System.out.println(5000*0.9);
		// } else if(level==2){
		// System.out.print(str3);
		// System.out.println(5000*0.8);
		// }else {
		// System.out.println("�����޷�ʶ�����������룡");
		// }
		// break;
		// case 11:
		// case 12:
		// case 1:
		// case 2:
		// case 3:
		// if (level==1) {
		// System.out.print(str4);
		// System.out.println(5000*0.5);
		// } else if(level==2){
		// System.out.print(str4);
		// System.out.println(5000*0.4);
		// }else {
		// System.out.println("�����޷�ʶ�����������룡");
		// }
		// break;
		// }

		// ����ϰ��04
		// ��while��forѭ���ֱ����100����������ż���ĺͣ��������
		// int sumOdd=0,sumEven=0;
		// for (int i = 0; i <= 100; i++) {
		// if (i%2==0) {
		// sumEven+=i;
		// } else {
		// sumOdd+=i;
		// }
		// }
		// int i = 0;
		// while (i <= 100) {
		// if (i%2==0) {
		// sumEven+=i;
		// i++;
		// } else {
		// sumOdd+=i;
		// i++;
		// }
		// }
		// System.out.println("100�������������ĺ�Ϊ��"+sumOdd);
		// System.out.println("100��������ż���ĺ�Ϊ��"+sumEven);
		//

		// ����ϰ��05
		// ��while��forѭ�����1-1000֮���ܱ�5������������ÿ�����3����
		// for (int i = 1, j = 0; i <= 1000; i++) {
		// if (i % 5 == 0) {
		// j++;
		// System.out.print(i + " ");
		// if (j % 3 == 0) {
		// System.out.println();
		// }
		// }
		// }

		// ����ϰ��06
		// ѭ��¼��ĳѧ��5�ſεĳɼ����Ҽ���ƽ����,
		// �������¼��Ϊ����,����¼��
		// Scanner input = new Scanner(System.in);
		// double sum = 0;
		// int i = 1;
		// while (i <= 5) {
		// System.out.println("��¼���" + i + "�ſεĳɼ���");
		// double score = input.nextDouble();
		// if (score < 0) {
		// System.out.println("¼��������������룡");
		// } else {
		// i++;
		// sum += score;
		// }
		// }
		// System.out.println("5�ſεĳɼ�ƽ����Ϊ��" + sum / 5);

		// ����ϰ��07

		// �����1��+2��+����+10!
		// int sum = 0, a=1;
		// for (int i = 1; i <= 10; i++) {
		// for (int j = 1; j <= i; j++) {
		// a = j * a;
		// }
		// sum += a;
		// }
		// System.out.println(sum);

		////////////////////////////////
		// int sum=0,a=1;
		// for (int i = 1; i <=10; i++) {
		// a*=i;
		// sum+=a;
		// }
		// System.out.print(sum);
		///////////////////////////////

		// [1]��100 ÿ�εݼ�5 ��� ֱ�����5
		// for (int i = 100; i > 0; i-=5) {
		// System.out.print(i+" ");
		// }

		// [2]��1~50 ����7�ı��������ĺ�
		// int sum=0;
		// for (int i = 50; i > 0; i--) {
		// if (i%7==0) {
		// sum+=i;
		// }
		// }
		// System.out.println(sum);

		// [3]����һ������,ʹ��ѭ��������ֵ����Сֵ,����0 ʱ����
		// Scanner input = new Scanner(System.in);
		//
		// int num, max = 0, min = 0;
		// System.out.println("������һ��������");
		// while (true) {
		// num = input.nextInt();
		// if (num == 0) {
		// break;
		// }else {
		// if (num>=max) {
		// max=num;
		// }
		// if (num<=min) {
		// min=num;
		// }
		// }
		// }
		// System.out.print("������Ϊ��");
		// System.out.println(max);
		// System.out.print("��С����Ϊ��");
		// System.out.println(min);

		// [4]��ӡ�˷��ھ�
		//
		// for (int i = 1; i <=9; i++) {
		// for (int j = 1; j <=i; j++) {
		// System.out.print(j+"*"+i+"="+j*i+" ");
		// }
		// System.out.println();
		// }

		// 2.�ж�1-100֮���ж��ٸ��������������������
		// �����ж�һ�����Ƿ��������Ĺ�����ȡ�ɷ�������ѭ����ֱ�ӵ��ü��ɣ�
		// for (int i = 1; i <= 100; i++) {
		// if (isPrime(i)) {
		// System.out.print(i+" ");
		// }
		// }

		// 3.���������࣬ÿ��10��ѧ���ĳɼ�����Ͳ���ƽ����
		// Scanner input =new Scanner(System.in);
		// for (int i = 1; i <= 3; i++) {
		// double sum=0;
		// for (int j = 1; j <= 10; j++) {
		// System.out.println("������"+i+"��ĵ�"+j+"��ѧ���ĳɼ���");
		// double score =input.nextDouble();
		// sum+=score;
		// }
		// System.out.println(i+"��");
		// System.out.println("�ܳɼ�Ϊ��"+sum);
		// System.out.println("ƽ����Ϊ��"+sum/10);
		// }

		// 4.��д�ݹ��㷨����һ�����Ĺ�������: 1��1��2��3��5��8��13��21��34......
		// �����еĵ�40λ���Ƕ��١�
		
		

		// 1.��ӡ�����е�"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ����λ�������λ���������͵��ڸ�������
		// ���磺153��һ��"ˮ�ɻ���"����Ϊ153=1�����η���5�����η���3�����η���
		// for (int i = 100; i <= 999; i++) {
		// int a=(int)Math.pow(i/10/10%10,
		// 3),b=(int)Math.pow(i/10%10,3),c=(int)Math.pow(i%10,3);
		// if (a+b+c==i) {
		// System.out.print(i+" ");
		// }
		// }

		// 2.���巽������ӡָ���к��еľ���
		// Scanner input = new Scanner(System.in);
		// System.out.println("��������ε�������");
		// int row = input.nextInt();
		// System.out.println("��������ε�������");
		// int column = input.nextInt();
		//
		// for (int i = 0; i < row; i++) {
		// for (int j = 0; j < column; j++) {
		// System.out.print("*"+ " ");
		// }
		// System.out.println();
		// }

		// 3.��дJava����ʵ�ֽ����û����������������������Ľ׳ˡ�
		// Ҫ�����������������1-10֮�䣬��Ч���ݽ�����ʾ����������Ҫ��ʹ�õݹ��ѭ���ֱ�ʵ�֡��������磺4��=1*2*3*4=24
		// Scanner input = new Scanner(System.in);
		// double num = input.nextDouble();
		// int a=1;
		// if (num * 10 % 10 != 0) {
		// System.out.println("��Ч���ݣ���������ֹ��");
		// } else if(num < 1 || num > 10){
		// System.out.println("��Ч���ݣ���������ֹ��");
		// }else {
		// System.out.print((int)num + "! =");
		// for (int i = 1; i <= num; i++) {
		// if (i != num) {
		// a*=i;
		// System.out.print(i + "*");
		// }else {
		// a*=i;
		// System.out.print(i);}
		// }
		// System.out.println("="+a);
		// }
	}
	//
	// public static int dG(int a) {
	// for (int i = 1; i <a; i++) {
	// return a+=i;
	// }
	// }

	// ������Ϸ,��дһ������,��ɲ�����Ϸ,
	// ����һ��1~10֮��������,����������ԶԱ�,
	// ���ؽ�� ���к�û����
	public static void add(double a) {
		int b = (int) (Math.random() * 10 + 1);
		if (a == b) {
			System.out.println("�������" + b + "\n" + "����");
		} else {
			System.out.println("�������" + b + "\n" + "û����");
		}
	}

	// ��дһ������,�������int �������ݵĽ���,
	// �����󽫽����Ľ����� �������봫�����float�����أ�

	public static void exchange(double a, double b) {
		double temp;
		temp = b;
		b = a;
		a = temp;
		return;
	}
	
	//�ж��Ƿ�����
	
	public static boolean isPrime(int a) {
		boolean flag = true;
		if (a < 2) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(a); i++) {
				if (a % i == 0) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}
}
