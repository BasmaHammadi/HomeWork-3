import java.util.Scanner;
@SuppressWarnings("ALL")
public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter integer number: ");
        int num = in.nextInt();
        if (num < 0)
            num = num * -1;
            if (num>=0 && num<=9)
                System.out.println("The digits of number " + num + " is 1.");
            else if (num>=10 && num<=99)
                System.out.println("The digits of number " + num + " is 2.");
            else if (num>=100 && num<=999)
                System.out.println("The digits of number " + num + " is 3.");
            else if (num>=1000 && num<=9999)
                System.out.println("The digits of number " + num + " is 4.");
            else if (num>=10000 && num<=99999)
                System.out.println("The digits of number " + num + " is 5.");
            else if (num>=100000 && num<=999999)
                System.out.println("The digits of number " + num + " is 6.");
            else if (num>=1000000 && num<=9999999)
                System.out.println("The digits of number " + num + " is 7.");
            else if (num>=10000000 && num<=99999999)
                System.out.println("The digits of number " + num + " is 8.");
            else if (num>=100000000 && num<=999999999)
                System.out.println("The digits of number " + num + " is 9.");
            else System.out.println("MORE THAN BELLION!");
    }
}