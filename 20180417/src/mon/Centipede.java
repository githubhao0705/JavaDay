package mon;

public class Centipede extends Monster{
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
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		super.attack();
		moveType();
	}
	
	@Override
	public void moveType() {
		// TODO Auto-generated method stub
		super.moveType();
		System.out.println("��򼾫���������");
	}

	public Centipede() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Centipede(String name, int hp, int ap) {
		super(name, hp, ap);
		// TODO Auto-generated constructor stub
	}
	
}
