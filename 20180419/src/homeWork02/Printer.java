package homeWork02;

public class Printer implements Paper, LnkCartridge {

	@Override
	public void printColor() {
		System.out.println("本打印机可以打印"+LnkCartridge.color1+"与"+LnkCartridge.color2);
	}

	@Override
	public void paperSizes() {
		System.out.println("本打印机可以使用"+Paper.paperSize1+"与"+Paper.paperSize2+"纸张类型");
	}
}
