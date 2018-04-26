package mon;

public class Monster {
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

	private String name;
	private int hp;
	private int ap;

	public Monster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Monster(String name, int hp, int ap) {
		super();
		this.name = name;
		this.hp = hp;
		this.ap = ap;
	}

	public void attack() {
		System.out.println("怪物" + this.getName() + "开始攻击");
		System.out.println("当前的生命值是：" + this.getHp());
		System.out.println("攻击力是：" + this.getAp());
	}

	public void moveType() {
		System.out.print("我是");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAp() {
		return ap;
	}

	public void setAp(int ap) {
		this.ap = ap;
	}
}
