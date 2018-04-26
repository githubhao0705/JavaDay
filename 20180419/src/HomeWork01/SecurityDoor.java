package HomeWork01;

public class SecurityDoor extends Door implements Lock{

	@Override
	public void open() {
		System.out.println("开门");
		
	}

	@Override
	public void close() {
		System.out.println("关门");
		
	}

	@Override
	public void lock() {
		System.out.println("已锁好");
		
	}

	@Override
	public void unlock() {
		System.out.println("已解锁");
		
	}

}
