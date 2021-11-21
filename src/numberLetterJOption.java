import javax.swing.*;
public class numberLetterJOption {
public static void main (String []args) {
	
	String con,vow,num,spe,a;
	
	a = "You input ";
	
	con=" and that is a Consonant";
	vow=" and that  is a Vowel";
	num=" and that  is a number";
	spe=" and that  is a Special Character";
	
	 {String de=JOptionPane.showInputDialog(null,"Enter a Character","Determine",JOptionPane.QUESTION_MESSAGE);
	    char ch=de.charAt(0);
	    
	    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
	    {
	                JOptionPane.showMessageDialog(null,a+ch+vow, "Press OK to out",JOptionPane.INFORMATION_MESSAGE);
	             
	            
	    }
	            else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
	            {
	                JOptionPane.showMessageDialog(null,a+ch+vow,"Press OK to out",JOptionPane.INFORMATION_MESSAGE);
	               
	            }
	            else if ((ch>=97 && ch<=122) || (ch>=65 && ch<=90))
	            {
	                JOptionPane.showMessageDialog(null,a+ch+con,"Press OK to out",JOptionPane.INFORMATION_MESSAGE);
	               
	            }
	            else if ((ch>=48) && (ch<=57))
	            {
	                JOptionPane.showMessageDialog(null,a+ch+num,"Press OK to out",JOptionPane.INFORMATION_MESSAGE);
	               
	            }
	            else
	            {
	                JOptionPane.showMessageDialog(null,a+ch+spe,"Press OK to out",JOptionPane.ERROR_MESSAGE);
	               
	            }
	    
	
	
}

}
}
