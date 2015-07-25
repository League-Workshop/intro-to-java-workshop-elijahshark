package solutions;

import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
/* Before beginning recipe: 
* 1. ask students to find and explain the method in this recipe. 
* 2. ask students how they might use the method to make the picture in the laminated hand-outs. */

public class StarShowSolution {
	
	Robot robot = new Robot();
	
	void showStars() {
		robot.penDown();
		robot.changeRobot("small-bot.robi");
		
		//drawStar(100);	//4. delete this line. you will draw the star again in step 8.
		
		// 13. Set the speed to 8
		
		// 5. Make a variable to hold the X position of the Tortoise and set it to 10
		int xPos = 10;
		// 6. Make a variable to hold the Y position of the Tortoise and set it to 660
		int yPos = 660;
		// 7. Make a variable to hold the star size and set it to 15
		int starSize = 15;
		// 11. Repeat the steps below, 30 times
		
			// 9. Set the X position of the robot to your X variable
			
			// 10. Set the Y position of the robot to your Y variable
			
			// 8. Call the drawStar() method with your star size variable
			drawStar(starSize);
			// 12. Increase the X position by star size. See Figure 2.
			
			// 14. decrease the Y position by star size. See Figure 3.
			
			// 15. Increase the star size by 8
			
			// 16. Turn the Tortoise 10 degrees
			
			// 17. Make each star a different random color like in Figure 4. Hint: Use the Colors object.

		
	}

	private void drawStar(int starSize) {
		// 3. Repeat both commands 5 times. See Figure 1 at http://bit.ly/star-show
		for (int i = 0; i < 5; i++) {
			// 1. Move the robot the distance of the starSize variable
			robot.move(starSize);
			// 2. Turn the robot 144 degrees
			robot.turn(144);
		}
			
	}
	
	public static void main(String[] args) {
		new StarShowSolution().showStars();
	}
}



