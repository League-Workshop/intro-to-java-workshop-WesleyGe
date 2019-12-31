package section2;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot billyJeff = new Robot();
	void go() {
		// 4. Make the robot move as fast as possible
billyJeff.setSpeed(100);
		// 5. Set the pen width to 5
billyJeff.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...

			// 7. Set the pen color to random
	billyJeff.penDown();
	billyJeff.setPenColor(new Color(42,250,69));
			// 1. Call the drawSquare() method
	drawSquare();
	
			// 8. Turn the robot 90 degrees to the right
billyJeff.turn(90);
	}

	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "sQuArE");
		/* 3. Fill in the code to draw a square inside the method below. */
		for(int i=0;i<4;i++) {
		billyJeff.move(250);
		billyJeff.turn(90);
		}
		for(int i=0;i<4;i++) {
			billyJeff.move(150);
			billyJeff.turn(90);
			billyJeff.setPenColor(new Color(42,0,250));
		}
		for(int i=0;i<4;i++) {
			billyJeff.setPenColor(new Color(250,0,69));
			billyJeff.move(50);
			billyJeff.turn(90);
			}
	}
	

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



