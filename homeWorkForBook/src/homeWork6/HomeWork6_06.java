package homeWork6;

public class HomeWork6_06 {
	public static void main(String[] args) {
		displayPattern(6);
	}

	public static void displayPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int k = n; k > i; k--) {
				System.out.print("  "); //这是输出前面空白的代码
			}
			for (int j = i; j > 0; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
