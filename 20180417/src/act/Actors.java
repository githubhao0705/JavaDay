package act;

public class Actors extends Penson{
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
	
	private String graduated;
	private String representativeMovie;
	
	public Actors(String name, int age, String gender, String graduated, String representativeMovie) {
		super(name, age, gender);
		this.graduated = graduated;
		this.representativeMovie = representativeMovie;
	}

	@Override
	public void selfIntroduction() {
		// TODO Auto-generated method stub
		super.selfIntroduction();
		System.out.println("�ұ�ҵ�ڣ�"+graduated+"\n�������У���"+representativeMovie+"��");
	}
}
