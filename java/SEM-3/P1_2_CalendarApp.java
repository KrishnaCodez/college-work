import java.util.Scanner;

public class P1_2_CalendarApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month(1-12): ");
        int month = scanner.nextInt();
        System.out.println("Enter the year");
        int year = scanner.nextInt();

        int[] daysInMonths = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (isLeapYear(year)) {
            daysInMonths[1] = 29;
        }

        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int day = 1; day <= daysInMonths[month - 1]; day++) {
            System.out.printf("%3d", day);
            if (day % 7 == 0) {
                System.out.println();
            }
        }

        scanner.close();
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
