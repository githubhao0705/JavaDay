package HomeWork01;

public class Circle {
	// ��1����дһ��Բ��Circle������ӵ�У�
	// 1)һ����Ա������radius��˽�У������ͣ�;//���Բ�İ뾶��
	// 2)�������췽��
	// Circle���� //���뾶��Ϊ0
	// Circle��double r �� //����Circle����ʱ���뾶��ʼ��Ϊr
	// 3)������Ա����
	// double getArea���� //��ȡԲ�����
	// double getPerimeter���� //��ȡԲ���ܳ�
	// void show���� //��Բ�Ĺؾ����ܳ�������������Ļ
	// ��2�� ��дһ��Բ������Cylinder��
	// ���̳��������Circle�ࡣ��ӵ�У�
	// 1)һ����Ա������double hight ��˽�У������ͣ�;
	// Բ����ĸߣ�
	// 2)���췽��
	// //����Cylinder����ʱ���뾶��ʼ��Ϊr,�߶ȳ�ʼ��Ϊh
	// Cylinder��double r,double h��
	// 3)��Ա����
	// double getVolume���� //��ȡԲ��������
	// void showVolume���� //��Բ���������������Ļ

	private double radius;

	public Circle() {
		this.radius = 0;
		// TODO Auto-generated constructor stub
	}

	public Circle(double r) {
		this.radius = r;
	}

	public double getArea() {
		return Math.pow(radius, 2) * Math.PI;
	}

	public double getPerimeter() {
		return radius * 2 * Math.PI;
	}

	public void show() {
		System.out.println(
				"Circle [radius=" + radius + ", getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter() + "]");
	}

}
