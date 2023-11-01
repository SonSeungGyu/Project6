package scope;

class Person {
	//인스턴스 변수
	String personName;//인스턴스 생성 시 사용 가능
	int personAge;
	
	//클래스 변수
	static char gender = 'f';//인스턴스를 생성하지 않아도 사용 가능  
	
	//지역 변수
	public void setPersonName(String name) {
		this.personName = name;// 현 메소드에서 사용
	}
	
	public void setPersonAge(int age) {
		this.personAge = age;//현 메소드에서 사용
	}
}
