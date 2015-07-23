package solutions;
import java.util.Random;

public class TriangleShellSolution {
	
	public static void main(String[] args) {
		// 2. Crate a new Robot and set its pen to down
		Robot rob = new Robot();
		rob.penDown();
		
		//drawTriangle(rob, 20); // 3. delete this line (used only for testing)

		// 6. Make the Robot go as fast as possible
		rob.setSpeed(10);
		// 4. make a variable to hold the length of the triangle and set it to 25 
		int length = 25;
		// 7. Do the following (up to step 9) 60 times
		for(int i = 0; i < 60; i++)
		{
			// 9. Change the color of the line the Robot draws to a random color
			rob.setPenColor(new Random().nextInt(255), new Random().nextInt(255), new Random().nextInt(255));
			// 8. Increase the length of the side by 4 pixels
			length += 4;
			// 5. call your drawTriangle() method using your Robot and your length variable
			drawTriangle(rob, length);
			// 10. Turn the tortoise 6 degrees to the right
			rob.turn(6);
		}
	}

	/* 1. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private static void drawTriangle(Robot r, int length) {
		for(int i = 0; i < 3; i++)
		{
			r.move(length);
			r.turn(360 / 3);
		}
		
	}
}