package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TestLinkedList {
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();

		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(1);
		arrayList.add(0, 10);
		arrayList.add(3, 30);

		System.out.println("���integer������array list����ʾ���£�");
		System.out.println(arrayList);

		LinkedList<Object> linkedList = new LinkedList<>(arrayList);
		linkedList.add(1, "red"); // ���±�1��������Ԫ�أ�red
		linkedList.removeLast(); // �Ƴ�ĩλԪ��
		linkedList.addFirst("green"); // ����λ����Ԫ�أ�green
		System.out.println("�������linked list����ʾ���£�");
		ListIterator<Object> listIterator = linkedList.listIterator();
		while (listIterator.hasNext()) {
			// hasNext ����Ƿ�����һ��Ԫ�أ�����booleanֵ��
			System.out.print(listIterator.next() + " "); // next ���ص�ǰԪ��
		}
		System.out.println();

		System.out.println("�������linked list����ʾ���£�");
		listIterator = linkedList.listIterator(linkedList.size());
		while (listIterator.hasPrevious()) {
			System.out.print(listIterator.previous() + " ");
		}
	}
}
