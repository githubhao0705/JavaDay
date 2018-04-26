import java.util.Scanner;

public class Dog {
	// 1.ʹ����������˼�룬��д�Զ�������������Ϣ��
	// �趨���԰�����Ʒ�֣����䣬���飬���֣������������У��ܡ�
	// Ҫ��
	// 1)�������Ե�˽�з���Ȩ�ޣ�ͨ�����е�get,set����ʵ�ֶ����Եķ���
	// 2)�޶�����ֻ���С�����á��͡����鲻�á����������
	// �����Ч���������ʾ��Ĭ�����á�����á���
	// 3)���ù��캯��ʵ�ֶ����Ը�ֵ
	// 4)�к��ܵķ�������Ҫ��������û���������ͬ����Ϊ��ʽ��
	// 5)��д�����࣬���Թ���Ķ�����ط���������������Ϣ�Զ��壩
	Scanner input = new Scanner(System.in);

	private String name;
	private int age;
	private String breed;
	private String mood;

	public Dog() {
		name = "��ϣ";
		age = 1;
		breed = "��ʿ��";
		mood = "�����";
	}

	public Dog(String name) {
		this.name = name;
	}

	public Dog(String name, int age) {
		this(name);
		this.age = age;
	}

	public Dog(String name, int age, String breed) {
		this(name, age);
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getBreed() {
		return breed;
	}

	public String getMood() {
		return mood;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void setMood() {
		System.out.println("1�������� 2��������\n����������ѡ��");
		int flg = input.nextInt();
		if (flg == 1) {
			this.mood = "������";
		} else if (flg == 2) {
			this.mood = "������";
		} else {
			System.out.println("�������Ĭ�����óɣ�������");
			this.mood = "������";
		}
	}

	// 4)�к��ܵķ�������Ҫ��������û���������ͬ����Ϊ��ʽ��
	public void run() {
		if (this.mood.equals("������")) {
			System.out.println("����"+this.age+"������ֽ�"+this.name+"��"+this.breed+"����ܺã����ǳ����˵غ����������˽ӷ��̵���Ϸ��");
		} else {
			System.out.println("����"+this.age+"������ֽ�"+this.name+"��"+this.breed+"�������⣬��һ�����������ڵ��ϣ���ʹ���˽�����Ҳû�з�Ӧ��");
		}
	}

	public void shout() {
		if (this.mood.equals("������")) {
			System.out.println("����"+this.age+"������ֽ�"+this.name+"��"+this.breed+"����ܺã��������˷ܵس�һֻ�����Ҵܵ�����������У�");
		} else {
			System.out.println("����"+this.age+"������ֽ�"+this.name+"��"+this.breed+"�������⣬�������������ˣ������ͳ������������ƺ�����͸�ˡ�");
		}
	}
}
