package test;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<FamilyCar> cars = new ArrayList<FamilyCar>();

		cars.add(new FamilyCar("宝马", "捷键", "black", 2, 500, "无"));
		cars.add(new FamilyCar("宝马1", "捷键1", "black1", 21, 5001, "无1"));
		cars.add(new FamilyCar("宝马2", "捷键2", "black2", 22, 5002, "无2"));
		cars.add(new FamilyCar("宝马3", "捷键3", "black3", 23, 5003, "无3"));

		for (FamilyCar familyCar : cars) {
			System.out.println(familyCar);
		}

		ListIterator<FamilyCar> carsList = cars.listIterator();

		if (carsList.nextIndex() == 1) {
			carsList.remove();
		}
		
		System.out.println(cars);
	}
}
