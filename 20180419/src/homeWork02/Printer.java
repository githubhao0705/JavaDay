package homeWork02;

public class Printer implements Paper, LnkCartridge {

	@Override
	public void printColor() {
		System.out.println("����ӡ�����Դ�ӡ"+LnkCartridge.color1+"��"+LnkCartridge.color2);
	}

	@Override
	public void paperSizes() {
		System.out.println("����ӡ������ʹ��"+Paper.paperSize1+"��"+Paper.paperSize2+"ֽ������");
	}
}
