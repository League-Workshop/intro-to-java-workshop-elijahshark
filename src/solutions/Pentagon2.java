import org.jointheleague.graphical.robot.Robot;
import org.teachingextensions.logo.Tortoise;

public class PentagonCrazy
{
  public static void main(String[] args)
  {
    new PentagonCrazy().makePrettyThings();
  }
  
  private void makePrettyThings()
  {
	//  Robot Tortoise = new Robot();
    // 4. make the tortoise go at maximum speed
    Tortoise.setSpeed(10);
    // 2. make a variable for the number of sides you want
    int sides = 5;
    // 4. do everything below 200 times
    for (int i = 1; i <= 200; i++)
    {
      // 1. move the tortoise 100 pixels
      // 5. make the tortoise move "i" pixels instead
      Tortoise.move(i);
      // 3. turn the tortoise 360 degrees divided by the number of sides
      Tortoise.turn(360 / sides);
      // 6. turn the tortoise one more degree
      Tortoise.turn(1);
    }
  }
  //Variations:
  //  1. make the pattern really huge
  //      change the color of the pattern
  //  2. create a method called, "adjustPen()"
  //        make the pen get increasingly bigger 
  //          stop the pen getting too big (less than 4)
}


