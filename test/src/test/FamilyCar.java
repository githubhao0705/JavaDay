package test;

public class FamilyCar extends Car {

	@Override
	public double rent() {
		// TODO Auto-generated method stub
		return 0;
	}

	public FamilyCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FamilyCar(String brand, String licensePlate, String color, int serviceLife, int rentForDay,
			String loadCapacity) {
		super(brand, licensePlate, color, serviceLife, rentForDay, loadCapacity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setLoadCapacity(String loadCapacity) {
		// TODO Auto-generated method stub
		super.setLoadCapacity("нч");
	}

	@Override
	public String toString() {
		return getBrand() + "\t" + getLicensePlate() + "\t" + getColor() + "\t" + getserviceLife() + "\t"
				+ getRentForDay() + "\t" + getServiceLife() + "\t" + getLoadCapacity();
	}

}
