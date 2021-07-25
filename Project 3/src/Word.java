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
	 * @since 11/18/20
	 * @version 1
	 * @description creates type word for the other classes and has try catch statements to find all invalid words 
	 * then adds it automatically to the invalid words array 
	 * 
	 * 
	 */
	public Word(String w) {
		// TODO Auto-generated constructor stub
		words=w;
		try {
			Pattern pattern = Pattern.compile("[$&+,:;=\\\\?@#|/'<>.^*()%!-]");//checks to see if there is special elements
			
		
				if(w.matches(".*\\d.*") ||  pattern.matcher(w).find() )//if there are any numbers or contains special chracters 
					throw new IllegalWordException();				
				
		}catch(IllegalWordException ill) {
			Project3.illegal.add(this);//list of all invalid words
		}
	}
	
	//
	public int compareTo(Word w) {//allows us to comapre two objects of type Word
		return this.words.compareTo(w.words);
	}








	
	

}
