import javax.swing.JOptionPane;

public class Project0 {

	public static void main(String[] args) {
		
		String s = JOptionPane.showInputDialog("Please enter a sentence");
		
		while(s != "stop") {
			
			if(s.equals("stop")) {
				break;
			}
			
			int x = 0;
			int lower = 0;
			int upper = 0;
			
			while(x<s.length()){
				if(s.charAt(x) == 'e') {
					lower++;
				}
				if(s.charAt(x) == 'E') {
					upper++;
				}
				x++;
			}
			JOptionPane.showMessageDialog(null, "Number of lower case e's: "+ lower+ "\n" + "Number of upper case E's: " + upper );
			
			s = JOptionPane.showInputDialog("Please enter a sentence");
		}

		
		
		
	}
}