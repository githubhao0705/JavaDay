package HomeWork01;

public class Cylinder extends Circle{
	// 2） 编写一个圆柱体类Cylinder，
	// 它继承于上面的Circle类。还拥有：
	// 1)一个成员变量，double hight （私有，浮点型）;
	// 圆柱体的高；
	// 2)构造方法
	// //创建Cylinder对象时将半径初始化为r,高度初始化为h
	// Cylinder（double r,double h）
	// 3)成员方法
	// double getVolume（） //获取圆柱体的体积
	// void showVolume（） //将圆柱体的体积输出到屏幕
	
	private double hight;

	public Cylinder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cylinder(double r,double h) {
		super(r);
		this.hight=h;
		// TODO Auto-generated constructor stub
	}
	
	public double getVolume() {
		return getArea()*hight;
	}
	
	public void showVolume() {
		System.out.println(getVolume());
	}
	
	
}
