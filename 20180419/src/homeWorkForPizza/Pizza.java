package homeWorkForPizza;

public abstract class Pizza {
	// 1.��д����ʵ�ֱ�������������˵����д���򣬽����û��������Ϣ��
	// ѡ����Ҫ�����ı������ɹ�ѡ��ı����У���������ͺ��ʱ�����
	// ʵ��˼·���ؼ�����
	// 1)������������ͺ��ʱ���
	// 2)���������
	// 3)���ԣ����ơ��۸񡢴�С
	// 4)������չʾ
	// 5)������������ͺ��ʱ����̳��Ա�����
	// 6)������������࣬����������Ϣ��������ı�������
	private int size;
	private double price;
	private String name;

	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pizza(int size, double price, String name) {
		super();
		this.size = size;
		this.price = price;
		this.name = name;
	}

	public  void show() {
		System.out.println("���ƣ�"+this.getName());
		System.out.println("�۸�"+this.getPrice());
		System.out.println("��С��"+this.getSize());
	}
	
	public abstract void makePizza(Pizza pizza);

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
