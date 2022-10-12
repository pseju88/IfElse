import java.util.Scanner;

public class salesCommission
{
    static int salesID;
    static int salesamount;
    static int salarybasic;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//Scanner object
        System.out.println("Enter sales Id: ");
        salesID = scanner.nextInt();// declared variable

        Scanner scanner1 = new Scanner(System.in);//Scanner object
        System.out.println("Enter seller Name : ");
        String Name = scanner1.next();// declared variable

        Scanner scanner2 = new Scanner(System.in);//Scanner object
        System.out.println("Enter sales amount: ");
        salesamount  = scanner2.nextInt();// declared variable

        Scanner scanner3 = new Scanner(System.in);//Scanner object
        System.out.println("Enter salary basic: ");
        salarybasic = scanner3.nextInt();// declared variable




        System.out.println(Name + " salesID = " + salesID + " sales amount = " + salesamount + " salary basic = " + salarybasic);

        if (salesamount >= 50000) {

            System.out.println(35 + " % ");
        } else if (salesamount >= 30000) {
            System.out.println(20 + " % ");
        } else if (salesamount >= 20000) {
            System.out.println(10 + " % ");
        } else if (salesamount >= 10000) {
            System.out.println(5 + " 5 ");
        } else if (salesamount < 10000) {
            System.out.println(2 + " % ");

        }

    }

}
