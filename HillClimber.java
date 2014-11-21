/**
 * HillClimbers move two steps across for each step of rise
 * 
* @author <...>
* @version <...>
 * 
 */

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class HillClimber extends Climber {

	public HillClimber(int x) {
		
	}
	public void climbUpRight() {
		 
      turnLeft();
      move();
      turnRight();
      move();
      move();
	}
	
	public void climbUpLeft() {
		
      turnLeft();
      move();
      move();
      turnLeft();
      move();

	}
	
	public void climbDownRight() {
      
      move();
      turnRight();
      turnLeft();	
      move();
      move();
   }
	
	public void climbDownLeft() {
		
      move();
      turnLeft();
      turnRight();	
      move();
      move();
	}
}
