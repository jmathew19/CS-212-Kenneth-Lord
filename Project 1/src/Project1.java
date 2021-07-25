import java.util.StringTokenizer; 
import java.util.regex.Matcher; 
import java.util.regex.Pattern;


public class Project1 {
	
	/**
	 * 
	 * 
	 * @author Jonthan Mathew
	 * @since 10/09/20
	 * @version 1
	 * @description this creates three arrays 1st one is all words in the array,
	 * 2nd one is all the valid words in the array organized using selection sort, 
	 * 3rd one is all invalid areas
	 * 
	 */
	
	public static String[] array;
	
	public static void main(String[] args) {
		array=fillArray(args[0]);
		isValid(array);
		isInValid(array);
		WordGUI gui= new WordGUI();
		gui.createAndShowGUI("Project 1",array,isValid(array),isInValid(array));
	}//main

	
	
	
	/**
	 * 
	 * gets all words in textfile and puts it in an array
	 * which allows us after to access this array you get the invalid and valid words
	 * 
	 */
	public static String[] fillArray(String s) {
		
		TextFileInput in= new TextFileInput(s);
		String line= in.readLine();
		StringTokenizer myToken = new StringTokenizer(line);
		
		String[] all=new String[50];
		int r=0;
		
	
		while(line != null){
			myToken = new StringTokenizer(line);
			while(myToken.hasMoreTokens()) {
				
				all[r]=(myToken.nextToken());
				//System.out.println(all[r] );
				r++;
			}
		
			line= in.readLine();
		}
		
		return all;
		
	}//fillArray
		
	
	
	
	/**
	 * 
	 * //checks to see if its a valid words and puts it in a new array
	 * 
	 */
	public static String[] isValid(String[] s) {	
		String[] valid=new String[50];
		int x=0;
		
		for(int i=0;i<s.length;i++){	
			if(s[i]==null)
				break;
			if(s[i].matches("[a-zA-Z]+")) {//checks to see if there is only letters and if its true put it valid array
				valid[x]=s[i];
				//System.out.println(valid[x]);
				x++;
			}
		}
		
		String[] right=new String[x];
		for(int i=0;i<valid.length;i++){	
			if(valid[i]==null)
				break;
			right[i]=valid[i];
			//System.out.println(right[i]);	
		}

		for ( int j=0; j < x-1; j++ ){
	      
	      int min = j;
	      for ( int m=j+1; m < x; m++ ) {
	        if ( right[m].compareTo( right[min] ) < 0 ) { min = m;  
	        
	        }
		}
	     
	      String buffer = valid[j];
	      right[j] = right[min];
	      right[min] = buffer;
	    }
				
		
		
		return right;
	}//isValid
	


	/**
	 * 
	 * checks to see if its invalid and puts all invalid words in a new array
	 * 
	 */
	public static String[] isInValid(String[] s) { 
		
		String[] invalid=new String[50];
		int x=0;
		Pattern pattern = Pattern.compile("[$&+,:;=\\\\?@#|/'<>.^*()%!-]");//checks to see if there is special comments
		//Matcher matcher = pattern.matcher();
		
		for(int i=0;i<s.length;i++){	
			if(s[i]==null)
				break;
			if( s[i].matches(".*\\d.*") || pattern.matcher(s[i]).find()   ) {//checks to see if it contains any number or special character if so then puts it in the invalid arrya
				invalid[x]=s[i];//puts invalid words into the invalid matrix
				//System.out.println(invalid[x]);
				x++;
			}

		}
		
		return invalid;
	}
	

}//class