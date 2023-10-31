package staticEx;

/*
	static 변수 사용하기
*/

public class Ex01 {//위치에 상관없이 어디에서든 이용 가능, public 접근제어자가 붙어 있는 클래스의 이름은 파일명과 같아야 함.
	public static void main(String[] args) {
		Student stu = new Student();
		stu.studentName = "둘리";
		System.out.println(stu.studentName + " 학번 : " + stu.studentId);

		Student stu1 = new Student();
		stu1.studentName = "또치";
		System.out.println(stu1.studentName + " 학번 : " + stu1.studentId);
		
		System.out.println(Student.count);//static 변수는 해당 변수의 클래스로 호출이 가능.(객체가 없어도 사용 가능)
		//System.out.println(stu.count);//동일한 값을 저장하고있음.
		//System.out.println(stu1.count);//동일한 값을 저장하고있음.
		
	}
}

class Student {//defualt는 패키지가 같을 때 사용가능
	static int count = 0;//공통 속성
	int studentId; //인스턴스 변수는 보통 초기화를 하지 않음
	String studentName;//인스턴스 변수는 보통 초기화를 하지 않음
	
	//생성자
	public Student() {
		count++; //학생이 생성될 때마다 증가
		studentId = count; //증가된 값을 학번에 부여
	}
}
