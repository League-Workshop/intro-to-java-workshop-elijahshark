package solutions;
/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazySolution {
	
	private void makePrettyThings() {
		// 1. create a new Robot
		Robot rob = new Robot();
		
		// 6. make the robot go at maximum speed
		rob.setSpeed(10);
		// 9. choose a color that you like for the shape
		rob.setPenColor(0, 0, 255);
		// 2. make a variable for the number of sides you want (can’t test this one)
		int sides = 5;
		// 3. make a variable for the angle you want the robot to turn. Hint: you can divide in Java using “/”. Can’t test until step 5.
		int angle = 360 / sides;
		// 5. Do everything below 200 times. When this is done you will see a pentagon.
		for(int i = 0; i < 200; i++)
		{
			// 1. Set the Robot's pen to the down position
			rob.penDown();
			// 2. move the robot 100 pixels
			//rob.move(100);
			// 7. make the robot move 100 * i pixels instead of 100 (don’t need new line of code for this, just change previous one)
			rob.move(i);
			// 4. turn the robot the amount in your angle variable
			rob.turn(angle);
			// 8. turn the robot one more degree
			angle++;
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