import java.util.Scanner;
public class Alphabet
{
	public static void main(String[] args) {
 
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Characters :");
        char a = s.next().charAt(0);
        if((a>='A'&&a<='Z')||(a>='a'&&a<='z'))
        {
            System.out.println("The Character is ALPHABET");
        }
        else
        {
            System.out.println("The Character is Not ALPHABET");
        }
    }
	
}
