import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        int month, day;
        System.out.print("Enter the number of the month: ");
        Scanner in = new Scanner(System.in);
        month = in.nextInt();
        if (month > 12 || month < 1)
            System.out.println(month + " is wrong month.");
        else {
            System.out.print("Enter the number of the the day: ");
            day = in.nextInt();
            if (day > 31)
                System.out.println(day + " is wrong day.");
            else {
                String season;
                if (month == 1 || month == 2 || month == 3)
                    season = "Winter";
                else if (month == 4 || month == 5 || month == 6)
                    season = "Spring";
                else if (month == 7 || month == 8 || month == 9)
                    season = "Summer";
                else
                    season = "Fall";

                if (month % 3 == 0 && day >= 21) {
                    season = switch (season) {
                        case "Winter" -> "Spring";
                        case "Spring" -> "Summer";
                        case "Summer" -> "Fall";
                        default -> "Winter";
                    };
                }
                System.out.println("The season is " + season);
            }
        }
    }
}