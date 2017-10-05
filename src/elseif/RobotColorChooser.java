
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot timmy = new Robot();
		for(int a = 0; a < 100; a++){
		//3. ask the user what color they would like the robot to draw
		String colors = JOptionPane.showInputDialog("what color do you want?");
		//4. use an if/else statement to set the pen color that the user requested
		timmy.setSpeed(10);
		timmy.setPenWidth(10);

		if(colors.equals("blue")){
			timmy.setPenColor(30, 144, 225);
		}
		if(colors.equals("red")){
			timmy.setPenColor(Color.RED);
		}
		if(colors.equals("green")){
			timmy.setPenColor(Color.GREEN);
		}
		if(colors.equals("orange")){
			timmy.setPenColor(Color.ORANGE);
		}
		if(colors.equals("purple")){
			timmy.setPenColor(Color.MAGENTA);
		}
		if(colors.equals("pink")){
			timmy.setPenColor(Color.PINK);
		}
		if(colors.equals("yellow")){
			timmy.setPenColor(Color.YELLOW);
		}
		
		//5. if the user doesn’t enter anything, choose a random color
		if(colors.equals(""))
		
        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		timmy.setPenWidth(10);
	    //1. make the robot draw a shape (this will take more than one line of code)
		
		timmy.penDown();
		for(int i = 0; i < 4; i++){
		timmy.move(100);
		timmy.turn(90);
		}
	}
}
}