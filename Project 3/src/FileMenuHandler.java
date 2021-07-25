import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FileMenuHandler implements ActionListener{

	/**
	 * 
	 * 
	 * @author Jonthan Mathew
	 * @since 11/19/20
	 * @version 1
	 * @description this checks to see what action is preformed and depending on the action it does something
	 * if we click on open we get to open our directory 
	 * if we click quit is exits the program
	 *
	 */
	
	
	
	public void actionPerformed(ActionEvent event)  {
		if(event.getActionCommand().equals("Open")) {//if we click on open it brings us to the directory of the computer
			
			JFileChooser file1 = new JFileChooser();
			
			int status;
			status = file1.showOpenDialog(null);
			if(status == JFileChooser.APPROVE_OPTION) {//geeks for geeks this check to see if we chose a valid file 
			   			File file2= file1.getSelectedFile();
			   			
			   			//just like all other programs this looks at every line of the selected file and adds them to the array 
			   			//not sure why i need to use try and catch is it because of im getting a file and need to make sure I get a file to check?
			   			try {
			   			BufferedReader in = new BufferedReader(new FileReader(file2));
			   			
			   			String line = in.readLine();
			   			StringTokenizer token;
			   			
			   			while(line!=null) {
			   				 token = new StringTokenizer(line);
			   				while(token.hasMoreTokens()) {
			   					Word word = new Word(token.nextToken());
			   					
			   					if(word.words.matches("^[a-zA-Z]*$")) {//if it contains only letters it adds the lists with valid values
			   						Project3.sort.add(word);
			   						Project3.unsorted.add(word);
			   					}
			   					
			   					
			   				}
			   				line = in.readLine();
			   			}
			   		}catch(IOException ex) {
			   			
			   		}
			   	   
			   	   Collections.sort(Project3.sort);
			   	   
			   	   Project3.gui.readAndDisplayWords(Project3.unsorted, Project3.sort, Project3.illegal);
			   	   
			   	   
			      }
			
			//if user clicks quit we exit the program
		}else if(event.getActionCommand().equals("Quit")) {
			System.exit(0);
		}
		
		
		//we need to clear the arrays after we are done so it doenst duplicate when we add another file 
		Project3.unsorted.clear();
		Project3.sort.clear();
		Project3.illegal.clear();
		
	}//actionedPerformed
	
	
}//end class
