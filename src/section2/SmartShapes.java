package section2;

import org.jointheleague.graphical.robot.Robot;

public class SmartShapes {
	
    public static void main(String[] args) throws Exception {
        // 1. Make a new Robot
Robot robot = new Robot();

        // 3. Put the robot's pen down

robot.penDown();
        // 6. Make the robot move as fast as possible
robot.setSpeed(100);

        // 5. Use a for loop to repeat everything below 4 times. 
for(int i=0;i<1;i++) {

        //         
	for(int r=0;r<40;r++) {
	robot.move(10);

       

    	robot.turn(9);
}
	for(int t=0;t<40;t++) {
		{
			robot.move(10);

		       

		    	robot.turn(-9);
		}
	}
		robot.move(-300);
		robot.turn(-90);
		robot.move(-30);
		robot.turn(-90);
		robot.move(-300);
    		// 7. Change steps 4 and 5 to draw a different shape (e.g. triangle (3-sides), pentagon (5-sides), decagon (10-sides)).
   
    }
}
}
