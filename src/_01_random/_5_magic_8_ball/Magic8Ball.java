//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
	public static void main(String[] args) {
		int randNum = 0;
		randNum = new Random().nextInt(4);
		System.out.println(randNum);
		JOptionPane.showInputDialog("Ask a question for the 8 ball.");
		
		if (randNum == 0) {
		JOptionPane.showMessageDialog(null, "Yes");
	} else if (randNum == 1) {
		JOptionPane.showMessageDialog(null, "No");
	} else if (randNum == 2) {
		JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
	} if (randNum == 3) {
		JOptionPane.showMessageDialog(null, "Why would you even ask that?e");
	}

	// 1. Make a main method that includes all the steps below

	// 2. Make a variable that will hold a random number and put a random number
	//    into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable

	// 4. Get the user to enter a question for the 8 ball

	// 5. If the random number is 0

	// -- tell the user "Yes"
	
	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer
	}
}
