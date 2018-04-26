package homeWork;

public class Car {
	private String brand;
	private String model;
	private String color;
	private String topSpeed;
	private String transmission;
	private String music;

	public Car() {

	}

	public Car(String brand, String model, String color, String topSpeed, String transmission, String music) {
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.topSpeed = topSpeed;
		this.transmission = transmission;
		this.music = music;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(String topSpeed) {
		this.topSpeed = topSpeed;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getMusic() {
		return music;
	}

	public void setMusic(String music) {
		this.music = music;
	}
}
