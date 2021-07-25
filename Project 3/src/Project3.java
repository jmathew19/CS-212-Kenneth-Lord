import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Project3 {
	
	/**
	 * 
	 * 
	 * @author Jonthan Mathew
	 * @since 11/19/20
	 * @version 1
	 * @description this creates 3 ArrayLists 
	 * 1st one is all valid words,
	 * 2nd one is all valid words alphabetized, 
	 * 3rd one is all invalid words, 
	 *
	 */
	
	public static ArrayList<Word> unsorted;
	public static ArrayList<Word> sort; 
	public static ArrayList<Word> illegal;
	public static WordGUI gui;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		unsorted = new ArrayList <Word>();
		sort = new ArrayList <Word>(); 
		illegal = new ArrayList <Word>();
		
		
//		TextFileInput in = new TextFileInput(args[0]);
//		String line = in.readLine();
//		StringTokenizer token;
//		
//		while(line!=null) {
//			 token = new StringTokenizer(line);
//			while(token.hasMoreTokens()) {
//				Word word = new Word(token.nextToken());
//				list1.add(word);
//				list2.add(word);
//			}
//			line = in.readLine();
//		}
		
		//Collections.sort(list3);

		Collections.sort(sort);
		gui = new WordGUI();//creates gui for us to see
		gui.readAndDisplayWords( unsorted, sort, illegal);
	}//main
	

}
