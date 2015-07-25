package solutions;

import org.jointheleague.graphical.robot.Robot;
/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazySolution {
	
	private void makePrettyThings() {
		// 1. create a new Robot
		Robot robot = new Robot();
		
		// 8. make the robot go at maximum speed
		robot.setSpeed(10);
		// 9. choose a color that you like for the shape
		robot.setPenColor(30, 130, 30);
		// 4. make a variable for the number of sides you want (can’t test this one)
		int sides = 5;
		// 5. make a variable for the angle you want the robot to turn. Hint: you can divide in Java using “/”. Can’t test until step 6.
		int angle = 360 / sides;
		// 7. Do everything below 200 times. When this is done you will see a pentagon.
		for(int i = 0; i < 200; i++)
		{
			// 2. Put robot's pen down
			robot.penDown();
			// 3. Move the robot 200 pixels
			//robot.move(200);
			// 9. make the robot move "i" pixels instead of 200 (don’t need new line of code for this, just change previous one)
			robot.move(i);
			// 6. turn the robot the amount in your angle variable
			robot.turn(angle);
			// 10. turn the robot one more degree
			robot.turn(1);
		}

	}

	// Variations:
	// *10. make the pattern really huge
	// *11. change the color of the pattern
	// *12. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazySolution().makePrettyThings();
	}
}