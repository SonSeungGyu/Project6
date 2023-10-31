package scope;

public class A {
	
	public int field1;//어디에서든 접근 가능
	int field2;//같은 패키지 내부에서 접근 가능
	private int field3; //현 클래스 내부에서만 접근 가능
}
