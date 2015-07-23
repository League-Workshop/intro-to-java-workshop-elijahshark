public class FourSquareSolution {

	// 1. Create a new Robot
	Robot robot = new Robot();

	void go() {
		// 3. Make the tortoise move as fast as possible
		robot.setSpeed(10);
		// 4. Set the pen width to 5
		robot.setPenWidth(5);
		// 5. Do steps #6 to #7 four times...
		for (int i = 0; i < 4; i++) {
			// 6. Change the color of the line the Tortoise draws to a random color
			robot.setPenColor(PenColors.getRandomColor());
			// 1. Call the drawSquare() method
			drawSquare();
			// 7. Turn the robot 90 degrees to the right
			robot.turn(90);
		}

	}

	/* 2. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		robot.penDown();
		for (int i = 0; i < 4; i++) {
			robot.move(100);
			robot.turn(90);
		}
	}

	public static void main(String[] args) {
		new FourSquareSolution().go();
	}

}
