package testForObject;

public class testCreateObject {
	public static void main(String[] args) {
		student s1= new student();
		
		teacher t1=new teacher();
		
		s1.name="cloud";
		s1.age=26;
		s1.add="New York";
		s1.sex="boy";
		s1.telePhone=945875300;
		 
		t1.add="Coronado";
		t1.age=42;
		t1.subject="Golang";
		t1.telePhone=22355601;
		t1.name="Kenny";
		
		t1.sayHello();
		s1.sayHello();
	}
	
}
