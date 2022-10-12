import java.util.Scanner;

public class AlphabetvowelorConsonant
{
    public static void main(String[ ] arg)
    {
        int a=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch=scanner.next( ).charAt(0);
        //char ch=sc.nextChar();
        switch(ch)
        {
            case  'a' :
            case 'e'  :
            case 'i'   :
            case 'o'  :
            case 'u'  :
            case  'A' :
            case 'E'  :
            case 'I'   :
            case 'O'  :
            case 'U'  :a++;
        }
        if(a==1)
            System.out.println("Entered character "+ch+" is  Vowel");
        else
        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            System.out.println("Entered character "+ch+" is Consonent");
        else
            System.out.println("Not an alphabet");
    }
}
