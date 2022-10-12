import java.util.Scanner;

public class Cityname {
    static char e = 'Z'; // e represent character

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Data (a , b , c , d , e , f ): ");
        char e = scanner.next() . charAt(0); //charAT present string
        switch (e)
        {
            case 'a':
                System.out.println( " Acton ");
                break;
            case 'b':
                System.out.println( " Barking ");
                break;
            case 'c':
                System.out.println( " Crawley ");
                break;
            case 'd':
                System.out.println( " Dagenham ");
                break;
            case 'e':
                System.out.println( " Edinburgh ");
                break;
            case 'f':
                System.out.println( " Fair Oak ");
                break;
            default:
                System.out.println( " Invalid Entry " + " please choose valid data from Given data");
        }

    }

}
