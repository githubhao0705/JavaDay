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
		System.out.println("С��1000�������У�" + flag + "��");
	}

	public static boolean isPrime(int number) {
		boolean flag = true;
		if (number < 2) { // ������С��2
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) { // ���ܱ���������˵����������������false
					flag = false;
					break; // ����ѭ��
				}
			}
		}
		return flag;
	}
}
