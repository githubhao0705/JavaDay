package homeWork6;

public class HomeWork6_03 {
	public static void main(String[] args) {
		reverse(1234);
	}

	public static void reverse(int number) {
		int[] arrnum=new int[10];
		int flg = 0;
//		while (number > 0) {
//			int temp = 0;
//			int i = 0;
//			temp = number % 10;
//			number /= 10;
//			newnum[i] = temp;
//			i++;
//			flg = i;
//		}
		
		for (int i = 0; number>0; i++,number/=10) {
			int temp = 0;
			temp = number % 10;
			int[] newnum = new int[i+1];
			newnum[i] = temp;
			flg = i;
		}
		
//		int num = 0;
//		int a = flg;
//		for (int i = 0; i < flg; i++) {
//			int temp = 0;
//			int j;
//			temp = ((int) (Math.pow(10, a))) * newnum[i];
//			num += temp;
//		}
//		return num;
	}

	public static boolean isPalindrome() {
		return false;
	}
}
