package staticEx;

public class Ex02 {
	public static void main(String[] args) {
		Student2 stu = new Student2();
		stu.studentName = "둘리";
		System.out.println(Student2.getCount());

		Student2 stu1 = new Student2();
		stu1.studentName = "도우너";
		System.out.println(Student2.getCount());
	}
}


class Student2{
	private static int count = 0; //private변수는 클래스 내에서만 이용 가능.
	int studentId;
	String studentName;
	
	public Student2() {
		count++;
		studentId = count;
	}

	public static int getCount() {//static 변수를 사용하는 메소드는 static으로 선언해야함.
		return count;
	}

	public static void setCount(int count) {//static 변수를 사용하는 메소드는 static으로 선언해야함.
		Student2.count = count; //보통은 this키워드를 이용하지만 static 변수는 클래스명을 주면 된다.
								//static 메소드 내부에서 인스턴스변수를 선언하면 에러가 발생.
								//static 변수는 선언하자 마자 메모리에 올라감. 인스턴스 변수는 인스턴스가 생성되어야 이용이 가능(힙 메모리에 올라오는 시점과 static 메모리에
								//static 변수가 올라가는 시점도 맞지 않을뿐더러 같은 메모리 공간을 이용하지 않음.
	}
	
}