public class UnsortedWordList extends WordList{


	
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
	 * Constructor for UnsortedWordList
	 * since it inherits from WordList its constructor is the same as the parent so we can call super()
	 */
	public UnsortedWordList() {
		super();
	}
	
	/*
	 * Constructor for UnsortedWordList
	 * since it inherits from WordList its able to use the append method
	 */
	public void add(Word w) {
		append(w);
	}
	
	
	
	
	
}