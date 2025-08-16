import java.util.Scanner;
import java.time.LocalDate;
import java.time.DayOfWeek;

public class DayOfWeekFinder {
    
    // Method to calculate the day of the week
    public static String getDayOfWeek(int day, int month, int year) {
        // Create a LocalDate object from the input
        LocalDate date = LocalDate.of(year, month, day);
        // Get the day of the week
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        // Return the name of the day
        return dayOfWeek.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input day, month, and year
        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Get the day of the week using the method
        String dayOfWeek = getDayOfWeek(day, month, year);

        // Print the result
        System.out.println("The day of the week is: " + dayOfWeek);

        scanner.close();
    }
}

