package act;

public class Athletes extends Penson{
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
	private String goodAtSports;
	private String bestResult;
	
	public Athletes(String name, int age, String gender, String goodAtSports, String bestResult) {
		super(name, age, gender);
		this.goodAtSports = goodAtSports;
		this.bestResult = bestResult;
	}

	@Override
	public void selfIntroduction() {
		// TODO Auto-generated method stub
		super.selfIntroduction();
		System.out.println("���ó����˶���Ŀ�ǣ�"+goodAtSports+"\n��ʷ��óɼ��ǣ�"+bestResult);

	}
}
