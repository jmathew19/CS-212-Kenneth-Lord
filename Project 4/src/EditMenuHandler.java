import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class EditMenuHandler implements ActionListener{

	
	/**
	 * 
	 * 
	 * @author Jonthan Mathew
	 * @since 12/5/20
	 * @version 1
	 * @description if we click on the action edit and click search
	 * if we click on search we get to search to see if a word is in the lists
	 * 
	 * 
	 *
	 */
	
	
	//public static String user;
	@Override
	public void actionPerformed(ActionEvent e) {

		
		//when the action preformed is search
		if(e.getActionCommand().equals("Search")) {
			
			String user = JOptionPane.showInputDialog("Please enter a A word you would like to search");
			String value="";
			//used to check at the end of the loop wether or not we found the word
			 boolean t=true;
				
					for(Map.Entry s : Project4.treeMap.entrySet() ) {
					
						value = (String)s.getValue(); 
						System.out.println(value);
						if( (value).equals(user)){
						JOptionPane.showMessageDialog(null, user+ " is a word in the file" );
						t=false;
						break;
						}
						
					
					}
					//if we were not able to find the word in the tree we say its not in there
					if(t==true)
						JOptionPane.showMessageDialog(null, "'"+ user+  "'"+ " is NOT a word in the file" );
				
				
				
				
				
		}
		

	}
	

	
}
