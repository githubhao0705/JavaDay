package leaseCarManagerSystem;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class SystemUI {
	static Scanner input = new Scanner(System.in);
	static ArrayList<Car> garage = new ArrayList<Car>();
	static ArrayList<LeaseCarsGuy> guy = new ArrayList<LeaseCarsGuy>();

	public static void UI() {
		// 主界面
		System.out.println("欢迎使用尚学堂汽车租赁系统");
		System.out.println("===========================================");
		System.out.println("1、租车\t2、还车\t3、新车入库\t4、退出");
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
			System.out.println("输入错误，请重新输入！");
			UI();
			break;
		}
	}

	public static void leaseCar() {
		// 租车

		// 当无可租赁车辆时提醒租赁方
		if (garage.size() == 0) {
			System.out.println("很抱歉，当前无可租赁车辆。");
			return;
		}
		// 打印可租赁车辆集合
		showGarages();
		System.out.println("请输入租赁车辆编号：");
		int flag = 0;
		flag = checkInputIsInt(flag);
		System.out.println("请输入租赁方姓名：");
		// 以租赁方姓名、所租赁的车辆编号、租赁开始时间为实参的构造方法，将租赁方添加到租赁方集合中
		// 实际用
		// guy.add(new LeaseCarsGuy(garage.get(flag - 1), input.next(),
		// System.currentTimeMillis() / 1000 / 60 / 60));
		// 测试用，暂时把租赁开始时间设置为0
		guy.add(new LeaseCarsGuy(garage.get(flag - 1), input.next(), 0));
		// 从可租赁车辆集合中删除已租赁车辆
		garage.remove(flag - 1);
		// 打印可租赁车辆集合
		showGarages();
	}

	public static void returnedCar() {
		// 还车

		// 声明租赁方集合的迭代器
		ListIterator<LeaseCarsGuy> listGuy = guy.listIterator();
		// 声明还车的租赁方
		LeaseCarsGuy guy1 = new LeaseCarsGuy();
		System.out.println("请输入租赁方姓名：");
		String name = input.next();
		// 将符合输入姓名的租赁方经过迭代器赋值给还车的租赁方
		while (listGuy.hasNext()) {
			LeaseCarsGuy temp = listGuy.next();
			if (name.equals(temp.getName())) {
				guy1 = temp;
				break;
			}
		}
		// 打印还车的租赁方已租赁车辆集合
		guy1.showLeaseCars();
		System.out.println("请输入所需解除租赁车辆的编号：");
		int flag = 0;
		// 排除输入除int类型之外的类型
		checkInputIsInt(flag);
		// 现实用
		// guy1.setTimeOfEnd(System.currentTimeMillis() / 1000 / 60 / 60);
		// 测试用，暂时把租赁结束时间设置为5000小时后
		guy1.setTimeOfEnd(500);
		// 根据租赁的开始时间与结束时间，计算出天数和小时数
		long day = (guy1.getTimeOfEnd() - guy1.getTimeOfStart()) / 24;
		long hour = (guy1.getTimeOfEnd() - guy1.getTimeOfStart()) % 24;
		System.out.println("该车租赁时间为（以小时为单位，超过十二小时按一天收费）：" + day + "天" + hour + "小时");
		// 声明租金
		double rent;
		// 当超过十二小时按一天收费
		// 从已租赁车辆集合获取对应下标车辆的日租金，与天数相乘
		if (hour > 12) {
			rent = guy1.getLeaseCar().get(flag - 1).getRentForDay() * (day + 1);
		}
		rent = guy1.getLeaseCar().get(flag - 1).getRentForDay() * day;
		// 当还车的租赁方归还的车辆类型为Truck（卡车）时，应再把租金与载重量相乘
		if (guy1.getLeaseCar().get(flag - 1) instanceof Truck) {
			rent *= Integer.parseInt(guy1.getLeaseCar().get(flag - 1).getLoadCapacity());
		}
		System.out.println("应付租金：" + rent);
		// 根据输入编号，从已租赁车辆集合中删除对应车辆
		guy1.getLeaseCar().remove(flag - 1);
		// 打印还车的租赁方已租赁车辆集合
		guy1.showLeaseCars();
	}

	public static void addCar() {
		// 添加新车
		System.out.println("请选择入库车型（1、轿车\t2、卡车）：");
		int flag = input.nextInt();
		String licensePlate, brand, color;
		int serviceLife, rentForDay;
		switch (flag) {
		case 1:
			System.out.println("请输入车牌号：");
			licensePlate = input.next(); // 车牌号码
			System.out.println("请输入车型：");
			brand = input.next(); // 车型
			System.out.println("请输入车的颜色:");
			color = input.next(); // 颜色
			System.out.println("请输入使用年限:");
			serviceLife = input.nextInt(); // 使用年限
			System.out.println("请输入日租金:");
			rentForDay = input.nextInt(); // 日租金
			garage.add(new FamilyCar(brand, licensePlate, color, serviceLife, rentForDay, "无"));
			System.out.println("新车入库成功！");
			showGarages();
			break;
		case 2:
			System.out.println("请输入车牌号:");
			licensePlate = input.next(); // 车牌号码
			System.out.println("请输入车型:");
			brand = input.next(); // 车型
			System.out.println("请输入车的颜色:");
			color = input.next(); // 颜色
			System.out.println("请输入使用年限:");
			serviceLife = input.nextInt(); // 使用年限
			System.out.println("请输入日租金:");
			rentForDay = input.nextInt(); // 日租金
			System.out.println("请输入载重量:");
			String loadCapacity = input.next();
			garage.add(new Truck(brand, licensePlate, color, serviceLife, rentForDay, loadCapacity));
			System.out.println("新车入库成功！");
			showGarages();
			break;
		default:
			System.out.println("输入有误，请重新输入！");
			break;
		}
	}

	public static void systemExit() {
		// 退出系统
		System.out.println("系统已安全退出");
	}

	public static void showGarages() {
		// 返回可租赁车辆集合
		System.out.println("===========可租赁车辆列表===========");
		System.out.println("编号\t车名\t颜色\t使用时间\t日租金\t卡车载重");
		ListIterator<Car> garages = garage.listIterator();
		while (garages.hasNext()) {
			System.out.println(garages.nextIndex() + 1 + "\t" + garages.next());
		}
	}

	public static int checkInputIsInt(int flag) {
		if (input.hasNextInt()) {
			flag = input.nextInt();
		} else {
			String str = input.next(); // 必须要声明String类型接收
			System.out.println("输入错误，请重新输入！string");
		}
		return flag;
	}
}
