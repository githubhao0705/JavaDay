package homeWorkForPizza;

public class SeafoodPizza extends Pizza {
	private String ingredients;

	public SeafoodPizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SeafoodPizza(int size, double price, String name, String ingredients) {
		super(size, price, name);
		this.ingredients = ingredients;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("≈‰¡œ£∫"+this.getName()+this.getIngredients());
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public void makePizza(Pizza pizza) {
		// TODO Auto-generated method stub
		
	}

}
