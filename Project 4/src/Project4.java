import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Project4 {
	
	/**
	 * 
	 * 
	 * @author Jonthan Mathew
	 * @since 12/5/20
	 * @version 1
	 * @description this creates 3 ArrayLists 
	 * 1st one is all valid words,
	 * 2nd one is all valid words alphabetized done automatically through tree maps
	 * 
	 *
	 */
	
	public static ArrayList <Word> unsorted;
	public static TreeMap<Word,String> treeMap;
	public static WordGUI gui;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		unsorted = new ArrayList <Word>();
		treeMap = new TreeMap<>();
		
		
		
		gui = new WordGUI();//creates gui for us to see
		gui.readAndDisplayWords( unsorted, treeMap);//displays gui
	}//main
	

}
