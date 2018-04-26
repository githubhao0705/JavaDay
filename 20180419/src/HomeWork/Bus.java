package HomeWork;

public class Bus extends Car {
	private int numberOfCarSeats; // ³µ×ùÊı

	@Override
	public double rent(int day) {
		if (numberOfCarSeats <= 16) {
			return 900 * day;
		}
		return 1500 * day;
	}

	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bus(String brand, String model, int numberOfCarSeats) {
		super(brand, model);
		this.numberOfCarSeats = numberOfCarSeats;
	}

	public int getNumberOfCarSeats() {
		return numberOfCarSeats;
	}

	public void setNumberOfCarSeats(int numberOfCarSeats) {
		this.numberOfCarSeats = numberOfCarSeats;
	}

}
