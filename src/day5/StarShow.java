package day5;

import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
/* Before beginning recipe: 
* 1. ask students to find and explain the method in this recipe. 
* 2. ask students how they might use the method to make the picture in the laminated hand-outs. */

public class StarShow {
	
	Robot robot = new Robot("batman");
	
	void makeStars() {
		
		drawStar(150);	//5. delete this line. you will draw the star again in step 8.
		// 13. Set the speed to 8

		// 6. Make a variable to hold the X position of the Robot and set it to 10

		// 7. Make a variable to hold the Y position of the Robot and set it to 950

		// 8. Make a variable to hold the star size and set it to 25

		// 12. Repeat the steps #19 to #18, 30 times

			// 19. Set the pen width to i 
	
			// 10. Set the X position of the robot to your X variable
	
			// 11. Set the Y position of the robot to your Y variable
	
			// 9. Call the drawStar() method with your star size variable
	
			// 14. Increase the X position by star size. See Figure 2.
	
			// 15. decrease the Y position by star size. See Figure 3.
	
			// 16. Increase the star size by 20
	
			// 17. Turn the robot 12 degrees
	
			// 18. Make each star a different random color like in Figure 4. 

	}

	private void drawStar(int starSize) {
		// 2. Put the robot's pen down

		// 4. Repeat both commands 5 times. See Figure 1 at http://bit.ly/star-show

			// 1. Move the robot the distance of the starSize variable
	
			// 3. Turn the robot 144 degrees
			
	}
	
	public static void main(String[] args) {
		new StarShow().makeStars();
	}
}



