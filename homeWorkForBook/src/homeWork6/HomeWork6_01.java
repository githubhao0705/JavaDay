package homeWork6;

public class HomeWork6_01 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.print(pentagonalNumber(i)+"\t");
			if (i%10==0) {
				System.out.println();
			}
		}
	}
	
	public static int pentagonalNumber(int n) {
		return n*(3*n-1)/2;
	}
}
