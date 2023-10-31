package scope;

public class Quiz3 {
	public static void main(String[] args) {
		Person person = new Person();//  main 메소드 내부

		int i = 10; //  main 메소드 내부

		if (i > 1) {
			String str = "안녕하세요";// if 문 안에서만 사용
		}

		for (int k = 0; k < 10; k++) { // for문 안에서만 사용
			System.out.println();
		}
		System.out.println(person);
	}

}
