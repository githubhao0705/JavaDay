package homeWork03;

public class Test {
	public static void main(String[] args) {
		Compter c=new Compter();
		Fan f=new Fan();
		Mouse m =new Mouse();
		c.setUsb(f);
		
		
		c.useUSB();
		c.setUsb(m);
		c.useUSB();
	}
}
