package leaseCarManagerSystem;

import java.util.ArrayList;
import java.util.ListIterator;

public class LeaseCarsGuy {
	// ���޷���
	private ArrayList<Car> leaseCar = new ArrayList<Car>(); // �����޳�������
	private String Name; // ����
	private long timeOfStart; // ��������Чʱ�� ��СʱΪ��λ��¼
	private long timeOfEnd; // �����ڽ���ʱ�� ��СʱΪ��λ��¼

	public void showLeaseCars() {
		// �������޷������޳�������
		System.out.println("===========�����޳����б�===========");
		System.out.println("���\t����\t��ɫ\tʹ��ʱ��\t�����\t��������");
		ListIterator<Car> leaseCars = leaseCar.listIterator();
		while (leaseCars.hasNext()) {
			System.out.println(leaseCars.nextIndex() + 1 + "\t" + leaseCars.next());
		}
	}

	public LeaseCarsGuy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LeaseCarsGuy(String name) {
		super();
		Name = name;
	}

	public LeaseCarsGuy(Car car, String name) {
		super();
		this.leaseCar.add(car);
		Name = name;
	}

	public LeaseCarsGuy(Car car, String name, long timeOfStart) {
		super();
		this.leaseCar.add(car);
		Name = name;
		this.timeOfStart = timeOfStart;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public long getTimeOfStart() {
		return timeOfStart;
	}

	public long getTimeOfEnd() {
		return timeOfEnd;
	}

	public void setTimeOfEnd(long timeOfEnd) {
		this.timeOfEnd = timeOfEnd;
	}

	public ArrayList<Car> getLeaseCar() {
		return leaseCar;
	}

	@Override
	public String toString() {
		return "LeaseCarsGuy [leaseCar=" + leaseCar + ", Name=" + Name + ", timeOfStart=" + timeOfStart + ", timeOfEnd="
				+ timeOfEnd + "]";
	}
	
	

}
