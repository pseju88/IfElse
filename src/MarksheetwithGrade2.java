import java.util.Scanner;

public class MarksheetwithGrade2 {
    static String name;
    static int RollNo;
    static double total;
    static double percentage;
    static double Accontancy, Econonic, English;

    public static void main(String[] args) {

        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name");
            name = scanner.next();
            System.out.println("Enter RollNO");
            RollNo = scanner.nextInt();
            System.out.println("Enter Accountancy Marks");
            Accontancy = scanner.nextInt();
            System.out.println("Enter Economic Marks");
            Econonic = scanner.nextInt();
            System.out.println("Enter English Marks");
            English = scanner.nextInt();
            {
                double total = (Accontancy + Econonic + English);
                double percentage = total / 300.0 * 100;
                System.out.println(name + "Rollnumber=" + RollNo + "Total marks =" + total + " =" + " percentage = " + percentage + "%");
                if (Accontancy < 35 || Econonic < 35 || English < 35) {
                    System.out.println(" Sorry to say you are failed");
                }
                else
                    if (percentage >= 80) {
                        System.out.println(" you Passed with A+ Grade");
                    } else if (percentage >= 60) {
                        System.out.println("you Passed with A Grade");
                    } else if (percentage >= 50) {
                        System.out.println("you Passed with B Grade");
                    } else if (percentage >= 35) {
                        System.out.println("you Passed with C Grade");
                    }
                }
            }
        }
    }

