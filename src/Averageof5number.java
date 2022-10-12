import java.util.Scanner;

public class Averageof5number {
    public static void main(String[] args) {
        int a, n = 0, s = 0;
        double avg;
        {
            System.out.println("Input the 5 numbers :==");
        }
    for (a=0;a<5;a++)
    {
        Scanner in = new Scanner(System.in);
        n= in.nextInt();
        s +=n;
    }
    avg=s/5;
        System.out.println("The sum of 5 no is : " +s+"\nTheAverage is :" +avg);
    }

}