package staticEx;

/*
	static 변수나 메소드는 객체를 생성하지 않고 바로 클래스명을 통해 호출 가능 (Ex: 클래스명.static변수(메소드) )
*/

public class Ex03 {
	public static void main(String[] args) {
		System.out.println(10 * 10 * Calculator.pi);
		System.out.println(Calculator.plus(10,5));
		System.out.println(Calculator.minus(10,5));
		
	}
}

class Calculator{
	
	static double pi = 3.14159; //원의 둘레를 구하는 파이값
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}
