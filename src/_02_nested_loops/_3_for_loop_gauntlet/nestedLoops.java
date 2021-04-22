package _02_nested_loops._3_for_loop_gauntlet;

public class nestedLoops {
	public static void main(String[] args) {
		int i, q;
		
		// 0-100
		for (i = 0; i <= 100; i++) {
			System.out.println(i);
		}
		// 100-0
		for (i = 100; i >= 0; i--) {
			System.out.println(i);
		}
		// 2-100 even
		for (i = 2; i <= 100; i++) {
			if ((i % 2) == 0)
				System.out.println(i);
		}
		// 1-99 odd
		for (i = 1; i <= 99; i++) {
			if ((i % 2) != 0)
				System.out.println(i);
		}
		// 1-500 is odd or even
		for (i = 1; i <= 500; i++) {
			if ((i % 2) == 0)
				System.out.println(i + " is even");
			if ((i % 2) != 0)
				System.out.println(i + " is odd");
		}
		// multiple of 7
		for (i = 7; i <= 777; i++) {
			if ((i % 7) == 0)
				System.out.println(i);
		}
		// year and age
		for (i = 0, q = 2006; i <= 14; i++, q++) {
			System.out.println("In " + q + ", I was " + i + " year(s) old.");
		}
		// 2 * 9
		for (i = 0; i < 3; i++) {
			for (q = 0; q < 3; q++) {
				System.out.print(i + " " + q);
				System.out.println();
			}
		}
		// 3 * 3
		for (i = 1; i < 10; i++) {
			System.out.print(i);
			if ((i % 3) == 0)
				System.out.println();
		}
		// 1-100 10 * 10
		for (i = 1; i < 101; i++) {
			System.out.print(i + " ");
			if ((i % 10) == 0)
				System.out.println();
		}
		// * triangle
		for (i = 1; i < 7; i++) {
			for (q = 0; q < i; q++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// Bonus
		for (i = 1; i <= 1; i++)
			for (q = 100; q >= 0; q--)
				System.out.println(q);
	}
}
