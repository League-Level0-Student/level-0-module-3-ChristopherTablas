
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		
		String momsBirthday = "April 26th";
		
		String dadsBirthday = "June 1st";
		
		String myBirthday = "July 13th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String birth= JOptionPane.showInputDialog("what birthday do you want to know");
		// 3. Print out what the user typed
		System.out.println(birth);
		// 4. if user asked for "mom"
			//print mom's birthday
		if(birth.equals("mom"));{
			System.out.println(momsBirthday);
		}
		// 5. if user asked for "dad"
		if(birth.equals("dad"));{
			System.out.println(dadsBirthday);
		}
			// print dad's birthday
		if(birth.equals("Chris"));{
			System.out.println(myBirthday);
		}
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		
	} 
}
