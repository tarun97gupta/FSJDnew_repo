
public class CalculatorClass {

	public static void main(String[] args) {
		
		Calculator c1=new Calculator();
		System.out.println(c1.sum(1, 2));
		System.out.println(c1.multiply(3,2));
		

	}
	
	

}
class Calculator{
	
	int sum(int num1,int num2) {
		int num3=num1+num2;
		return num3;
	}
	int multiply(int num1,int num2) {
		int num3=num1*num2;
		return num3;
		
	}
}
