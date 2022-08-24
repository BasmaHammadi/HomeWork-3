import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter integer number:\nnumber1: ");
        int num1 = in.nextInt();
        System.out.print("number2: ");
        int num2 = in.nextInt();
        System.out.print("number3: ");
        int num3 = in.nextInt();
        System.out.print(num1+" "+num2+" "+num3+" ");
        if (num1>=num2&&num2>=num3 || num1<=num2&&num2<=num3)
            System.out.println("in order.");
        else
            System.out.println("not in order.");
    }
}
