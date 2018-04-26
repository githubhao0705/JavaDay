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

		System.out.println("多个integer对象在array list内显示如下：");
		System.out.println(arrayList);

		LinkedList<Object> linkedList = new LinkedList<>(arrayList);
		linkedList.add(1, "red"); // 在下标1处，插入元素：red
		linkedList.removeLast(); // 移除末位元素
		linkedList.addFirst("green"); // 在首位插入元素：green
		System.out.println("正序输出linked list，显示如下：");
		ListIterator<Object> listIterator = linkedList.listIterator();
		while (listIterator.hasNext()) {
			// hasNext 检查是否还有下一个元素，返回boolean值，
			System.out.print(listIterator.next() + " "); // next 返回当前元素
		}
		System.out.println();

		System.out.println("反序输出linked list，显示如下：");
		listIterator = linkedList.listIterator(linkedList.size());
		while (listIterator.hasPrevious()) {
			System.out.print(listIterator.previous() + " ");
		}
	}
}
