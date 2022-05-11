package classpart;

public class P138_function_alone {

	public static void main(String[] args) {
		
		int num1 = 100;
		int num2 = 25;
		
		int result = addition(num1, num2);
				System.out.println(result);
		    
			result = subtraction(num1, num2);
		    	System.out.println(result);
		    
		    result = multiplication(num1, num2);
		    	System.out.println(result);
		
		 double value = division(num1, num2);
				System.out.println(value);
		
		
		}
	    public static int addition(int n1, int n2) {
	    	 int add = n1 + n2;
	    	return add;
	    }
	    public static int subtraction(int n1, int n2) {
	   	 int sub = n1 - n2;
	   	return sub;
	   }
	    public static int multiplication(int n1, int n2) {
	   	 int multi = n1 * n2;
	   	return multi;
	   }
	    public static int division(int n1, int n2) {
	   	 int div = n1 / n2;
	   	return div;
	   }
}
