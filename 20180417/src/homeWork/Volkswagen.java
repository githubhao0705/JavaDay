package homeWork;

public class Volkswagen extends Car {
	private String spontaneousCombustion;

	public Volkswagen() {

	}

	public Volkswagen(String brand, String model, String color, String topSpeed, String transmission, String music,
			String spontaneousCombustion) {
		super(brand, model, color, topSpeed, transmission, music);
		this.spontaneousCombustion = spontaneousCombustion;
	}

	public String getSpontaneousCombustion() {
		return spontaneousCombustion;
	}

	public void setSpontaneousCombustion(String spontaneousCombustion) {
		this.spontaneousCombustion = spontaneousCombustion;
	}

}
