import java.util.ArrayList;
import java.util.Scanner;

class PreparationRecord {
    String problemName;
    String platform;
    String difficulty;
    String status;

    public PreparationRecord(String problemName, String platform, String difficulty, String status) {
        this.problemName = problemName;
        this.platform = platform;
        this.difficulty = difficulty;
        this.status = status;
    }

    public void displayRecord() {
        System.out.println("Problem Name : " + problemName);
        System.out.println("Platform     : " + platform);
        System.out.println("Difficulty   : " + difficulty);
        System.out.println("Status       : " + status);
        System.out.println("-----------------------------------");
    }
}

public class Main {

    static ArrayList<PreparationRecord> records = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== Placement Preparation Tracker =====");
            System.out.println("1. Add Record");
            System.out.println("2. View Records");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addRecord();
                    break;

                case 2:
                    viewRecords();
                    break;

                case 3:
                    System.out.println("Exiting Application...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);
    }

    public static void addRecord() {

        System.out.print("Enter Problem Name: ");
        String problemName = sc.nextLine();

        System.out.print("Enter Platform (LeetCode/CodeChef): ");
        String platform = sc.nextLine();

        System.out.print("Enter Difficulty (Easy/Medium/Hard): ");
        String difficulty = sc.nextLine();

        System.out.print("Enter Status (Solved/Unsolved): ");
        String status = sc.nextLine();

        PreparationRecord record =
                new PreparationRecord(problemName, platform, difficulty, status);

        records.add(record);

        System.out.println("Record Added Successfully!");
    }

    public static void viewRecords() {

        if (records.isEmpty()) {
            System.out.println("No Records Found!");
            return;
        }

        System.out.println("\n===== Preparation Records =====");

        for (PreparationRecord record : records) {
            record.displayRecord();
        }
    }
}
