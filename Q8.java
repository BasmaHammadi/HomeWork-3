import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name of employee: ");
        String name = in.nextLine();
        System.out.print("the salary (in the hour)  :  ");
        int salary = in.nextInt();
        double hourWage=9.25, weekWage;
        System.out.print("How many hours the employee worked in the past week: ");
        double NOHour = in.nextDouble();
        if(NOHour<=40)
           weekWage = (NOHour * hourWage);
        else {
            double overTime=NOHour-40;
            weekWage=(40*9.25)+overTime*9.25*1.5;
        }
        System.out.println(name+" your week wage is "+weekWage);

    }
}
