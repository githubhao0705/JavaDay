package HomeWork01;

public class SecurityDoor extends Door implements Lock{

	@Override
	public void open() {
		System.out.println("����");
		
	}

	@Override
	public void close() {
		System.out.println("����");
		
	}

	@Override
	public void lock() {
		System.out.println("������");
		
	}

	@Override
	public void unlock() {
		System.out.println("�ѽ���");
		
	}

}
