import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		
		
		
		HashTables hash = new HashTables();
		
		BufferedReader reader = null;
		
        try {
            
//        	reader = new BufferedReader( new InputStreamReader (new FileInputStream(args[0])));
        	reader = new BufferedReader( new FileReader(args[0] ));
        	//reader = new BufferedReader( new FileReader("Project2Input.txt" ));
        } catch (FileNotFoundException e) {
            System.out.println("couldnt open da file");
        }
        String line = null;
        try {
            line = reader.readLine();
            
        } catch (IOException e) {
            System.out.println("couldnt readline");
        }
        int count = -1;
        
        
        
        while (line != null) {
        	
        	if(line.length()>count) {
        		count=line.length();
        	}
//        		System.out.println(line);
        		
        		//HashTables.insert(line);
      	      	String oldline= line;
        	
        		//System.out.println(multiply(d,e));
            try {
                line = reader.readLine();
            } catch (IOException e) {
                System.out.println("couldnt readline");
            }
            if(line == null)
            	break;
            
            count++;
//            System.out.println(" ");
            System.out.print(oldline + "  *   ");
            System.out.println(line+ "  =");
//            //System.out.println(" ");
            hash.multiplyPoly( oldline, line  );
            hash.print();
//            System.out.println(" ");
        }
        
        try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        
        
     
        
        
      


        
        
        
        

      
       
	
	}




	
	
	
	
}
