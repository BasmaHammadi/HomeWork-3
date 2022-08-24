import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter integer number: ");
        int num =in.nextInt();
        if (num<0)
            System.out.println(num+" is negative.");
        else if (num==0)
            System.out.println(num+" is zero.");
       else
            System.out.println(num+" is positive.");
    }
}