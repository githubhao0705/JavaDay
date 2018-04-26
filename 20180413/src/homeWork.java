
import java.util.Arrays;
import java.util.Scanner;

public class homeWork {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// int num = 0;
		// for (int i = 1; i <= 2; i++) {
		// System.out.println("欢迎来到第" + i + "家服装店！");
		// for (int j = 1; j <= 3; j++) {
		// System.out.println("输入========" + "\n" + "1：购买一件衣服" + "\n" + "2：退出服装店");
		// int flag = input.nextInt();
		// if (flag == 1) {
		// num++;
		// } else {
		// break;
		// }
		// }
		// }
		// System.out.println("你一共购买了"+num+"件衣服！");

		// int sum = 0, a = 0;
		// for (int i = 1; i <= 2; i++) {
		// for (int j = 1; j <= 2; j++) {
		// System.out.println("请输入" + i + "班第" + j + "个同学的成绩：");
		// double socre = input.nextDouble();
		// sum += socre;
		// if (socre >= 85) {
		// a++ ;
		// }
		// }
		// System.out.println(i + "班的平均分为：" + sum / 4);
		// }
		// System.out.println("成绩大于等于85分的同学一共有" + a + "个！");

		// 课堂习题01
		// 累加求和,给定一个数组,数组中的元素的值不确定,
		// 由用户录入,计算数组中的元素的和

		// System.out.println("请输入所需求和数字的个数：");
		// int num1=input.nextInt();
		// double [] sum=new double[num1];
		// double a=0;
		// for (int i = 1; i <= sum.length; i++) {
		// System.out.println("请输入第"+i+"数字：");
		// double num2=input.nextDouble();
		// a+=num2;
		// }
		// System.out.println("最终结果为："+a);

		// 课堂习题02
		// 写成一个方法。猜数游戏,从键盘中任意输入一个数 判断数组中是否包含次数

		// int[] intarr= {1,9,6,5,7,2,5,1,9,54,3,75,6,5,4,1,2};
		// System.out.println(aaa(0, intarr));

		// 1.数组查找操作：定义一个长度为10 的一维字符串数组，
		// 在每一个元素存放一个单词；然后运行时从命令行输入一个单词，
		// 程序判断数组是否包含有这个单词，包含这个单词就打印出“Yes”，
		// 不包含就打印出“No”。
		//
		// String[] strArray = new String[] { "doog", "ww", "life", "is", "the", "hell",
		// "but", "is", "so", "funny" };
		// String str = input.nextLine();
		//
		// int yesOrNo=0;
		// for (int i = 0; i < strArray.length; i++) {
		// if (str.equals(strArray[i])) {
		// yesOrNo++;
		// }
		// }
		// if (yesOrNo>0) {
		// System.out.println("Yes");
		// }else {
		// System.out.println("No");
		// }

		// 2.获取数组最大值和最小值操作：利用Java的Math类的random()方法，
		// 编写函数得到0到n之间的随机数，n是参数。
		// 并找出产生50个这样的随机数中最大的、最小的数，并统计其中>=60的有多少个。
		// 提示：使用 int num=(int)(n*Math.random());获取随机数
		// int[] a = randomArray(100);
		//
		// for (int i = 1; i <= a.length; i++) {
		// System.out.print(a[i - 1] + "\t");
		// if (i % 5 == 0) {
		// System.out.println();
		// }
		// }
		//
		// int aa=0,min=a[0],max=a[0];
		// for (int i = 0; i < a.length; i++) {
		// if (a[i]>max) {
		// max=a[i];
		// }
		// if (a[i]<min) {
		// min=a[i];
		// }
		// if (a[i]>=60) {
		// aa++;
		// }
		// }
		// System.out.println("最大的数是："+max);
		// System.out.println("最小的数是："+min);
		// System.out.println(">=60的数有："+aa+" 个");

		// 3.数组逆序操作：定义长度为10的数组，将数组元素对调，并输出对调前后的结果。
		// 思路：把0索引和arr.length-1的元素交换，把1索引和arr.length-2的元素交换…..
		// 只要交换到arr.length/2的时候即可。
		// int[] a = randomArray(100, 10);
		// for (int i = 0; i < a.length; i++) {
		// System.out.print(a[i] + " ");
		// }
		//
		// for (int i = 0, j = a.length - 1; i < a.length / 2; i++, j--) {
		// int temp;
		// temp = a[i];
		// a[i] = a[j];
		// a[j] = temp;
		// }
		// System.out.println();
		// System.out.println("===========================");
		// for (int i : a) {
		// System.out.print(i+" ");
		// }

