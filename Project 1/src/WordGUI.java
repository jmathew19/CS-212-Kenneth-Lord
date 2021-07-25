import java.awt.Color;

import java.awt.GridLayout;
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
		 * @since 10/09/20
		 * @version 1
		 * @description creates a GUI that displays the arrays 
		 * 
		 * 
		 */
		
		
		public void createAndShowGUI(String framename,String[]all, String[]sort, String[]invalid) {
			
			JFrame frame = new JFrame(framename);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(5000,5000);
			frame.setLocation(300,300);  
			frame.setLayout(new GridLayout(1,3));
			Container cont= frame.getContentPane();
		    readAndDisplayWords(frame, cont, all, sort, invalid);

		}//createAndShowGUI
		
	
		/**
		 * 
		 * this shows each array to be seen for us in the JFrame
		 *all the words, sorted, and invalid words
		 *
		 */
		private static void readAndDisplayWords(JFrame frame, Container cont, String[]all, String[]sort, String[]invalid) {
			JTextArea allWords =new JTextArea(10,30);
			
			JTextArea sorted =new JTextArea(10,30);
			
			JTextArea invalidWords =new JTextArea(10,30);
			
			for(int i = 0; i <all.length;i ++) {//shows all 
				if(all[i]==null) {
					break;
				}
				allWords.append( all[i]+"\n");
				
			}
			
			for(int i = 0; i <sort.length;i ++) {
				if(sort[i]==null) {
					break;
				}
				sorted.append( sort[i]+"\n");
				
			
				
			}
			
			for(int i = 0; i <invalid.length;i ++) {
				if(invalid[i]==null) {
					break;
				}
				invalidWords.append( invalid[i]+"\n");
				
				//System.out.println(sort[i]);
				
			}
			
			frame.setVisible(true);
			cont.add(allWords);
			cont.add(sorted);
			cont.add(invalidWords);
			
			
		}


		
}//end class