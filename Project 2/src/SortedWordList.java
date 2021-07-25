public class SortedWordList extends WordList{
	


	/**
	 * 
	 * 
	 * @author Jonthan Mathew
	 * @since 10/30/20
	 * @version 1
	 * @description  * Constructor for SortedWordList
	 * since it inherits from WordList its constructor is the same as the parent so we can call super()
	 * 
	 * 
	 */
	public SortedWordList() {
		super();
	}
	/*
	 *this method adds to the Wordlist just like the unordered one, however this one places them in alaphbetical order
	 */
	public void add(Word word) {
		
		WordNode newNode = new WordNode(word);
		WordNode c = first;
		WordNode cnext = first.next;
		
		while( cnext  != null){
			//if word in newNode comes alphabetically before it takes that spoteasg
			if(newNode.data.s.compareTo(cnext.data.s)<0) {
				break;
			}//if statement
			
			c=c.next;
			cnext=c.next;
			
		}//while loop
		c.next = newNode;
		newNode.next =cnext;
		this.length++;
	}//add word

	
	
}//endclass