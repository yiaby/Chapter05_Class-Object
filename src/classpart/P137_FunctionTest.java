package classpart;

public class P137_FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);	//add()함수 호출
		System.out.println(num1 +  " + " + num2 + " = " + sum + "입니다");
		//[출력]:10 + 20 = 30입니다
	}

	public static int add(int n1, int n2) {
		int result = n1 +n2;					//add() 함수 
			return result; //결과 값 반환
	}
}
