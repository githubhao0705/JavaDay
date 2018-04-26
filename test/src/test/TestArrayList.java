package test;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<FamilyCar> cars = new ArrayList<FamilyCar>();

		cars.add(new FamilyCar("����", "�ݼ�", "black", 2, 500, "��"));
		cars.add(new FamilyCar("����1", "�ݼ�1", "black1", 21, 5001, "��1"));
		cars.add(new FamilyCar("����2", "�ݼ�2", "black2", 22, 5002, "��2"));
		cars.add(new FamilyCar("����3", "�ݼ�3", "black3", 23, 5003, "��3"));

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
