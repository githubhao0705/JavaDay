package mon;

public class Snake extends Monster{
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
	
	public Snake() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Snake(String name, int hp, int ap) {
		super(name, hp, ap);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		super.attack();
		restoreHP();
		moveType();
	}
	

	@Override
	public void moveType() {
		// TODO Auto-generated method stub
		super.moveType();
		System.out.println("�߹֣�����S��·��");
	}
	
	public void restoreHP() {
		if (getHp()<10) {
			setHp(getHp()+20);
			System.out.println("ʵʩ���߲�Ѫ������ǰ����ֵ��"+this.getHp());
		}
	}
}
