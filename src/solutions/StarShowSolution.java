package solutions;
import java.util.Random;

/*** Teacher's note ***/
/* Before beginning recipe: 
* 1. ask students to find and explain the method in this recipe. 
* 2. ask students how they might use the method to make the picture in the laminated hand-outs. */

public class StarShowSolution {
	
	public static void main(String[] args) {
		// 1. Create a new Robot and set its pen to down
		Robot rob = new Robot();
		rob.penDown();
		
		//5. Call the drawStar method using your Robot and 100 for the starSize
		//drawStar(rob, 100);	//6. delete this line.

		// 7. Set the speed to 8
		rob.setSpeed(8);
		// 8. Make a variable to hold the X position of the Tortoise and set it to 10
		int xPos = 10;
		// 9. Make a variable to hold the Y position of the Tortoise and set it to 440
		int yPos = 880;
		// 10. Make a variable to hold the star size and set it to 15
		int starSize = 15;
		// 11. Repeat the steps below, 30 times
		for(int i = 0; i < 30; i++)
		{
			// 12. Move the robot to a new position using your X and Y variables
			rob.moveTo(xPos, yPos);
			
			// 13. Call the drawStar() method with your star size variable
			drawStar(rob, starSize);
			// 14. Increase the X position by star size. See Figure 2.
			xPos += starSize;
			// 15. decrease the Y position by star size. See Figure 3.
			yPos -= starSize;
			// 16. Increase the star size by 8
			starSize += 8;
			// 17. Turn the Robot 10 degrees
			rob.turn(10);
			// 18. Make each star a different random color like in Figure 4.
			rob.setPenColor(new Random().nextInt(255), new Random().nextInt(255), new Random().nextInt(255));
		}	
		
	}

	private static void drawStar(Robot r, int starSize) {
		// 4. Repeat both commands 5 times. See Figure 1 at http://bit.ly/star-show
		for(int i = 0; i < 5; i++)
		{
			// 2. Move the Robot the distance of the starSize variable
			r.move(starSize);
			// 3. Turn the Robot 144 degrees
			r.turn(144);
		}	
	}
}