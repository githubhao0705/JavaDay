package testPhoneCharge;

public class phone {
	battery myPhoneBattery;
	String brands;
	String dimensions;
	String weight;
	boolean on = false;

	public void turnOn() {
		on = true;
	}

	public void turnOff() {
		on = false;
	}

	public void starChargeing() throws InterruptedException {

		for (int i = myPhoneBattery.batteryPower; i <= 100;i++) {
			System.out.println("当前电量为：" + i + "%");
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
