package object;

public class Ex01 {
	public static void main(String[] args) {

		Student student = new Student("둘리", 5000);
		Student student1 = new Student("도우너", 10000);
		Student student2 = new Student("또치", 1000);
		Bus bus = new Bus(100);
		Subway sub = new Subway("2호선");
		Taxi taxi = new Taxi(7777);

		student.takeBus(bus);
		student.showInfo();
		bus.showInfo();

		student1.takeSubway(sub);
		student1.showInfo();
		sub.showInfo();

		student2.takeTaxi(taxi);
		student2.showInfo();

	}
}

//버스
class Bus {
	int busNumber;
	int passengerCount; // 승객수
	int money; // 수입

	// 생성자
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	// 버스에 승객을 태우는 메소드
	public void take(int money) {// 버스요금
		this.money = this.money + money; // 버스 수입 증가
		passengerCount++; // 승객수 1명 추가
	}

	public void showInfo() {
		System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
	}
}

//전철
class Subway {
	String lineNumber;
	int passengerCount;
	int money;

	// 생성자
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	// 전철에 승객을 태우는 메소드
	public void take(int money) {
		this.money = this.money + money;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println("지하철 " + lineNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
	}
}

//택시
class Taxi {
	private int taxiNo;
	private int money;

	// 생성자
	public Taxi(int taxiNo) {
		this.taxiNo = taxiNo;
	}

	// 택시에 승객을 태우는 메소드
	public void take(int money) {
		this.money = this.money + money;
	}

	public void showInfo() {
		System.out.println("택시 " + taxiNo + "번 기사님의 수입은 " + money + "입니다.");
	}
}

//학생
class Student {
	String studentName;
	int money; // 소지금

	// 생성자
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}

	// 버스에 타서 요금 1000원을 지불하는 메소드
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money = this.money - 1000;
	}

	// 지하철에 타서 요금 1500원을 지불하는 메소드
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money = this.money - 1500;
	}

	// 택시에 타서 10000원을 지불, 학생이 10000원을 가지고 있지 않을시에는 택시에 탈 수 없다.
	public void takeTaxi(Taxi taxi) {
		if (this.money > 10000) {
			taxi.take(10000);
			this.money = this.money - 10000;
		} else {
			System.out.println("돈이 모자라 택시를 탈 수 없습니다.");
		}

	}

	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}

}
