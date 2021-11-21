import java.util.Scanner;
public class ifLetterOrNumber {
public static void main (String []args) {
	

	  char ch;
      Scanner scan = new Scanner(System.in);
		
      System.out.print("Enter a Character : ");
      ch = scan.next().charAt(0);
		
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
      {
          System.out.print(ch + " is a Vowel");
      }
      else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
      {
          System.out.print(ch + " is a Vowel");
      }
      else if((ch>=97 && ch<=122) || (ch>=65 && ch<=90))
      {
          System.out.print(ch + " is a Consonant");
      }
      else if ((ch>=48) && (ch<=57))
      {
          System.out.print(ch + " is a Number");
      }
      else 
      {
          System.out.print(ch + " is a Special Character");
      }
  }


}	




