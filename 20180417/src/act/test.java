package act;

public class test {
	public static void main(String[] args) {
		Actors a1=new Actors("仗义", 27, "男", "北京电影学院", "寄往天国的家书");
		Athletes a2=new Athletes("刘翔", 23, "男", "200米短跑", "22秒30");
		
		a1.selfIntroduction();
		a2.selfIntroduction();
	}
}
