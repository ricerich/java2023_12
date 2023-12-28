package test04.ex02;

public class Ex02 {

	public static void main(String[] args) {
		MyExp number1 = new MyExp();
		number1.base = 2;
		number1.exp = 3;

		MyExp number2 = new MyExp();
		number2.base = 3;
		number2.exp = 4;

		int res1 = number1.getValue();
 		System.out.println("2의 3승 = " + res1 );
 		System.out.println("3의 4승 = " + number2.getValue());

	}

}
