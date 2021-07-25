import java.util.ArrayList;
import java.util.LinkedList;

public class HashTables {
	private int size=8;
	private static Integer[] t1;
	private static Integer[] t2;
	
	public HashTables() {
		//int size=10;
		this(10);
	}
	
	public HashTables(int cap){
	
		t1 = new Integer[cap];
		t2 = new Integer[cap];
		int size=cap;
		
	}
	

	//as the name suggest and i hated this one the most
	public void insert(int key, Integer value) {
		int i1 = h1(key);
		
		/* We have a collision, h1(key) gives a used location */
		if (t1[i1] != null) {
			int i2 = h2(key);
			/* Key already present, do nothing */
			if (t2[i2] != null) {
				return;
			}
			
			/* Place in second table */
			t2[i2] = value;
		}
		
		/* First is empty, place it in here */
		else {
			t1[i1] = value;
		}
	}
	
	

	
	public int h1(int key) {
		return key % size;
	}
	
	public int h2(int key) {
		//System.out.println("size is " + size);
		return (key*key) % size;
	}
	
	//not too bad 
	public boolean search(int key) {
		int i2 = h2(key);
		if (t2[i2] != null) {
			return true;
		}else {
			int i1 = h1(key);
			return t1[i1] != null;
		}
	}
	//delete easy
	public Integer delete(int key) {
		if (!search(key)) {
			return null;
		}else {
			int i2 = h2(key);
			if (t2[i2] != null) {
				Integer out = t2[i2];
				t2[i2] = null;
				return out;
			}else {
				int i1 = h1(key);
				Integer out = t1[i1];
				t1[i1] = null;
				return out;
			}
			
		}
	}
	//multiply dem polynoms
	public  void multiplyPoly( String s1, String s2){
		
		int [] p1= format(s1);
		int [] p2= format(s2);
		
		int p1exps[] = power(p1);
        int p1coes[] = coeff(p1);
        
        //String s2
        int p2exps[] = power(p2);
        int p2coes[] =  coeff(p2);
        //System.out.println("the size in the beginnign is "+ size);
        HashTables table = new HashTables();
        //for each term in p1
        for (int i = 0; i < p1exps.length; i++) {
            
            int p1exp = p1exps[i]; //take the exponent of p1
            
            //for each term in p2
            for (int j = 0; j < p2exps.length; j++) {
                
                int p2exp = p2exps[j]; //take the exp of p2 
                
                int newExp = p1exp + p2exp; //multiple to get new exp
                
                // The table has that exp meaning it has coeffcient
                if (table.search(newExp)) {
                    Integer oldCoe = table.delete(newExp);
                    Integer newCoe = oldCoe + (p1coes[i] * p2coes[j]);
                    table.insert(newExp, newCoe);
                }else {
                    Integer newCoe = (p1coes[i] * p2coes[j]);
                    table.insert(newExp, newCoe);
                }
            }
        }
		
//		String s3="";
//		return s3;

	}
	//gets the coefficisnts 
	public  int[] coeff(int[] m ) {
		int coe[] = new int[ (m.length/2 )];
		for(int i=0;i<coe.length;i++) {
			coe[i]=m[i*2];
			//System.out.print(coe[i]);
		}
		//System.out.println("");
		return coe;
	}
	
	//gets the power of exponents
	public  int[] power(int[] m ) {
		int exp[] = new int[ (m.length/2 )];
		for(int i=0;i<exp.length;i++) {
			exp[i]=m[i*2+1];
			//System.out.print(exp[i]);
		}
		//System.out.println("");
		return exp;
	}
	
	

	
//	public ArrayList<Integer> keySet(){
//		ArrayList<Integer> output = new ArrayList<Integer>();
//		for (int i = size-1; i >= 0; i--) {
//			if (search(i)) {
//				output.add(i);
//			}
//		}
//		return output;
//	}
	
	public void print() {
		String s="";
		for (int i = 0; i < size; i++) {
			if (t1[i] != null) {
				//System.out.println("exp^"+i+": coe "+t1[i]);
				
				s+= t1[i] + "x^" + i + "+"  ;
				//System.out.print(" "+t1[i] + "x^" + i + "+"  );
				
				
				
			}
			
		}
		s=s.substring(0,s.length()-1);
		s=s.replace("+-", "-");
		s=s.replace("x^0", "");
		s=s.replace("x^1", "x");
		s=s.replace("+", " +");
		s=s.replace("-", " -");
		s=s.replace("+0x", "+x");
		
		System.out.println(s);
		System.out.println("-----------");
		System.out.println();
		
		System.out.println();
	}

	
	
	public  int[] format( String s1){
		int []ree= new int[2];
		if(s1.length()==1) {
			ree[0]=Integer.parseInt(s1);
			ree[1]=0;
//			System.out.println(ree[0] +""+ree[1]);
//			System.out.println("");
			return  ree;
		}
		
		String f1=""; 
		f1=s1.replace("-","+-");
	    f1=f1.replaceAll("[a-z]","x");
	    f1=f1.replace("x+","x^1+");
//	    System.out.println(f1);
//	    System.out.println("---------");
	    
	    if((f1.substring(f1.length()-1).equals("x"))){
	        f1+="^1";
	        //System.out.println(f1);
	      }
		
	    if(f1.length()>=2 && !(f1.substring(f1.length()-2,f1.length()-1).equals("^"))){
	    	f1+="x^0";
	    	//System.out.println("true");
//	        for(int i=f1.length()-1;i>=0;i--){
//	            if(f1.substring(i,i+1).equals("+")){
//	              f1+="x^0";
//	              //System.out.println(f1);
//	              break;
//	            }
//	        }
	    }
//	    System.out.println("-------------------");
	    //System.out.println(f1);
	    f1=f1.replace("x^","  ");
	    //f1=f1.replace("+-","  ");
	    f1=f1.replace("+","  ");
	    //System.out.println(f1);
	    
	    String[] arr = wordList(f1);
	    
	    int[] arr1 = new int[(arr.length+1)/2];
	    int count =0;
	    
	      for(int i=0;i<arr.length;i++){
	          
	          if(i%2==0 && !arr[i].equals("")){
	            //System.out.println(arr[i] + "-----"  +i);
	            arr1[count]=Integer.parseInt(arr[i]);
	            count++;
	          }
	        }
	      
	      if(arr1[arr1.length-1]==0 && arr1[arr1.length-2]==0){
	          int []k1=new int[arr1.length-1];
	          for(int i=0;i<k1.length;i++){
	            k1[i]=arr1[i];
//	            System.out.print(k1[i]);
	          }
	          arr1=k1;
	        }
	     
//	      for(int i=0;i<arr1.length;i++){
//	          System.out.print(arr1[i]);
//	        }      
//	      System.out.print("  x  ");
	      
	      
	      
		return arr1;
	}
	
	public  String[] wordList(String line){
	        return line.split(" ");
	}
	
}

