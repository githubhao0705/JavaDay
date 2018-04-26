public class testForPostIncrementAndPreIncrement {
	public static void main(String[] args) {
		int a=1,b;
		b=a++;
		//按照靠近原则，首先把a赋值给b，这时，b为1，然后a再自加，最终a为2；
		System.out.println(a);
		System.out.println(b);
		//我猜最后结果，a=2，b=1；经过实验，的确靠近原则是ok的。
		System.out.println("==================");
		int c=1,d;
		d=++c;
		//按照靠近原则，首先c自加，这时c为2，然后再把值赋给d，d此时为2，最终c的也为2；
		System.out.println(c);
		System.out.println(d);
		//我猜最后结果，c=2，d=2；经过实验，的确靠近原则是ok的。
	}
}
