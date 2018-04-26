package HomeWork;

public class Customer {
	private String name; // ¹Ë¿ÍÃû

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double calculateRent(Car[] cars,int day) {
		double money=0;
		for (int i = 0; i < cars.length; i++) {
			Car car=cars[i];
			money+=car.rent(day);
		}
		return money;
	}
}
