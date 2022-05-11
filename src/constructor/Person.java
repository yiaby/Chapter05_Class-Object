package constructor;

public class Person {
	private String name;
	private float height;
	private double weight;
	
	
	//생성자 오버로드=>필요에 따라 매개변수가 다른 생성자를 여러 개 만들 수 있음
	
	public Person() {} //=>자바 컴파일러가 자동으로 제공하는 디폴트 생성자
	
	public Person(String pname) {//=>이름을 매개변수 로 입력받는 새성자
		name = pname;
	}
	
	public Person(String pname, float pheight, float pweight) { //=>이름, 키 , 몸무게를 매개변수로 입력 받는 생성자
		name = pname;
		height = pheight;
		weight = pweight;
	}
	
}
