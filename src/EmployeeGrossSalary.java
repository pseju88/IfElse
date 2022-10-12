import java.util.Scanner;

public class EmployeeGrossSalary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//Scanner object
        System.out.println("Enter Employee ID");
        int id = scanner.nextInt();// declared variable

        System.out.println("Enter Employee Name ");
        String name = scanner.next();// declared variable

        System.out.println("Enter Basic salary ");
        double salary = scanner.nextInt();// declared variable

        double HRA=salary*10/100;// declared HRA salary
        double DA=salary*8/100;// declared Da salary
        double Ta=salary*9/100;//declared Ta salary
        double Pf=salary*250/100;//declare Pf salary
        double GrossSalary=salary+HRA+DA+Ta+Pf;//Doing total of salary
        System.out.println("Gross Salary" + GrossSalary);



    }
}
