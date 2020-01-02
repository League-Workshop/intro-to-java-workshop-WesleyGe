package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = (0);
		// 2.  Ask the user a question 
		String answer = JOptionPane.showInputDialog(null,"Why was little timmy sad?");
		if(answer.equals("Because he had a frog stapled to his face.")) {
		score = score + 1;
		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String aNswer = JOptionPane.showInputDialog(null,"cOlOrS");
		if(aNswer.equals("reed")) {
		score = score + 1;
		}
		// 6.  After all the questions have been asked, print the user's score 
		String anSwer = JOptionPane.showInputDialog(null,"LR");
		if(anSwer.equals("left")) {
		score = score + 1;
		}
		JOptionPane.showMessageDialog(null,"Total score: "+score);
	}
	
	
}