		// 4.合并数组操作：现有如下一个数组：   
		// int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5}   
		// 要求将以上数组中值为0的项去掉，将不为0的值存入一个新的数组，
		// 生成的新数组为： int newArr [] ={1,3,4,5,6,6,5,4,7,6,7,5}  
		// 思路： 确定出不为0的个数，这样可以开辟新数组；从旧的数组之中，
		// 取出内容，并将其赋给新开辟的数组。
		// int[] oldArr={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		// int a=0;
		// for (int i = 0; i < oldArr.length; i++) {
		// if (oldArr[i]==0) {
		// a++;
		// }
		// }
		//
		// int[] newArr=new int[oldArr.length-a];
		//
		// for (int i = 0; i < oldArr.length; i++) {
		// for (int j = 0; j < oldArr.length-1; j++) {
		// if (oldArr[j]==0) {
		// int temp;
		// temp=oldArr[j];
		// oldArr[j]=oldArr[j+1];
		// oldArr[j+1]=temp;
		// }
		// }
		// }
		//
		// for (int i = 0; i < newArr.length; i++) {
		// newArr[i]=oldArr[i];
		// }
		//
		// for (int i : newArr) {
		// System.out.print(i+" ");
		// }

		// 5.二分法查找操作：使用二分法查找有序数组中元素。找到返回索引，不存在输出-1。
		// 分析：二分法查找的前提是数组有序。
		// 假如有一组数为3，12，24，36，55，68，75，88要查给定的值24.
		// 可设三个变量front，mid，end分别指向数据的上界，中间和下界，
		// mid=（front+end）/2.
		// 1)开始令front=0（指向3），end=7（指向88），则mid=3（指向36）。
		// 因为mid>x，故应在前半段中查找。
		// 2)令新的end=mid-1=2，而front=0不变，则新的mid=1。
		// 此时x>mid，故确定应在后半段中查找。
		// 3)令新的front=mid+1=2，而end=2不变，则新mid=2，
		// 此时a[mid]=x，查找成功。
		// 4)如要查找的数不是数列中的数，例如x=25，当第三次判断时，
		// x>a[mid]，按以上规律，令front=mid+1，即front=3，
		// 出现front>end的情况，表示查找不成功。

		// 6.二维数组遍历求和操作：用二重循环求出二维数组b所有元素的和：
		// int[][] b={{11},{21,22},{31,32,33}}

		// 1.生成一百个随机数，放入数组，然后排序输出。
		// int[] a=new int[100];
		// for (int i = 0; i < a.length; i++) {
		// a[i]=(int)(Math.random()*100);
		// }
		//
		// for (int i : a) {
		// System.out.print(i+" ");
		// }
		// System.out.println();
		// for (int i = 0; i < a.length; i++) {
		// for (int j = 0; j < a.length-1; j++) {
		// if (a[j]>a[j+1]) {
		// int temp;
		// temp=a[j];
		// a[j]=a[j+1];
		// a[j+1]=temp;
		// }
		// }
		// }
		//
		// for (int i : a) {
		// System.out.print(i+" ");
		// }

		// 2.题目：输入某年某月某日，判断这一天是这一年的第几天？
		// 分析：以3月5日为例，先把前两个月的加起来，然后再加上5天即本年第几天，特殊情况，
		// 闰年且输入月份大于3需考虑多加一天。可定义数组存储1-12月各月天数。

		// 3.使用二分法查找有序数组中元素。找到返回索引，不存在输出-1。使用递归实现

		// 4. 数组A：1，7，9，11，13，15，17，19；数组b：2，4，6，8，10   
		// 两个数组合并为数组c，按升序排列。 要求：使用Arrays类的方法快速实现。

		// int[] arr1= {1,7,9,11,13,15,17,19};
		// int[] arr2= {2,4,6,8,10};
		//
		// int[] arr3=new int[arr1.length+arr2.length];
		//
		// for (int i = 0,j=0; i < arr3.length; i++) {
		// if (i<arr1.length) {
		// arr3[i]=arr1[i];
		// }else {
		// arr3[i]=arr2[j];
		// j++;
		// }
		// }
		//
		// Arrays.sort(arr3);
		//
		// for (int i : arr3) {
		// System.out.print(i+" ");
		// }
	}

	public static int aaa(int a, int[] b) {
		int num = 0;
		for (int i = 0; i < b.length; i++) {
			if (a == b[i]) {
				num++;
			}
		}
		return num;
	}

	// 编写函数得到0到n之间的随机数，n是参数。
	public static int[] randomArray(int n, int b) {
		int[] a = new int[b];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * n);
		}
		return a;
	}
}
