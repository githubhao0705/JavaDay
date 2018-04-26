
import java.util.Scanner;


public class homeWork {
	public static void main(String[] args) {

		// 尚学堂课堂习题01
		// 从控制台输入张三同学的成绩，并与李四的成绩80分进行比较，
		// 输入张三的成绩比李四的高么?的判断结果
		// System.out.print("李四的成绩为80分，请输入张三的成绩：");
		// double score = input.nextDouble();
		// if (score > 80) {
		// System.out.println("张三的成绩高于李四。");
		// } else if (score < 80) {
		// System.out.println("张三的成绩低于李四。");
		// } else {
		// System.out.println("张三的成绩和李四一样。");
		// }

		// 尚学堂课堂习题02
		// 从控制台输入基本工资，并计算输入实际工资
		// 物价津贴=基本工资*40%
		// 房租津贴=基本工资*25%
		// 员工薪水=基本工资+物价津贴+房租津贴
		// System.out.print("请输入基本工资：");
		// double money = input.nextDouble();
		// double moneyNow=money+money*0.4+money*0.25;
		// System.out.println("实际工资："+moneyNow);

		// 尚学堂课堂习题03
		// 根据抽奖规则计算会员卡号后四位数字之和，如果和为16，则为幸运会员。
		// System.out.print("请连续输入您的会员卡号：");
		// int primeKey=input.nextInt();
		// int a,b,c,d;
		// a=primeKey%10;//个位
		// b=primeKey/10%10;//十位
		// c=primeKey/10/10%10;//百位
		// d=primeKey/10/10/10%10;//千位
		// if (a+b+c+d!=16) {
		// System.out.println("很抱歉！");
		// } else {
		// System.out.println("恭喜你，你成为我超市的幸运会员！");
		// }

		// 尚学堂课后习题01
		// 输入一个数，判断是奇数还是偶数
		// 思路：
		// 1）首先判断该数是否整数，如非，则提示用户重新输入。
		// 2）如果整数，再分析是否能被2整除。最后得出结论。
		// double a;
		// System.out.println("（判断奇数/偶数）请输入一个数字：");
		// a = input.nextDouble();
		// if (a * 10 % 10 == 0 ) {
		// if (a % 2 == 0) {
		// System.out.print("你输入的数字为偶数。");
		// } else {
		// System.out.print("你输入的数字为奇数。");
		// }
		// } else {
		// System.out.print("你输入的数字不是整数，请重新输入。");
		// }

		// 尚学堂课后习题02
		// 根据成绩输出对应的等级，使用if多分支和switch语句分别实现
		// A级 [90,100]
		//
		// B级 [80,90)
		//
		// C级 [70,80)
		//
		// D级 [60,70)
		//
		// E级 [0,60)

//		String strA = "A级";
//		String strB = "B级";
//		String strC = "C级";
//		String strD = "D级";
//		String strE = "E级";
//		System.out.print("请输入你的成绩：");
//		Scanner input = new Scanner(System.in);
//		double a = input.nextDouble();
		// 使用if语句
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
		// 使用switch语句 switch 无法使用double类型作为判断
		// 所以需要把double强转成int
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

		// 尚学堂课后习题03
		// 根据月份，输出对应的季节，并输出至少两个描述该季节的成语和活动。
		// System.out.print("请以阿拉伯数字输入月份：");
		// int a=input.nextInt();
		// switch (a) {
		// case 12:
		// case 1:
		// case 2:
		// System.out.print("春天：春游");
		// break;
		// case 3:
		// case 4:
		// case 5:
		// System.out.print("夏天：蝉鸣");
		// break;
		// case 6:
		// case 7:
		// case 8:
		// System.out.print("秋天：蟹肥");
		// break;
		// case 9:
		// case 10:
		// case 11:
		// System.out.print("冬天：养膘");
		// break;
		// }

		// 尚学堂课后习题04
		// 判断一个数是否是素数。
		// 思路：
		// 1）先判断是否为正整数 num*10%10==0||num>0;
		// 2）再判断是否为素数 （大于1的自然数，除了1和其本身外，无法被其他自然数整除
		// 有误！
		// System.out.print("判断是否素数，请输入数字：");
		// double a = input.nextDouble();
		// if (a <= 0 || a * 10 % 10 != 0 || a == 1||a==3) {
		// System.out.print("这个数不是素数！");
		// } else if (a == 2) {
		// System.out.print("这个数是素数！");
		// } else {
		// for (int i = 2; i < Math.sqrt(a); i++) {
		// if (a % i == 0) {
		// System.out.print("这个数不是素数！");
		// break;
		// } else {
		// System.out.print("这个数是素数！");
		// break;
		// }
		// }
		// }

		// 尚学堂课后习题05
		// 从键盘输入一个班5个学生的分数，求和并输出。
		// System.out.print("请依次输入5个学生的成绩：");
		// double a = input.nextDouble();
		// double b = input.nextDouble();
		// double c = input.nextDouble();
		// double d = input.nextDouble();
		// double e = input.nextDouble();
		// System.out.print("五位学生成绩的和为：");
		//
		// System.out.print(a+b+c+d+e);

		// 尚学堂课后习题06
		// 从键盘输入某个十进制整数，转换成对应的二进制整数并输出。
		// 缺陷：无法转换负十进制数
		// System.out.print("请输入一个十进制整数：");
		// int a=input.nextInt();
		// String b="";
		// for (; a>0;) {
		// b=a%2+b;
		// //b+=a%2; 这关乎到顺序的问题，如果是这样写就是原文的倒序
		// a/=2;
		// }
		// System.out.print(b);

		// 尚学堂课后习题001
		// 根据考试成绩输出对应的礼物，90分以上爸爸给买电脑，80分以上爸爸给买手机，
		// 60分以上爸爸请吃一顿大餐，60分以下爸爸给买学习资料。
		// 要求：该题使用多重if完成
		// System.out.print("请输入成绩：");
		// double a = input.nextDouble();
		// if (a>=90) {
		// System.out.print("买电脑");
		// } else if(a>=80){
		// System.out.print("买手机");
		// }else if(a>=60){
		// System.out.print("吃大餐");
		// }else{
		// System.out.print("买资料");
		// }

		// 尚学堂课后习题002
		// 请根据英文单词的第一个字母判断星期几，如果第一个字母是一样的，
		// 则继续判断第二个字母。例如如果第一个字母是S,则继续判断第二个字母，
		// 如果第二个字母是a,则输出“星期六”。星期的英文单词如下表所示。
		//
		// 星期一 星期二 星期三 星期四 星期五 星期六 星期日
		// Monday Tuesday Wednesday Thursday Friday Saturday Sunday
		// Scanner input = new Scanner(System.in);
		//
		// String str = input.nextLine();
		//
		// if (str.charAt(0) == 'M') {
		// System.out.println("星期一");
		// } else if (str.charAt(0) == 'T') {
		// if (str.charAt(1) == 'u') {
		// System.out.println("星期二");
		// }else {
		// System.out.println("星期四");
		// }
		// } else if (str.charAt(0) == 'W') {
		// System.out.println("星期三");
		// } else if (str.charAt(0) == 'F') {
		// System.out.println("星期五");
		// } else if (str.charAt(0) == 'S') {
		// if (str.charAt(1) == 'u') {
		// System.out.println("星期日");
		// }else {
		// System.out.println("星期六");
		// }
		// }

		// 尚学堂课后习题003
		//
		// 输入一批整数，使用循环求出最大值与最小值，输入0时结束。
		// System.out.print("输入一批整数，使用循环求出最大值与最小值，输入0时结束：");
		// 记得用while 判断条件一直是true，if 输入0，则break。

		// 尚学堂课后习题004
		// 给20块钱买可乐，每瓶可乐3块钱，喝完之后退瓶子可以换回1块钱，
		// 问最多可以喝到多少瓶可乐
		// 思路：
		// 取余，商即为瓶，也为钱，与取余后得到的钱，合计，直至合计的数小于3；

		// 20/3=6 第一次获取瓶数 a
		// 20%3=2
		// 6+2=8

		// 8/3=2 第二次获取瓶数再赋予a
		// 8%3=2
		// 2+2=4

		// 4/3=1 第三次获取瓶数再赋予a
		// 4%3=1
		// 1+1=2 少于3，无法继续购买，中止
		//
		// int a=0,bottleNum, money1 = 20;
		// do {
		// bottleNum = money1 / 3;
		// a+=bottleNum;
		// money1 = money1 % 3;
		// money1 += bottleNum;
		// } while (money1 > 3);
		// System.out.print(a);

		// 尚学堂课后习题005
		// 从键盘输入某个十进制小数，转换成对应的二进制小数并输出。
		// （查询十进制小数转换成二进制小数的算法，使用循环来实现。
		// 最多保留小数位后7位数字即可）

	}
}
