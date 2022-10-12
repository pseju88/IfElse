import java.util.Scanner;

public class InterchangedNumber {
    public static void main(String[] args) {
        int a, b, c;// a and b are to swap
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of X and Y");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("before swapping numbers: "+a +"  "+ b);
        /*swapping */
        c = a;
        a = b;
        b = c;
        System.out.println("After swapping: "+a +"   " + b);
        System.out.println( );
    }
}

