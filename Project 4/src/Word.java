import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher; 
import java.util.regex.Pattern;

public class Word implements Comparable<Word>{
	
	public String words;
	
	
	/**
	 * 
	 * 
	 * @author Jonthan Mathew
	 * @since 12/5/20
	 * @version 1
	 * @description creates type word for the other classes and has try catch statements to find all invalid words 
	 * then adds it automatically to the invalid words array 
	 * 
	 * 
	 */
	public Word(String w) {
		// TODO Auto-generated constructor stub
		words=w;
	}
	
	//
	public int compareTo(Word w) {//allows us to comapre two objects of type Word
		return this.words.compareTo(w.words);
	}








	
	

}
