package sub4;

public class Person {

	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void work() {
		System.out.println("Person is Working");
	}
	
	public void introduce() {
		System.out.println("제 이름은 : " +  name+ "이고 " +age +"세 입니다." );
	}
	
}
