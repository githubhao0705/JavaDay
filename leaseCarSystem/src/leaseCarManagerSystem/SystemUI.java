package leaseCarManagerSystem;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class SystemUI {
	static Scanner input = new Scanner(System.in);
	static ArrayList<Car> garage = new ArrayList<Car>();
	static ArrayList<LeaseCarsGuy> guy = new ArrayList<LeaseCarsGuy>();

	public static void UI() {
		// ������
		System.out.println("��ӭʹ����ѧ����������ϵͳ");
		System.out.println("===========================================");
		System.out.println("1���⳵\t2������\t3���³����\t4���˳�");
		int flag = 0;
		switch (checkInputIsInt(flag)) {
		case 1:
			leaseCar();
			UI();
			break;
		case 2:
			returnedCar();
			UI();
			break;
		case 3:
			addCar();
			UI();
			break;
		case 4:
			systemExit();
			break;
		default:
			System.out.println("����������������룡");
			UI();
			break;
		}
	}

	public static void leaseCar() {
		// �⳵

		// ���޿����޳���ʱ�������޷�
		if (garage.size() == 0) {
			System.out.println("�ܱ�Ǹ����ǰ�޿����޳�����");
			return;
		}
		// ��ӡ�����޳�������
		showGarages();
		System.out.println("���������޳�����ţ�");
		int flag = 0;
		flag = checkInputIsInt(flag);
		System.out.println("���������޷�������");
		// �����޷������������޵ĳ�����š����޿�ʼʱ��Ϊʵ�εĹ��췽���������޷���ӵ����޷�������
		// ʵ����
		// guy.add(new LeaseCarsGuy(garage.get(flag - 1), input.next(),
		// System.currentTimeMillis() / 1000 / 60 / 60));
		// �����ã���ʱ�����޿�ʼʱ������Ϊ0
		guy.add(new LeaseCarsGuy(garage.get(flag - 1), input.next(), 0));
		// �ӿ����޳���������ɾ�������޳���
		garage.remove(flag - 1);
		// ��ӡ�����޳�������
		showGarages();
	}

	public static void returnedCar() {
		// ����

		// �������޷����ϵĵ�����
		ListIterator<LeaseCarsGuy> listGuy = guy.listIterator();
		// �������������޷�
		LeaseCarsGuy guy1 = new LeaseCarsGuy();
		System.out.println("���������޷�������");
		String name = input.next();
		// �������������������޷�������������ֵ�����������޷�
		while (listGuy.hasNext()) {
			LeaseCarsGuy temp = listGuy.next();
			if (name.equals(temp.getName())) {
				guy1 = temp;
				break;
			}
		}
		// ��ӡ���������޷������޳�������
		guy1.showLeaseCars();
		System.out.println("���������������޳����ı�ţ�");
		int flag = 0;
		// �ų������int����֮�������
		checkInputIsInt(flag);
		// ��ʵ��
		// guy1.setTimeOfEnd(System.currentTimeMillis() / 1000 / 60 / 60);
		// �����ã���ʱ�����޽���ʱ������Ϊ5000Сʱ��
		guy1.setTimeOfEnd(500);
		// �������޵Ŀ�ʼʱ�������ʱ�䣬�����������Сʱ��
		long day = (guy1.getTimeOfEnd() - guy1.getTimeOfStart()) / 24;
		long hour = (guy1.getTimeOfEnd() - guy1.getTimeOfStart()) % 24;
		System.out.println("�ó�����ʱ��Ϊ����СʱΪ��λ������ʮ��Сʱ��һ���շѣ���" + day + "��" + hour + "Сʱ");
		// �������
		double rent;
		// ������ʮ��Сʱ��һ���շ�
		// �������޳������ϻ�ȡ��Ӧ�±공������������������
		if (hour > 12) {
			rent = guy1.getLeaseCar().get(flag - 1).getRentForDay() * (day + 1);
		}
		rent = guy1.getLeaseCar().get(flag - 1).getRentForDay() * day;
		// �����������޷��黹�ĳ�������ΪTruck��������ʱ��Ӧ�ٰ���������������
		if (guy1.getLeaseCar().get(flag - 1) instanceof Truck) {
			rent *= Integer.parseInt(guy1.getLeaseCar().get(flag - 1).getLoadCapacity());
		}
		System.out.println("Ӧ�����" + rent);
		// ���������ţ��������޳���������ɾ����Ӧ����
		guy1.getLeaseCar().remove(flag - 1);
		// ��ӡ���������޷������޳�������
		guy1.showLeaseCars();
	}

	public static void addCar() {
		// ����³�
		System.out.println("��ѡ����⳵�ͣ�1���γ�\t2����������");
		int flag = input.nextInt();
		String licensePlate, brand, color;
		int serviceLife, rentForDay;
		switch (flag) {
		case 1:
			System.out.println("�����복�ƺţ�");
			licensePlate = input.next(); // ���ƺ���
			System.out.println("�����복�ͣ�");
			brand = input.next(); // ����
			System.out.println("�����복����ɫ:");
			color = input.next(); // ��ɫ
			System.out.println("������ʹ������:");
			serviceLife = input.nextInt(); // ʹ������
			System.out.println("�����������:");
			rentForDay = input.nextInt(); // �����
			garage.add(new FamilyCar(brand, licensePlate, color, serviceLife, rentForDay, "��"));
			System.out.println("�³����ɹ���");
			showGarages();
			break;
		case 2:
			System.out.println("�����복�ƺ�:");
			licensePlate = input.next(); // ���ƺ���
			System.out.println("�����복��:");
			brand = input.next(); // ����
			System.out.println("�����복����ɫ:");
			color = input.next(); // ��ɫ
			System.out.println("������ʹ������:");
			serviceLife = input.nextInt(); // ʹ������
			System.out.println("�����������:");
			rentForDay = input.nextInt(); // �����
			System.out.println("������������:");
			String loadCapacity = input.next();
			garage.add(new Truck(brand, licensePlate, color, serviceLife, rentForDay, loadCapacity));
			System.out.println("�³����ɹ���");
			showGarages();
			break;
		default:
			System.out.println("�����������������룡");
			break;
		}
	}

	public static void systemExit() {
		// �˳�ϵͳ
		System.out.println("ϵͳ�Ѱ�ȫ�˳�");
	}

	public static void showGarages() {
		// ���ؿ����޳�������
		System.out.println("===========�����޳����б�===========");
		System.out.println("���\t����\t��ɫ\tʹ��ʱ��\t�����\t��������");
		ListIterator<Car> garages = garage.listIterator();
		while (garages.hasNext()) {
			System.out.println(garages.nextIndex() + 1 + "\t" + garages.next());
		}
	}

	public static int checkInputIsInt(int flag) {
		if (input.hasNextInt()) {
			flag = input.nextInt();
		} else {
			String str = input.next(); // ����Ҫ����String���ͽ���
			System.out.println("����������������룡string");
		}
		return flag;
	}
}
