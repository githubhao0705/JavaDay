package HomeWork;

public class FamilyCar extends Car {
	private String model; // ÐÍºÅ

	@Override
	public double rent(int day) {
		if (model.equals("550i")) {
			return 600 * day;
		}
		return 800 * day;
	}

	public FamilyCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FamilyCar(String brand, String LicensePlate, String model) {
		super(brand, LicensePlate);
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
