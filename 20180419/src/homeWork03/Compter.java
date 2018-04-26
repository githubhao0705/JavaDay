package homeWork03;

public class Compter {
	private InterfaceForUSB usb;
	
	public void useUSB() {
		usb.aa();
	}

	public InterfaceForUSB getUsb() {
		return usb;
	}

	public void setUsb(InterfaceForUSB usb) {
		this.usb = usb;
	}
	
}
