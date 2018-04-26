package homeWork6;

public class HomeWork6_20 {
	public static void main(String[] args) {
		String string="jdjdaj226d5da69q5s1d2z6a6d5a6";
		
		System.out.println(countLetters(string));
	}
	
	public static int countLetters(String s) {
		int flag=0;
		
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				flag++;
			}
		}
		return flag;
	}
}
