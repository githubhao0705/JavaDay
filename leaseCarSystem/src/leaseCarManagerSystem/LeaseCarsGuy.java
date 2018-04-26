package leaseCarManagerSystem;

import java.util.ArrayList;
import java.util.ListIterator;

public class LeaseCarsGuy {
	// 租赁方类
	private ArrayList<Car> leaseCar = new ArrayList<Car>(); // 已租赁车辆集合
	private String Name; // 姓名
	private long timeOfStart; // 租赁期生效时间 以小时为单位记录
	private long timeOfEnd; // 租赁期结束时间 以小时为单位记录

	public void showLeaseCars() {
		// 返回租赁方已租赁车辆集合
		System.out.println("===========已租赁车辆列表===========");
		System.out.println("编号\t车名\t颜色\t使用时间\t日租金\t卡车载重");
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
