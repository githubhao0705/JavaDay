package HomeWork;

public abstract class Car {
	private String brand; // Ʒ��
	private String LicensePlate; // ���ƺ���

	public Car() {
		super();
	}

	public Car(String brand, String LicensePlate) {
		super();
		this.brand = brand;
		this.LicensePlate = LicensePlate;
	}

	public abstract double rent(int day);

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return LicensePlate;
	}

	public void setModel(String LicensePlate) {
		this.LicensePlate = LicensePlate;
	}
}
