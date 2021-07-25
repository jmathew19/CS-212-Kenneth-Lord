public abstract class WordList {
	
	 protected WordNode first;
	 protected WordNode last;
	 protected int length;
	 

	 
	 /**
		 * 
		 * 
		 * @author Jonthan Mathew
		 * @since 10/30/20
		 * @version 1
		 * @description 
		 *  * constructor for WordList which has no arguments
		 * we have the dummy node and since its empty the last and first get assigned null
		 * and by default an empty list node is length of 0
		 */
	 
	 public WordList() {
		 first = new WordNode(null);
		 last = first;
		 length =0;
	 }
	 
	 /*
	  * this appends type Word to the end of the WordList we have and this method is inherited by its child classes swl and unswl
	  */
	 
	 public void append(Word w) {
		
		 WordNode newNode = new WordNode(w);
		 last.next = newNode;
		 last = newNode;
		 length++;
		 
	 }
}// end class