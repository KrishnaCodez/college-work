import java.util.Scanner;

public class P1_1_MobileNumberParser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mobile number format like this: +91-AA-BBB-CCCCC:");
        
        String getNumber = scanner.nextLine();
        String[] parts = getNumber.split("-");

        System.out.println("Mobile system operator code is: " + parts[1]);
        System.out.println("MSC is: " + parts[2]);
        System.out.println("Unique code is: " + parts[3]);

        scanner.close();
    }
}