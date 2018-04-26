package homeWork00;

public class Dog {
	// ����ϰ��
	// ����һ��Dog�࣬�����ǳƣ����ܶ��������ԣ�
	// ���������࣬�����������
	// ����˵����
	// �Ѷ��Dog����Ϣ��ӵ�������
	// �鿴Dog������������Dog����Ϣ
	// ɾ�������в���Dog��Ԫ��
	// �жϼ������Ƿ����ָ��Dog
	private String name;
	private int love;

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, int love) {
		super();
		this.name = name;
		this.love = love;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "�ǳƣ�" + name + "\t���ܶȣ�" + love + "\n";
	}
}
