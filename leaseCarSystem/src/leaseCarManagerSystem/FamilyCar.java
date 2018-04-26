package leaseCarManagerSystem;

public class FamilyCar extends Car {
	// 家用车类
	public FamilyCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FamilyCar(String brand, String licensePlate, String color, int serviceLife, int rentForDay,
			String loadCapacity) {
		super(brand, licensePlate, color, serviceLife, rentForDay, loadCapacity);
		// TODO Auto-generated constructor stub
	}

	// 家用车类载重量缺省值为“无”。
	@Override
	public void setLoadCapacity(String loadCapacity) {
		// TODO Auto-generated method stub
		super.setLoadCapacity("无");
	}
}
