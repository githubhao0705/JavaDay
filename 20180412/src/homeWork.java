import java.util.Scanner;

public class homeWork {
	public static void main(String[] args) {
		// 课堂习题01
		// 第一名奖励500块钱,第二名奖励300,第三名奖励100,第四名往后要加上晚自习

		// 课堂习题02
		// 随机生成一个字母 并且判断字母的分类
		// (a e i o u 元音字母 y w 半元音字母 其他的是辅音字母)
		// switch ((char) (Math.random() * 26 + 97)) {
		// case 'a':
		// case 'e':
		// case 'i':
		// case 'o':
		// case 'u':
		// System.out.println("元音字母");
		// break;
		// case 'y':
		// case 'w':
		// System.out.println("半元音字母");
		// break;
		// default:
		// System.out.println("辅音字母");
		// break;
		// }

		// 课堂习题03
		// 案例:
		// 1, 淡旺季机票的价格,
		// 原价机票为5000,淡季头等舱打五折,经济舱打四折
		// 旺季头等舱9折,经济舱8折
		// 要求:
		// 编写程序实现:
		// 输入任意的月份与仓位来计算机票的价格,
		// 1代表头等舱
		// 2代表经济舱
		// 4-10月为旺季,其他月份为淡季

		// Scanner input =new Scanner(System.in);
		// String str1="请输入当前月份（阿拉伯数字表示）：";
		// String str2="请输入你需要购买的舱位"+"\n"+"（头等舱请用‘1’表示，经济舱请用‘2’表示）：";
		// String str3="你购买的是：头等舱"+"\n"+"当前为：旺季"+"\n"+"折后价：";
		// String str4="你购买的是：头等舱"+"\n"+"当前为：淡季"+"\n"+"折后价：";
		// System.out.println(str1);
		// int month =input.nextInt();
		// if (month<1||month>12) {
		// System.out.println("输入无法识别，请重新输入！");
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
		// System.out.println("输入无法识别，请重新输入！");
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
		// System.out.println("输入无法识别，请重新输入！");
		// }
		// break;
		// }

		// 课堂习题04
		// 用while和for循环分别计算100以内奇数和偶数的和，并输出。
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
		// System.out.println("100以内所有奇数的和为："+sumOdd);
		// System.out.println("100以内所有偶数的和为："+sumEven);
		//

		// 课堂习题05
		// 用while和for循环输出1-1000之间能被5整除的数，且每行输出3个。
		// for (int i = 1, j = 0; i <= 1000; i++) {
		// if (i % 5 == 0) {
		// j++;
		// System.out.print(i + " ");
		// if (j % 3 == 0) {
		// System.out.println();
		// }
		// }
		// }

		// 课堂习题06
		// 循环录入某学生5门课的成绩并且计算平均分,
		// 如果分数录入为负数,重新录入
		// Scanner input = new Scanner(System.in);
		// double sum = 0;
		// int i = 1;
		// while (i <= 5) {
		// System.out.println("请录入第" + i + "门课的成绩：");
		// double score = input.nextDouble();
		// if (score < 0) {
		// System.out.println("录入错误，请重新输入！");
		// } else {
		// i++;
		// sum += score;
		// }
		// }
		// System.out.println("5门课的成绩平均分为：" + sum / 5);

		// 课堂习题07

		// 编程求：1！+2！+……+10!
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

		// [1]从100 每次递减5 输出 直至输出5
		// for (int i = 100; i > 0; i-=5) {
		// System.out.print(i+" ");
		// }

		// [2]从1~50 中是7的倍数的数的和
		// int sum=0;
		// for (int i = 50; i > 0; i--) {
		// if (i%7==0) {
		// sum+=i;
		// }
		// }
		// System.out.println(sum);

		// [3]输入一批整数,使用循环求出最大值和最小值,输入0 时结束
		// Scanner input = new Scanner(System.in);
		//
		// int num, max = 0, min = 0;
		// System.out.println("请输入一批整数！");
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
		// System.out.print("最大的数为：");
		// System.out.println(max);
		// System.out.print("最小的数为：");
		// System.out.println(min);

		// [4]打印乘法口诀
		//
		// for (int i = 1; i <=9; i++) {
		// for (int j = 1; j <=i; j++) {
		// System.out.print(j+"*"+i+"="+j*i+" ");
		// }
		// System.out.println();
		// }

		// 2.判断1-100之间有多少个素数并输出所有素数。
		// （将判断一个数是否是素数的功能提取成方法，在循环中直接调用即可）
		// for (int i = 1; i <= 100; i++) {
		// if (isPrime(i)) {
		// System.out.print(i+" ");
		// }
		// }

		// 3.输入三个班，每班10个学生的成绩，求和并求平均分
		// Scanner input =new Scanner(System.in);
		// for (int i = 1; i <= 3; i++) {
		// double sum=0;
		// for (int j = 1; j <= 10; j++) {
		// System.out.println("请输入"+i+"班的第"+j+"个学生的成绩：");
		// double score =input.nextDouble();
		// sum+=score;
		// }
		// System.out.println(i+"班");
		// System.out.println("总成绩为："+sum);
		// System.out.println("平均分为："+sum/10);
		// }

		// 4.编写递归算法程序：一列数的规则如下: 1、1、2、3、5、8、13、21、34......
		// 求数列的第40位数是多少。
		
		

		// 1.打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
		// 例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
		// for (int i = 100; i <= 999; i++) {
		// int a=(int)Math.pow(i/10/10%10,
		// 3),b=(int)Math.pow(i/10%10,3),c=(int)Math.pow(i%10,3);
		// if (a+b+c==i) {
		// System.out.print(i+" ");
		// }
		// }

		// 2.定义方法：打印指定行和列的矩形
		// Scanner input = new Scanner(System.in);
		// System.out.println("请输入矩形的行数：");
		// int row = input.nextInt();
		// System.out.println("请输入矩形的列数：");
		// int column = input.nextInt();
		//
		// for (int i = 0; i < row; i++) {
		// for (int j = 0; j < column; j++) {
		// System.out.print("*"+ " ");
		// }
		// System.out.println();
		// }

		// 3.编写Java程序，实现接收用户输入的正整数，输出该数的阶乘。
		// 要求：限制输入的数据在1-10之间，无效数据进行提示，结束程序。要求使用递归和循环分别实现。输出结果如：4！=1*2*3*4=24
		// Scanner input = new Scanner(System.in);
		// double num = input.nextDouble();
		// int a=1;
		// if (num * 10 % 10 != 0) {
		// System.out.println("无效数据，程序已中止。");
		// } else if(num < 1 || num > 10){
		// System.out.println("无效数据，程序已中止。");
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

	// 猜数游戏,编写一个功能,完成猜数游戏,
	// 产生一个1~10之间的随机数,与输入的数对对比,
	// 返回结果 猜中和没猜中
	public static void add(double a) {
		int b = (int) (Math.random() * 10 + 1);
		if (a == b) {
			System.out.println("随机数：" + b + "\n" + "猜中");
		} else {
			System.out.println("随机数：" + b + "\n" + "没猜中");
		}
	}

	// 编写一个方法,完成两个int 类型数据的交换,
	// 交换后将交换的结果输出 假如我想传入的是float类型呢？

	public static void exchange(double a, double b) {
		double temp;
		temp = b;
		b = a;
		a = temp;
		return;
	}
	
	//判断是否素数
	
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
