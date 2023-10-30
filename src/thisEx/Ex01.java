package thisEx;




public class Ex01 {
	public static void main(String[] args) {
		BirthDay birth = new BirthDay();
		birth.setYear(2000);
		System.out.println(birth);
		birth.printThis();
		
	}
}

class BirthDay{
	int year;
	
	public void setYear(int year) {
		this.year = year; //변수의 이름이 같을때 this로 구분할 수 있음.
	}
	
	public void printThis() {
		System.out.println(this);
	}
}
