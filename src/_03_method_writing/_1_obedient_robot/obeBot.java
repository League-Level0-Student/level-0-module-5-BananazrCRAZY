package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obeBot {
	static Robot bot = new Robot();
	public static void main(String[] args) {
		bot.penDown();
		bot.setSpeed(100);
		
		String q = JOptionPane.showInputDialog("What Shape? \n1. Square\n2. Triangle\n3. Circle");
		String w = JOptionPane.showInputDialog("What Color?\n1. Black\n2. Blue\n3. Red\n4. Random");
		
		int s = Integer.parseInt(q);
		int e = Integer.parseInt(w);
		
		if (e == 1)
			bot.setPenColor(Color.BLACK);
		else if (e == 2)
			bot.setPenColor(Color.BLUE);
		else if (e == 3)
			bot.setPenColor(Color.RED);
		else if (e == 4)
			bot.setRandomPenColor();
		
		if (s == 1)
			drawSqr();
		else if (s == 2)
			drawTri();
		else if (s == 3)
			drawCir();
	}
	
	static void drawSqr() {
		for (int i = 0; i < 4; i++) {
			bot.move(100);
			bot.turn(90);
		}
	}
	
	static void drawTri() {
		for (int i = 0; i < 3; i++) {
			bot.turn(120);
			bot.move(200);
		}
	}
	
	static void drawCir() {
		for (int i = 0; i < 180; i++) {
			bot.turn(2);
			bot.move(5);
		}
	}
}
