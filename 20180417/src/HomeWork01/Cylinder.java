package HomeWork01;

public class Cylinder extends Circle{
	// 2�� ��дһ��Բ������Cylinder��
	// ���̳��������Circle�ࡣ��ӵ�У�
	// 1)һ����Ա������double hight ��˽�У������ͣ�;
	// Բ����ĸߣ�
	// 2)���췽��
	// //����Cylinder����ʱ���뾶��ʼ��Ϊr,�߶ȳ�ʼ��Ϊh
	// Cylinder��double r,double h��
	// 3)��Ա����
	// double getVolume���� //��ȡԲ��������
	// void showVolume���� //��Բ���������������Ļ
	
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
