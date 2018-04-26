package homeWork;

public class Tesla extends Car {
	private String autoPilot;

	public Tesla() {
		
	}

	public Tesla(String brand, String model, String color, String topSpeed, String transmission, String music,
			String autoPilot) {
		super(brand, model, color, topSpeed, transmission, music);
		this.autoPilot = autoPilot;
	}

	public String getAutoPilot() {
		return autoPilot;
	}

	public void setAutoPilot(String autoPilot) {
		this.autoPilot = autoPilot;
	}

}
