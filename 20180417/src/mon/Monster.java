package mon;

public class Monster {
	// 1)�߹���:
	// ���԰������������֣�����ֵ��������
	// �����������������ƶ��������ƶ�������Ѫ��������ֵ<10ʱ�����Բ���20����ֵ��
	// 2)��򼾫�ࣺ
	// ���԰������������֣�����ֵ��������
	// �����������������ƶ��������ƶ���
	// Ҫ��
	// 1)�����߹ֺ���򼾫�Ĺ�����Ա����ȡ�����ࡪ������
	// 2)���ü̳л��ƣ�ʵ���߹������򼾫��
	// 3)������������������״̬�����ݰ����������֣�����ֵ��������
	// 4)��д�����࣬�ֱ�����߹ֺ���򼾫�Ķ�����ط���
	// 5)������Ϊmon�İ�������࣬�߹��࣬��򼾫��Ͳ�����

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
		System.out.println("����" + this.getName() + "��ʼ����");
		System.out.println("��ǰ������ֵ�ǣ�" + this.getHp());
		System.out.println("�������ǣ�" + this.getAp());
	}

	public void moveType() {
		System.out.print("����");
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
