package mon;

public class test {
	public static void main(String[] args) {
		Snake s1=new Snake("������", 5, 20);
		Centipede c1=new Centipede("�����",60,15);
		
		s1.attack();
		System.out.println("===========================");
		c1.attack();
	}
}
