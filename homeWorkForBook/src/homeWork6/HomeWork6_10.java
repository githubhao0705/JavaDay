package homeWork6;

public class HomeWork6_10 {
	public static void main(String[] args) {
		int flag = 0;

		int i = 0;
		while (i < 10000) {
			if (isPrime(i)) {
				flag++;
			}
			i++;
		}
		System.out.println("小于1000的素数有：" + flag + "个");
	}

	public static boolean isPrime(int number) {
		boolean flag = true;
		if (number < 2) { // 素数不小于2
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) { // 若能被整除，则说明不是素数，返回false
					flag = false;
					break; // 跳出循环
				}
			}
		}
		return flag;
	}
}
