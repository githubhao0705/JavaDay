package homeWork02;

public class Test {
	public static void main(String[] args) {
		Paper paper=new Printer();
		LnkCartridge lnkCartridge=new Printer();
		
		paper.paperSizes();
		
		lnkCartridge.printColor();
	}
}
