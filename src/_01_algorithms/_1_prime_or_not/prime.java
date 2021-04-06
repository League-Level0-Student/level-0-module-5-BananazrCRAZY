package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class prime {
	public static void main(String[] args) {
		int count;
		boolean q = false;
		
		String n = JOptionPane.showInputDialog("enter number");
		int num = Integer.parseInt(n);
		
		for (count = 2; count < num; count++) {
			int d = num % count;
			if (d != 0) {
				q = true;
			} else if (d == 0) {
				JOptionPane.showMessageDialog(null, "Not Prime");
				break;
			}
		}
		if (q) {
			JOptionPane.showMessageDialog(null, "Is Prime");
		}
	}
}
