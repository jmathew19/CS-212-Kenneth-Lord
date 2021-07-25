import java.awt.Container;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.AbstractButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class WordGUI extends JFrame{
	
	/**
	 * 
	 * 
	 * @author Jonthan Mathew
	 * @since 12/5/20
	 * @version 1
	 * @description this is the gui to show the array of unsorted words and tree map which auto maticall sorts the words
	 * and allows us to create a menu bar to click on stuff 
	 * and a search bar to allow us to see if a word is in text file
	 *
	 */

	public JTextArea allWords;//this is the content pane that shows the unsorted words
	public JTextArea sort;//this is the content pane that shows the sorted words
	
	
	public WordGUI() {
		
		this.setTitle("Project 3");
		this.setSize(400,400);
		this.setLayout(new GridLayout(1,3));
		
		
		//creates menu bar 
		JMenuBar    menuBar  = new JMenuBar();
		//adds file opetion in the menu bar
	    JMenu menu = new JMenu("File");
	    FileMenuHandler fmh  = new FileMenuHandler();
	    
	    //creates a menu item in file called open to open a file
	    JMenuItem open = new JMenuItem("Open");
	    open.addActionListener(fmh);
	    menu.add(open);
	    
	    //creates a menu item called quit in file that exits the display
	    JMenuItem close = new JMenuItem("Quit");
	    close.addActionListener(fmh);
	    menu.add(close);
	    
	    //creates file menu that called edit in the bar
	    JMenuBar    menuBar1  = new JMenuBar();
	    JMenu menu2 = new JMenu("Edit");
	    EditMenuHandler fmh2  = new EditMenuHandler();
	    
	    //creates a option in edit called search
	    JMenuItem search = new JMenuItem("Search");
	    search.addActionListener(fmh2);
	    menu2.add(search);
	   
	    
	    //adds the edit and file to the menu bar
	    setJMenuBar(menuBar);
	    menuBar.add(menu);
	    menuBar.add(menu2);
	    
	    
	   
		
		//creates a text area that shows the words
		allWords = new JTextArea();
		add(allWords);
		sort = new JTextArea();
		add(sort);
		
		//calls the method to actually dsiplay the words
		readAndDisplayWords(Project4.unsorted,Project4.treeMap);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		
	}//end construcotr 
	
	
	
	/**
	 * 
	 * 
	 * @author Jonthan Mathew
	 * @since 12/5/20
	 * @version 1
	 * @description this is the gui that adds the contents to the area to be seen  
	 *
	 */
	
	
	
	public void readAndDisplayWords( ArrayList<Word> unsorted,TreeMap<Word,String> sorted) {
		allWords.setText("");
		for(int i =0; i<unsorted.size();i++ ) {
			allWords.append(unsorted.get(i).words+ "\n");  
		}
		
		sort.setText("");
		for(Map.Entry e : Project4.treeMap.entrySet() ) {
			sort.append((String) e.getValue()+ "\n");
		}
		
	}//readAndDisplayWords gui
	
	
}//end class
