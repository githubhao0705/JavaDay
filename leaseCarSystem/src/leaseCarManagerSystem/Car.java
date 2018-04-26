package leaseCarManagerSystem;

public abstract class Car {
	private String brand; // Ʒ��
	private String licensePlate; // ���ƺ���
	private String color; // ��ɫ
	private int serviceLife; // ʹ������
	private int rentForDay; // �����
	private String loadCapacity; // ������

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String brand, String licensePlate, String color, int serviceLife, int rentForDay) {
		super();
		this.brand = brand;
		this.licensePlate = licensePlate;
		this.color = color;
		this.serviceLife = serviceLife;
		this.rentForDay = rentForDay;
	}

	public Car(String brand, String licensePlate, String color, int serviceLife, int rentForDay, String loadCapacity) {
		super();
		this.brand = brand;
		this.licensePlate = licensePlate;
		this.color = color;
		this.serviceLife = serviceLife;
		this.rentForDay = rentForDay;
		this.loadCapacity = loadCapacity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getserviceLife() {
		return serviceLife;
	}

	public void setserviceLife(int serviceLife) {
		this.serviceLife = serviceLife;
	}

	public int getRentForDay() {
		return rentForDay;
	}

	public void setRentForDay(int rentForDay) {
		this.rentForDay = rentForDay;
	}

	public int getServiceLife() {
		return serviceLife;
	}

	public void setServiceLife(int serviceLife) {
		this.serviceLife = serviceLife;
	}

	public String getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(String loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	@Override
	public String toString() {
		return brand + "\t" + color + "\t" + serviceLife + "\t" + rentForDay + "\t" + loadCapacity;
	}

}
