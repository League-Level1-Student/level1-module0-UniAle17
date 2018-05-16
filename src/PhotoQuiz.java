/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window
               int score = 0;
		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
               String  unicorn = "https://www.freeiconspng.com/uploads/unicorn-png-7.png";
		// 2. create a variable of type "Component" that will hold your image
               Component uni = createImage(unicorn);
		// 3. use the "createImage()" method below to initialize your Component
           
		// 4. add the image to the quiz window
               quizWindow.add(uni);
		// 5. call the pack() method on the quiz window
               quizWindow.pack();

		// 6. ask a question that relates to the image
               String answeru = JOptionPane.showInputDialog("Where do unicorns play?");
        // 7. print "CORRECT" if the user gave the right answer
               if(answeru.equals("rainbows")) {
            	   System.out.println("CORRECT");
            	   score= score+1;
               }
               else {
            	   System.out.println("INCORRECT");
               }
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
               quizWindow.remove(uni);
		// 10. find another image and create it (might take more than one line of code)
               String rainbow = "https://emojipedia-us.s3.amazonaws.com/thumbs/120/apple/118/rainbow_1f308.png";
               Component rain = createImage(rainbow);
               
               // 11. add the second image to the quiz window
               	quizWindow.add(rain);
               	
		// 12. pack the quiz window
               	quizWindow.pack();
               	
		// 13. ask another question
               	String answerr = JOptionPane.showInputDialog("What is at the end of a rainbow?");
		// 14+ check answer, say if correct or incorrect, etc.
               	if(answerr.equals("a pot of gold")) {
               		System.out.println("CORRECT");
               		score = score+1;
               	}
               	else {
               		System.out.println("INCORRECT");
               	}
	
		JOptionPane.showMessageDialog(null,"Your final score is "+score+ " Thanks for palying");
		
	}
	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





