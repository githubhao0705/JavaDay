
import java.util.Scanner;


public class homeWork {
	public static void main(String[] args) {

		// ��ѧ�ÿ���ϰ��01
		// �ӿ���̨��������ͬѧ�ĳɼ����������ĵĳɼ�80�ֽ��бȽϣ�
		// ���������ĳɼ������ĵĸ�ô?���жϽ��
		// System.out.print("���ĵĳɼ�Ϊ80�֣������������ĳɼ���");
		// double score = input.nextDouble();
		// if (score > 80) {
		// System.out.println("�����ĳɼ��������ġ�");
		// } else if (score < 80) {
		// System.out.println("�����ĳɼ��������ġ�");
		// } else {
		// System.out.println("�����ĳɼ�������һ����");
		// }

		// ��ѧ�ÿ���ϰ��02
		// �ӿ���̨����������ʣ�����������ʵ�ʹ���
		// ��۽���=��������*40%
		// �������=��������*25%
		// Ա��нˮ=��������+��۽���+�������
		// System.out.print("������������ʣ�");
		// double money = input.nextDouble();
		// double moneyNow=money+money*0.4+money*0.25;
		// System.out.println("ʵ�ʹ��ʣ�"+moneyNow);

		// ��ѧ�ÿ���ϰ��03
		// ���ݳ齱��������Ա���ź���λ����֮�ͣ������Ϊ16����Ϊ���˻�Ա��
		// System.out.print("�������������Ļ�Ա���ţ�");
		// int primeKey=input.nextInt();
		// int a,b,c,d;
		// a=primeKey%10;//��λ
		// b=primeKey/10%10;//ʮλ
		// c=primeKey/10/10%10;//��λ
		// d=primeKey/10/10/10%10;//ǧλ
		// if (a+b+c+d!=16) {
		// System.out.println("�ܱ�Ǹ��");
		// } else {
		// System.out.println("��ϲ�㣬���Ϊ�ҳ��е����˻�Ա��");
		// }

		// ��ѧ�ÿκ�ϰ��01
		// ����һ�������ж�����������ż��
		// ˼·��
		// 1�������жϸ����Ƿ���������ǣ�����ʾ�û��������롣
		// 2������������ٷ����Ƿ��ܱ�2���������ó����ۡ�
		// double a;
		// System.out.println("���ж�����/ż����������һ�����֣�");
		// a = input.nextDouble();
		// if (a * 10 % 10 == 0 ) {
		// if (a % 2 == 0) {
		// System.out.print("�����������Ϊż����");
		// } else {
		// System.out.print("�����������Ϊ������");
		// }
		// } else {
		// System.out.print("����������ֲ������������������롣");
		// }

		// ��ѧ�ÿκ�ϰ��02
		// ���ݳɼ������Ӧ�ĵȼ���ʹ��if���֧��switch���ֱ�ʵ��
		// A�� [90,100]
		//
		// B�� [80,90)
		//
		// C�� [70,80)
		//
		// D�� [60,70)
		//
		// E�� [0,60)

//		String strA = "A��";
//		String strB = "B��";
//		String strC = "C��";
//		String strD = "D��";
//		String strE = "E��";
//		System.out.print("��������ĳɼ���");
//		Scanner input = new Scanner(System.in);
//		double a = input.nextDouble();
		// ʹ��if���
		//
		// if (a >= 90) {
		// System.out.print(strA);
		// } else if (a >= 80) {
		// System.out.print(strB);
		// } else if (a >= 70) {
		// System.out.print(strC);
		// } else if (a >= 60) {
		// System.out.print(strD);
		// } else {
		// System.out.print(strE);
		// }
		//
		// ʹ��switch��� switch �޷�ʹ��double������Ϊ�ж�
		// ������Ҫ��doubleǿת��int
//		switch (()a) {
//		case (a >= 90):
//			System.out.print(strA);
//			break;
//		case (a >= 80 && a < 90):
//			System.out.print(strB);
//			break;
//		case (a >= 70 && a < 80):
//			System.out.print(strC);
//			break;
//		case (a >= 60 && a < 70):
//			System.out.print(strD);
//			break;
//		case (a < 60):
//			System.out.print(strE);
//			break;
//		}

		// ��ѧ�ÿκ�ϰ��03
		// �����·ݣ������Ӧ�ļ��ڣ�������������������ü��ڵĳ���ͻ��
		// System.out.print("���԰��������������·ݣ�");
		// int a=input.nextInt();
		// switch (a) {
		// case 12:
		// case 1:
		// case 2:
		// System.out.print("���죺����");
		// break;
		// case 3:
		// case 4:
		// case 5:
		// System.out.print("���죺����");
		// break;
		// case 6:
		// case 7:
		// case 8:
		// System.out.print("���죺з��");
		// break;
		// case 9:
		// case 10:
		// case 11:
		// System.out.print("���죺����");
		// break;
		// }

		// ��ѧ�ÿκ�ϰ��04
		// �ж�һ�����Ƿ���������
		// ˼·��
		// 1�����ж��Ƿ�Ϊ������ num*10%10==0||num>0;
		// 2�����ж��Ƿ�Ϊ���� ������1����Ȼ��������1���䱾���⣬�޷���������Ȼ������
		// ����
		// System.out.print("�ж��Ƿ����������������֣�");
		// double a = input.nextDouble();
		// if (a <= 0 || a * 10 % 10 != 0 || a == 1||a==3) {
		// System.out.print("���������������");
		// } else if (a == 2) {
		// System.out.print("�������������");
		// } else {
		// for (int i = 2; i < Math.sqrt(a); i++) {
		// if (a % i == 0) {
		// System.out.print("���������������");
		// break;
		// } else {
		// System.out.print("�������������");
		// break;
		// }
		// }
		// }

		// ��ѧ�ÿκ�ϰ��05
		// �Ӽ�������һ����5��ѧ���ķ�������Ͳ������
		// System.out.print("����������5��ѧ���ĳɼ���");
		// double a = input.nextDouble();
		// double b = input.nextDouble();
		// double c = input.nextDouble();
		// double d = input.nextDouble();
		// double e = input.nextDouble();
		// System.out.print("��λѧ���ɼ��ĺ�Ϊ��");
		//
		// System.out.print(a+b+c+d+e);

		// ��ѧ�ÿκ�ϰ��06
		// �Ӽ�������ĳ��ʮ����������ת���ɶ�Ӧ�Ķ����������������
		// ȱ�ݣ��޷�ת����ʮ������
		// System.out.print("������һ��ʮ����������");
		// int a=input.nextInt();
		// String b="";
		// for (; a>0;) {
		// b=a%2+b;
		// //b+=a%2; ��غ���˳������⣬���������д����ԭ�ĵĵ���
		// a/=2;
		// }
		// System.out.print(b);

		// ��ѧ�ÿκ�ϰ��001
		// ���ݿ��Գɼ������Ӧ�����90�����ϰְָ�����ԣ�80�����ϰְָ����ֻ���
		// 60�����ϰְ����һ�ٴ�ͣ�60�����°ְָ���ѧϰ���ϡ�
		// Ҫ�󣺸���ʹ�ö���if���
		// System.out.print("������ɼ���");
		// double a = input.nextDouble();
		// if (a>=90) {
		// System.out.print("�����");
		// } else if(a>=80){
		// System.out.print("���ֻ�");
		// }else if(a>=60){
		// System.out.print("�Դ��");
		// }else{
		// System.out.print("������");
		// }

		// ��ѧ�ÿκ�ϰ��002
		// �����Ӣ�ĵ��ʵĵ�һ����ĸ�ж����ڼ��������һ����ĸ��һ���ģ�
		// ������жϵڶ�����ĸ�����������һ����ĸ��S,������жϵڶ�����ĸ��
		// ����ڶ�����ĸ��a,��������������������ڵ�Ӣ�ĵ������±���ʾ��
		//
		// ����һ ���ڶ� ������ ������ ������ ������ ������
		// Monday Tuesday Wednesday Thursday Friday Saturday Sunday
		// Scanner input = new Scanner(System.in);
		//
		// String str = input.nextLine();
		//
		// if (str.charAt(0) == 'M') {
		// System.out.println("����һ");
		// } else if (str.charAt(0) == 'T') {
		// if (str.charAt(1) == 'u') {
		// System.out.println("���ڶ�");
		// }else {
		// System.out.println("������");
		// }
		// } else if (str.charAt(0) == 'W') {
		// System.out.println("������");
		// } else if (str.charAt(0) == 'F') {
		// System.out.println("������");
		// } else if (str.charAt(0) == 'S') {
		// if (str.charAt(1) == 'u') {
		// System.out.println("������");
		// }else {
		// System.out.println("������");
		// }
		// }

		// ��ѧ�ÿκ�ϰ��003
		//
		// ����һ��������ʹ��ѭ��������ֵ����Сֵ������0ʱ������
		// System.out.print("����һ��������ʹ��ѭ��������ֵ����Сֵ������0ʱ������");
		// �ǵ���while �ж�����һֱ��true��if ����0����break��

		// ��ѧ�ÿκ�ϰ��004
		// ��20��Ǯ����֣�ÿƿ����3��Ǯ������֮����ƿ�ӿ��Ի���1��Ǯ��
		// �������Ժȵ�����ƿ����
		// ˼·��
		// ȡ�࣬�̼�Ϊƿ��ҲΪǮ����ȡ���õ���Ǯ���ϼƣ�ֱ���ϼƵ���С��3��

		// 20/3=6 ��һ�λ�ȡƿ�� a
		// 20%3=2
		// 6+2=8

		// 8/3=2 �ڶ��λ�ȡƿ���ٸ���a
		// 8%3=2
		// 2+2=4

		// 4/3=1 �����λ�ȡƿ���ٸ���a
		// 4%3=1
		// 1+1=2 ����3���޷�����������ֹ
		//
		// int a=0,bottleNum, money1 = 20;
		// do {
		// bottleNum = money1 / 3;
		// a+=bottleNum;
		// money1 = money1 % 3;
		// money1 += bottleNum;
		// } while (money1 > 3);
		// System.out.print(a);

		// ��ѧ�ÿκ�ϰ��005
		// �Ӽ�������ĳ��ʮ����С����ת���ɶ�Ӧ�Ķ�����С���������
		// ����ѯʮ����С��ת���ɶ�����С�����㷨��ʹ��ѭ����ʵ�֡�
		// ��ౣ��С��λ��7λ���ּ��ɣ�

	}
}
