package homeWorkForPizza;

import java.util.Scanner;

public class BaconPizza extends Pizza {
	private int bacons;

	public BaconPizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BaconPizza(int size, double price, String name, int bacons) {
		super(size, price, name);
		this.bacons = bacons;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("���������" + this.getBacons());
	}

	public int getBacons() {
		return bacons;
	}

	public void setBacons(int bacons) {
		this.bacons = bacons;
	}

	@Override
	public void makePizza(Pizza pizza) {
		Scanner input = new Scanner(System.in);
		System.out.println("���������������");
		System.out.println("������������С��");
		System.out.println("�����������۸�");
	}

}
