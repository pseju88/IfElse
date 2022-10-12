import java.util.Scanner;

public class PositiveNegativeZeroNumber {
    public static void main(String[] args)
    {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        //checks the number is Grater than 0 or not
        if(number>0)
        {
            System.out.println("The number is positive.");
        }
//checks the number is less than 0 or not
        else if(number<0)
        {
            System.out.println("The number is negative.");
        }
//executes when the above two conditions return false
        else
        {
            System.out.println("The number is zero.");
        }
    }
}

