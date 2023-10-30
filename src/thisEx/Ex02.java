package thisEx;

public class Ex02 {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("둘리");
		System.out.println(person);
		person.printThis();
		
	}
}

class Person{
	String name;
	
	public void setName(String name) {
		this.name = name;  //멤버변수 = 지역변수
	}
	
	public void printThis() {
		System.out.println(this);
	}
}
