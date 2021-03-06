/**
 * StepClimbers climb steeply rising mountains, one step across for every step of rise
 * 
* @author <...>
* @version <...>
 * 
 */
import edu.fcps.karel2.Display;

public class StepClimber extends Climber {

	public StepClimber(int x) {
   
   }	
	public void climbUpRight() {
		
      turnLeft();
      move();
      turnRight();
      move();

	}
	
	public void climbUpLeft() {
		
      turnLeft();
      move();
      turnLeft();
      move();

	}
	
	public void climbDownRight() {
		
      move();
      turnRight();
      move();
      turnLeft();

	}
	
	public void climbDownLeft() {
		
      move();
      turnRight();
      move();
      turnLeft();
	}
}
