import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Label;
import java.awt.event.KeyEvent;


import org.jointheleague.graphical.robot.Robot;
import org.jointheleague.graphical.robot.RobotWindow;


public class FeedTheRobot implements KeyEventDispatcher
{
	Robot robot = new Robot();
	
	private void feedTheRobot()
	{
		// 1. use the addFood() method to add food for the robot
	}

private void goUp()
	{
		// 2. Print “going up”. Test it out by running your code and pressing the up key
		// 3. Make the robot move up the screen
	}

	private void goDown()
	{
		// 4. make the robot move down the screen
	}
	
	private void goLeft()
	{
		// 5. make the robot move left
	}

	private void goRight()
	{
		// 6. make the robot move right
	}

	private void checkIfFoodFound() throws Exception
	{
		int robotLocationX = robot.getX();
		int robotLocationY = robot.getY();
	
		// 7. Print out the variables for robotLocationX and robotLocationY
		
		// 8. if robot is at same location as food
			// print "chomp"
			// say “chomp” with Runtime.getRuntime().exec("say chomp");
			// call the eatFood() method
		
	}

private void eatFood() {
		component.setText("");
	}

	private void addFood(int x, int y)
	{
		component.setLocation(x, y);
		window.add(component);
		
	}

	RobotWindow window = robot.getWindow();
	Label component = new Label("*");

	public static void main(String[] args)
	{
		FeedTheRobot feeder = new FeedTheRobot();
		feeder.controlTheRobot();
		feeder.feedTheRobot();
	}

	private void controlTheRobot() 
{
KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		robot.show();
		robot.setSpeed(10);
	}

	public boolean dispatchKeyEvent(KeyEvent e)
	{
		if (e.getID() == KeyEvent.KEY_PRESSED)
		{
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
				 goDown();
			try {
			checkIfFoodFound();
			} catch (Exception exception) {}
		}
		return false;
	}

}

