package constructor;

public class PerconTest {

	public static void main(String[] args) {
		
		//=>디폴트 생성자로 클래스를 생성한 후 인스턴스 변수 값을 따로초기화
		Person personLee = new Person();
		
		
		
		//=>인스턴스 변수 초기화와 동시에 클래스 생성
		Person personKim = new Person("김연아",160,45);
		
	}

}
