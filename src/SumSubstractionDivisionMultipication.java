import java.util.Scanner;

public class SumSubstractionDivisionMultipication {


        public static void main (String args[]){
            char ch;
            Scanner scanner=new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int num1 =scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2=scanner.nextInt();
            System.out.print("Enter the operator you want(+, -, *, /) :");
            ch=scanner.next().charAt(0);
            switch (ch) {
                case '+' -> System.out.println("\nAddition of " + num1 + "+" + num2 + " = " + (num1 + num2));
                case '-' -> System.out.println("Substraction of " + num1 + "-" + num2 + " = " + (num1 - num2));
                case '*' -> System.out.println("Multiplication of " + num1 + "x" + num2 + " = " + (num1 * num2));
                case '/' -> System.out.print("Division of " + num1 + "/" + num2 + " = " + (num1 / num2));
                default -> System.out.print("Operator is not available");
            }
        }
    }
