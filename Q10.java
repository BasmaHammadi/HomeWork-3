import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of the month: ");
        int month = in.nextInt();
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 days.");
            case 4, 6, 9, 11 -> System.out.println("30 days.");
            case 2 -> System.out.println("28 or 29 days.");
            default -> System.out.println(month + " is wrong month.");
        }
    }
}