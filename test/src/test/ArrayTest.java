package test;

public class ArrayTest {
	// 增删改查 自动扩容
	public static void main(String[] args) {
		Object[] arrayStr = new String[] { "a", "b", "c" };
		for (Object string : arrayStr) {
			System.out.print(string + " ");
		}
		System.out.println();

		arrayStr = add(arrayStr, 598);

		for (Object string : arrayStr) {
			System.out.print(string + " ");
		}
		System.out.println();

		System.out.println(search(arrayStr, 9));

		arrayStr = change(arrayStr, 6966, 2);

		for (Object string : arrayStr) {
			System.out.print(string + " ");
		}
		System.out.println();

		arrayStr = delete(arrayStr, 6966);

		for (Object object : arrayStr) {
			System.out.print(object + " ");

		}

	}

	public static Object[] add(Object[] arrayStr, Object str) {
		arrayStr = expand(arrayStr);
		for (int j = 0; j < arrayStr.length; j++) {
			if (arrayStr[j] == null) {
				arrayStr[j] = str;
				break;
			}
		}
		return arrayStr;
	}

	public static Object[] delete(Object[] arrayStr, Object str) {
		int flag = -1;

		for (int i = 0; i < arrayStr.length; i++) {
			if (str.equals(arrayStr[i])) {
				flag = i;
			}
		}

		for (int i = flag; i < arrayStr.length - 1; i++) {
			arrayStr[i] = arrayStr[i + 1];
		}
		arrayStr[arrayStr.length - 1] = null;
		
		return arrayStr;
	}

	public static Object[] change(Object[] arrayStr, Object str, int index) {
		if (index > 0 && index < arrayStr.length - 1) {
			arrayStr[index] = str;
		}
		return arrayStr;
	}

	public static int search(Object[] arrayStr, Object str) {
		// 遍历数组，当符合则返回对应元素的下标，没有该元素则返回-1；
		for (int i = 0; i < arrayStr.length; i++) {
			if (str.equals(arrayStr[i])) {
				return i;
			}
		}
		return -1;
	}

	public static Object[] expand(Object[] arrayStr) {
		Object[] newArrayStr = new Object[arrayStr.length * 2];
		if (arrayStr[arrayStr.length - 1] != null) {
			for (int i = 0; i < arrayStr.length; i++) {
				newArrayStr[i] = arrayStr[i];
			}
			return newArrayStr;
		}
		return arrayStr;
	}
}
