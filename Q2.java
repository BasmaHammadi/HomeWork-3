import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.print("Enter letter and number of the square on a chess board: (such as g5)\nNumber: ");
        Scanner in = new Scanner(System.in);
        int number =in.nextInt();
        System.out.print("Letter: ");
        String letter=in.next();
        if(letter.equals("a") || letter.equals("c") || letter.equals("e") || letter.equals("g"))
        {   if (number%2==1)
            System.out.println("* Black *");
        else
            System.out.println("* White *");
        }
        else
        {   if (number%2==0)
            System.out.println("* Black *");
        else
            System.out.println("* White *");
        }
    }
}
