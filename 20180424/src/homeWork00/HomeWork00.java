package homeWork00;

import java.util.ArrayList;
import java.util.ListIterator;

public class HomeWork00 {
	// 课堂习题
	// 创建一个Dog类，包含昵称，亲密度两上属性，
	// 创建测试类，完成以下任务
	// 需求说明：
	// 把多个Dog的信息添加到集合中
	// 查看Dog的数量及所有Dog的信息
	// 删除集合中部分Dog的元素
	// 判断集合中是否包含指定Dog
	public static void main(String[] args) {
		ArrayList<Dog> list = new ArrayList<>();
		list.add(new Dog("龙傲天", 0));
		list.add(new Dog("zhttty", 30));
		list.add(new Dog("smith", 320));
		list.add(new Dog("stormy", 310));

		ListIterator<Dog> listIteratorForDog = list.listIterator();
		while (listIteratorForDog.hasNext()) {
			System.out.print(listIteratorForDog.next());
		}
		list.remove(new Dog("龙傲天", 58));
		
		System.out.print(list);
	}
}
