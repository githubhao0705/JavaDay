package leaseCarManagerSystem;

public class FamilyCar extends Car {
	// ���ó���
	public FamilyCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FamilyCar(String brand, String licensePlate, String color, int serviceLife, int rentForDay,
			String loadCapacity) {
		super(brand, licensePlate, color, serviceLife, rentForDay, loadCapacity);
		// TODO Auto-generated constructor stub
	}

	// ���ó���������ȱʡֵΪ���ޡ���
	@Override
	public void setLoadCapacity(String loadCapacity) {
		// TODO Auto-generated method stub
		super.setLoadCapacity("��");
	}
}
