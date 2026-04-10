import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Vehicle Parking System ===");

        System.out.print("Enter Vehicle Number: ");
        String vehicleNo = sc.next();

        System.out.print("Enter Entry Time (hour): ");
        int entry = sc.nextInt();

        System.out.print("Enter Exit Time (hour): ");
        int exit = sc.nextInt();

        int hours = exit - entry;
        if (hours < 0) {
            System.out.println("Invalid Time!");
        } else {
            int fee = hours * 20; // ₹20 per hour

            System.out.println("\n--- Parking Details ---");
            System.out.println("Vehicle No: " + vehicleNo);
            System.out.println("Parking Duration: " + hours + " hours");
            System.out.println("Parking Fee: ₹" + fee);
        }

        sc.close();
    }
}