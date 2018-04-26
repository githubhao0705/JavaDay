package testOnWeb;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("Dog eats");
	}

	@Override
	public void travel() {
		System.out.println("Dog travels");
	}

	public static void main(String[] args) {
		Animal d=new Dog();
		d.eat();
	}

}
