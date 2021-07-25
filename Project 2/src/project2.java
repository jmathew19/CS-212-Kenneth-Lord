import java.util.StringTokenizer;

public class project2 {
	/**
	 * 
	 * 
	 * @author Jonthan Mathew
	 * @since 10/30/20
	 * @version 1
	 * @description this creates 2 wordLists 
	 * 1st one is all words,
	 * 2nd one is all the words alphabetized, 
	 * beauty of Listnodes is that adding new words into them is simple
	 *
	 */
	
	public static void main(String[] args) {
		
		//creating the different kinds of wordLists asked by the assignment
		UnsortedWordList uwl= new UnsortedWordList();
		SortedWordList swl= new SortedWordList();
		//Takes the words for the txt file
		TextFileInput in= new TextFileInput(args[0]);
		String line= in.readLine();
		StringTokenizer myToken = new StringTokenizer(line);
		String word;
		while(line != null) {
			//System.out.println("outer loop");
			myToken = new StringTokenizer(line);
			while(myToken.hasMoreTokens()) {
				//System.out.println("inner loop");
				word = myToken.nextToken();
				Word w = new Word(word);
				uwl.add(w);
				swl.add(w);
			}//inner
			//TO MAKE SURE IT DOESNT STAY IN AN INFINTIE LOOP smh
			line= in.readLine();
		}//outer
		
		
		//calls gui
		WordGUI gui= new WordGUI();
		gui.createAndShowGUI("Project 2", uwl, swl);
	}//main

}