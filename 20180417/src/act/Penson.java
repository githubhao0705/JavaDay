package act;

public class Penson {
	// 1.������������˼�룬����Զ�����������Ա���˶�Ա����Ϣ
	// �趨
	// 1)��Ա��:
	// ���԰��������������䣬�Ա𣬱�ҵԺУ��������
	// �������������ҽ���
	// 2)�˶�Ա�ࣺ
	// ���԰��������������䣬�Ա��˶���Ŀ����ʷ��óɼ�
	// �������������ҽ�ʼ
	// Ҫ��
	// 3)������Ա���˶�Ա�Ĺ�����Ա����ȡ�����ࡪ����
	// 4)���ü̳л��ƣ�ʵ����Ա����˶�Ա��
	// 5)��д�����࣬�ֱ�������࣬��Ա����˶�Ա�������ط���
	// 6)������Ϊact�İ������࣬��Ա�࣬�˶�Ա��Ͳ�����

	private String name;
	private int age;
	private String gender;
	
	public void selfIntroduction() {
		System.out.println("��Һã�����"+name+"\n����"+age);
	}
	
	public Penson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Penson(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return gender;
	}

	public void setSex(String gender) {
		this.gender = gender;
	}

}
