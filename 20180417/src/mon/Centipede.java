package mon;

public class Centipede extends Monster{
	// 1)蛇怪类:
	// 属性包括：怪物名字，生命值，攻击力
	// 方法包括：攻击，移动（曲线移动），补血（当生命值<10时，可以补加20生命值）
	// 2)蜈蚣精类：
	// 属性包括：怪物名字，生命值，攻击力
	// 方法包括：攻击，移动（飞行移动）
	// 要求
	// 1)分析蛇怪和蜈蚣精的公共成员，提取出父类—怪物类
	// 2)利用继承机制，实现蛇怪类和蜈蚣精类
	// 3)攻击方法，描述攻击状态。内容包括怪物名字，生命值，攻击力
	// 4)编写测试类，分别测试蛇怪和蜈蚣精的对象及相关方法
	// 5)定义名为mon的包存怪物类，蛇怪类，蜈蚣精类和测试类
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		super.attack();
		moveType();
	}
	
	@Override
	public void moveType() {
		// TODO Auto-generated method stub
		super.moveType();
		System.out.println("蜈蚣精，御风飞行");
	}

	public Centipede() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Centipede(String name, int hp, int ap) {
		super(name, hp, ap);
		// TODO Auto-generated constructor stub
	}
	
}
