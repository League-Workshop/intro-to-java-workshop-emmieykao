package section2;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot Kylo = new Robot();
	
	void go() {
		 //3. delete this line (used only for testing)
		
		drawTriangle(50); 

		// 6. Make the robot go as fast as possible
		
		// 4. make a variable to hold the length of the triangle and set it to 50
		int sidelength=50;
		// 7. Use a for loop to repeat steps #9 to #10, 60 times
for (int i = 0; i < 60; i++) {
	// 9. Change the color of the pen to a random color
	Kylo.setRandomPenColor();
				// 8. Increase the length variable by 10
			sidelength+=10;
				// 5. call your drawTriangle() method using your length variable
		drawTriangle(sidelength);
				// 10. Turn the robot 6 degrees to the right
	Kylo.turn(6);
}
			
	}

	/* 2. fill in the method below to draw a triangle. Use the length variable when you call move(). */
	private void drawTriangle(int length) {
		
		
		Kylo.setSpeed(100);
		Kylo.penDown();
		for (int i = 0; i < 3; i++) {
			
			Kylo.setRandomPenColor();
			Kylo.move(length);
			
			
			Kylo.turn(120);
			
		}
	
		
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
