import java.util.Scanner;

public class OddevenNumber
{
   static int number = 5;
    public static void main(String[] args) {
        System.out.println("Enter a number + =");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        String oddeven = (number % 2 == 0) ? "even" : "odd";
        System.out.println(number + " is "+oddeven);
    }
}
