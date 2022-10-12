import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
       // year to be checked
        int year;
        System.out.println("Enter a year + =");
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
       // if year is divided by 4
       // then it is a leap year
        switch (year % 4) {
            case 0 -> System.out.println("Year is leap year");
            default -> System.out.println("Year is not a leap year");
        }
    }
}