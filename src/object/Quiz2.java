package object;

public class Quiz2 {
	public static void main(String[] args) {
		Student1 stu = new Student1("또치",120000);
		Taxi1 taxi = new Taxi1(7777);
		
		stu.takeTaxi(taxi);
		stu.showInfo();
		taxi.showInfo();
	}
}

class Taxi1 {
	public int taxiNum;
	public int money;
	
	public Taxi1(int taxiNum) {
		this.taxiNum = taxiNum; 
	}

	public void take(int money) {
		this.money = this.money + money;
	}
	
	public void showInfo() {
		System.out.println("택시 " + taxiNum + "번 기사님의 수입은 " + money + "입니다.");
	}

}

class Student1 {
	public String stuName;
	public int money;
	
	

	public Student1(String stuName, int money) {
		super();
		this.stuName = stuName;
		this.money = money;
	}



	public void takeTaxi(Taxi1 taxi) {
		if (this.money > 10000) {
			taxi.take(10000);
			this.money = this.money - 10000;
		} else {
			System.out.println("돈이 모자라 택시를 탈 수 없습니다.");
		}

	}
	
	public void showInfo() {
		System.out.println(stuName + "님의 남은 돈은 " + money + "입니다.");
	}
}
