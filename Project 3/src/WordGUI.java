import java.awt.Container;
import java.awt.GridLayout;
import java.util.ArrayList;

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
	 * @since 11/19/20
	 * @version 1
	 * @description this is the gui to show the arrays 
	 * and allows us to create a menu bar to click on stuff 
	 *
	 */

	public JTextArea allWords;
	public JTextArea sort;
	public JTextArea ill;
	
	public WordGUI() {
		
		this.setTitle("Project 3");
		this.setSize(400,400);
		this.setLayout(new GridLayout(1,3));
		
		JMenuBar    menuBar  = new JMenuBar();
	    JMenu menu = new JMenu("File");
	    FileMenuHandler fmh  = new FileMenuHandler();
	    
	    JMenuItem open = new JMenuItem("Open");
	    open.addActionListener(fmh);
	    menu.add(open);
	    
	    JMenuItem close = new JMenuItem("Quit");
	    close.addActionListener(fmh);
	    menu.add(close);
	   
	    setJMenuBar(menuBar);
	    menuBar.add(menu);
	    
	   
		
		
		allWords = new JTextArea();
		add(allWords);
		sort = new JTextArea();
		add(sort);
		ill = new JTextArea();
		add(ill);
		
		
		
		
		
		
		readAndDisplayWords(Project3.unsorted,Project3.sort,Project3.illegal);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		
	}//end construcotr 
	
	
	
	/**
	 * 
	 * 
	 * @author Jonthan Mathew
	 * @since 11/19/20
	 * @version 1
	 * @description this is the gui that adds the contents to the area to be seen  
	 *
	 */
	
	
	
	public void readAndDisplayWords( ArrayList<Word> unsorted,ArrayList<Word> list2, ArrayList<Word> illegal) {
		allWords.setText("");
		for(int i =0; i<unsorted.size();i++ ) {
			allWords.append(unsorted.get(i).words+ "\n");  
		}
		
		sort.setText("");
		for(int i =0; i<list2.size();i++ ) {
			sort.append(list2.get(i).words + "\n");  
		}
		
		ill.setText("");
		for(int i =0; i<illegal.size();i++ ) {
			ill.append(illegal.get(i).words+ "\n");  
		}
	}//readAndDisplayWords gui
	
	
}//end class
