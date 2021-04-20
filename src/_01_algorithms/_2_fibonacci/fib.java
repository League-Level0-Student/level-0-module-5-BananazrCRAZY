package _01_algorithms._2_fibonacci;

public class fib {
	public static void main(String[] args) {
		int num1, num2, num3;
		num1 = 0;
		num2 = 1;
		
		for (int count = 0; count < 10; count++) {
			num3 = num2 + num1;
			if (num1 < num2) {
				num1 = num3;
			} else {
				num2 = num3;
			}
			System.out.println(num3);
		}
	}
}
