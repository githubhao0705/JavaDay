package homeWork6;

public class HomeWork6_06 {
	public static void main(String[] args) {
		displayPattern(6);
	}

	public static void displayPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int k = n; k > i; k--) {
				System.out.print("  "); //�������ǰ��հ׵Ĵ���
			}
			for (int j = i; j > 0; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
