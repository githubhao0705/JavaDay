package homeWork6;

public class HomeWork6_12 {
	public static void main(String[] args) {
		printChars('a', 'Z', 10);
	}
	
	public static void printChars(char ch1,char ch2,int numberPerLine) {
		if (ch1>ch2) {
			char temp=0;
			temp=ch1;
			ch1=ch2;
			ch2=temp;
		}
		for (int i = ch1,j=1; i <= ch2; i++,j++) {
			System.out.print((char)i+" ");
			if (j%numberPerLine==0) {
				System.out.println();
			}
		}
	}
}
