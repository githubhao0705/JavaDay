package car;

public class Car {
	// 1)���⳵��:
	// ���԰��������ͣ����ƣ��������⹫˾������������������ֹͣ
	// 2)���ýγ��ࣺ
	// ���԰��������ͣ����ƣ���������������������������ֹͣ
	// Ҫ��
	// 1)�������⳵�ͼ��ýγ��Ĺ�����Ա����ȡ�����ࡪ������
	// 2)���ü̳л��ƣ�ʵ�ֳ��⳵��ͼ��ýγ���
	// 3)��д�����࣬�ֱ���������࣬���⳵��ͼ��ýγ���������ط���
	// 4)������Ϊcar�İ���������࣬���⳵�࣬���ýγ���Ͳ�����
	// ����Ч��
	private String brand; // Ʒ��
	private String vin; // ���� vehicle identification number (VIN)

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String brand, String vin) {
		this.brand = brand;
		this.vin = vin;
	}

	public void start() {
		System.out.println("���ǳ���������");
	}

	public void stop() {
		System.out.println("���ǳ�����ֹͣ");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}
}
