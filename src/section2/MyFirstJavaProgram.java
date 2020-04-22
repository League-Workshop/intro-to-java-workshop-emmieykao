package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	
		Robot Kylo = new Robot();
		Kylo.moveTo(400, 100);
		for (int i = 0; i < 4; i++) {
			

			Kylo.penDown();
			Kylo.setRandomPenColor();
			Kylo.setSpeed(100);
			Kylo.move(-300);
			Kylo.turn(90);
			
		
		
	
	}
		Kylo.sparkle();
		
		Kylo.turn(45);
		Kylo.move(424);
}



}
