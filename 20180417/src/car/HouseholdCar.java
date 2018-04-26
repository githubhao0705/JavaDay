package car;

public class HouseholdCar extends Car {
	// 1)出租车类:
	// 属性包括：车型，车牌，所属出租公司；方法包括：启动，停止
	// 2)家用轿车类：
	// 属性包括：车型，车牌，车主姓名；方法包括：启动，停止
	// 要求
	// 1)分析出租车和家用轿车的公共成员，提取出父类—汽车类
	// 2)利用继承机制，实现出租车类和家用轿车类
	// 3)编写测试类，分别测试汽车类，出租车类和家用轿车类对象的相关方法
	// 4)定义名为car的包存放汽车类，出租车类，家用轿车类和测试类
	// 运行效果
	private String carOwners;
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
	}
}
