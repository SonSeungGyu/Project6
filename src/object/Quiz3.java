package object;

/*
	손님이 카페에서 커피를 사는 과정
	
	10000원을 가진 둘리는 4000울 주고 별다방에서 아메리카노를 사먹음
	20000원을 가진 또치는 4500울 주고 별다방에서 라떼를 사먹음
	만약 소지금이 커피가격보다 작다면 커피를 주문 할 수없음
*/

public class Quiz3 {

	public static void main(String[] args) {
		Cafe cafe = new Cafe("별다방"); //별다방 cafe 객체를 생성
		Customer cus = new Customer("둘리", 10000); //둘리 손님 객체 생성
		Customer cus1 = new Customer("또치", 3000); //또치 손님 객체 생성
		cus.ameBuy(cafe);//둘리가 별다방에서 아메를 삼
		cus.showInfo();
		cus1.latteBuy(cafe);//또치가 별다방에서 라떼를 삼
		cus1.showInfo();
		cafe.showInfo();
	}
}


//카페
class Cafe {
	String cafeName;
	int money;
	//생성자
	public Cafe(String cafeName) {
		this.cafeName = cafeName;
	}
	
	//아메를 팔았을 때
	public void sellAme(int money) {
		this.money = this.money + money;
	}
	
	//라떼를 팔았을 때
	public void sellLatte(int money) {
		this.money = this.money + money;
	}

	public void showInfo() {
		System.out.println("카페 이름 : " + cafeName);
		System.out.println("카페 매출 : " + money);
	}

}

//손님
class Customer {
	String name;
	int money;
	//생성자
	public Customer(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	
	//아메리카노를 마신다 돈이 없으면 사마실수 없음.
	public void ameBuy(Cafe cafe) {//변수를 Cafe 타입으로 받아 Cafe클래스를 이용할 수 있도록 하기 위해 Cafe타입을 변수로 받는다.
		if (money < 4000) {
			System.out.println("돈이 모자라 커피를 살 수 없습니다.");
		} else {
			cafe.sellAme(4000);
			this.money = this.money - 4000;
		}
	}

	//라떼를 마신다 돈이 없으면 사마실수 없음.
	public void latteBuy(Cafe cafe) {//변수를 Cafe 타입으로 받아 Cafe클래스를 이용할 수 있도록 하기 위해 Cafe타입을 변수로 받는다.
		if (money < 4500) {
			System.out.println("돈이 모자라 커피를 살 수 없습니다.");
		} else {
			cafe.sellLatte(4500);
			this.money = this.money - 4500;
		}
	}

	public void showInfo() {
		System.out.println("손님 이름 : " + name);
		System.out.println("손님의 남은돈 : " + money);
	}
}
