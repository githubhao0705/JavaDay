
public class SingletonPattern {
	String id;
	String passWord;

	static SingletonPattern sp = null;

	public static SingletonPattern backSP() {
		if (sp == null) {
			sp = new SingletonPattern();
		}
		return sp;
	}
}
