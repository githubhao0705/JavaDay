package homeWork00;

import java.util.ArrayList;
import java.util.ListIterator;

public class HomeWork00 {
	// ����ϰ��
	// ����һ��Dog�࣬�����ǳƣ����ܶ��������ԣ�
	// ���������࣬�����������
	// ����˵����
	// �Ѷ��Dog����Ϣ��ӵ�������
	// �鿴Dog������������Dog����Ϣ
	// ɾ�������в���Dog��Ԫ��
	// �жϼ������Ƿ����ָ��Dog
	public static void main(String[] args) {
		ArrayList<Dog> list = new ArrayList<>();
		list.add(new Dog("������", 0));
		list.add(new Dog("zhttty", 30));
		list.add(new Dog("smith", 320));
		list.add(new Dog("stormy", 310));

		ListIterator<Dog> listIteratorForDog = list.listIterator();
		while (listIteratorForDog.hasNext()) {
			System.out.print(listIteratorForDog.next());
		}
		list.remove(new Dog("������", 58));
		
		System.out.print(list);
	}
}
