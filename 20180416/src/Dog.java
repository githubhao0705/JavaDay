import java.util.Scanner;

public class Dog {
	// 1.使用面向对象的思想，编写自定义描述狗的信息。
	// 设定属性包括：品种，年龄，心情，名字；方法包括：叫，跑。
	// 要求：
	// 1)设置属性的私有访问权限，通过公有的get,set方法实现对属性的访问
	// 2)限定心情只能有“心情好”和“心情不好”两种情况，
	// 如果无效输入进行提示，默认设置“心情好”。
	// 3)设置构造函数实现对属性赋值
	// 4)叫和跑的方法，需要根据心情好坏，描述不同的行为方式。
	// 5)编写测试类，测试狗类的对象及相关方法（测试数据信息自定义）
	Scanner input = new Scanner(System.in);

	private String name;
	private int age;
	private String breed;
	private String mood;

	public Dog() {
		name = "拉希";
		age = 1;
		breed = "哈士奇";
		mood = "心情好";
	}

	public Dog(String name) {
		this.name = name;
	}

	public Dog(String name, int age) {
		this(name);
		this.age = age;
	}

	public Dog(String name, int age, String breed) {
		this(name, age);
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getBreed() {
		return breed;
	}

	public String getMood() {
		return mood;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void setMood() {
		System.out.println("1、好心情 2、坏心情\n请输入数字选择：");
		int flg = input.nextInt();
		if (flg == 1) {
			this.mood = "好心情";
		} else if (flg == 2) {
			this.mood = "坏心情";
		} else {
			System.out.println("输入错误，默认设置成：好心情");
			this.mood = "好心情";
		}
	}

	// 4)叫和跑的方法，需要根据心情好坏，描述不同的行为方式。
	public void run() {
		if (this.mood.equals("好心情")) {
			System.out.println("这条"+this.age+"岁的名字叫"+this.name+"的"+this.breed+"心情很好，它非常高兴地和主人玩起了接飞盘的游戏！");
		} else {
			System.out.println("这条"+this.age+"岁的名字叫"+this.name+"的"+this.breed+"心情很糟糕，它一动不动地卧在地上，即使主人叫它，也没有反应。");
		}
	}

	public void shout() {
		if (this.mood.equals("好心情")) {
			System.out.println("这条"+this.age+"岁的名字叫"+this.name+"的"+this.breed+"心情很好，它正在兴奋地朝一只树上乱窜的松鼠汪汪大叫！");
		} else {
			System.out.println("这条"+this.age+"岁的名字叫"+this.name+"的"+this.breed+"心情很糟糕，它靠着它的主人，发出低沉的呜呜声，似乎伤心透了。");
		}
	}
}
