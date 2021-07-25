import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class WordGUI {
	
	
	/**
	 * 
	 * 
	 * @author Jonthan Mathew
	 * @since 10/30/20
	 * @version 1
	 * @description creates a GUI that displays the WordLists 
	 * 
	 * 
	 */
	public void createAndShowGUI(String framename, UnsortedWordList uns, SortedWordList s ) {
		
		JFrame frame = new JFrame(framename);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(100,100);
		frame.setLocation(100,100);  
		frame.setLayout(new GridLayout(1,3));
		Container cont= frame.getContentPane();
	    readAndDisplayWords(frame,cont,uns,s);

	}//createAndShowGUI

	/**
	 * 
	 * this shows each WordLists to be seen for us in the JFrame
	 *all the words and sorted
	 *
	 */
	
	public static void readAndDisplayWords(JFrame frame,Container cont,UnsortedWordList u, SortedWordList s) {
		
		JTextArea allWords =new JTextArea(10,30);
		
		JTextArea sorted =new JTextArea(10,30);
		
		//adds each element in the uswl to be seen in the gui
		WordNode current = u.first.next;
		while(current != null) {
			allWords.append(current.data.s+ "\n");  
			
			current = current.next;
		}
		//adds each element in the swl to be seen in the gui
		current = s.first.next;
		while(current != null) {
			sorted.append(current.data.s+ "\n");  
			
			current = current.next;
		}
		//lets it be seen by the viewer
		frame.setVisible(true);
		cont.add(allWords);
		cont.add(sorted);
	}
}