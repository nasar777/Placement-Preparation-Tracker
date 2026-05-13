import java.util.ArrayList;
import java.util.Scanner;

public class TrackerService {

    ArrayList<PreparationRecord> records = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addRecord() {

        System.out.print("Enter Problem Name: ");
        String problemName = sc.nextLine();

        System.out.print("Enter Platform: ");
        String platform = sc.nextLine();

        System.out.print("Enter Difficulty: ");
        String difficulty = sc.nextLine();

        System.out.print("Enter Status: ");
        String status = sc.nextLine();

        PreparationRecord record =
                new PreparationRecord(problemName, platform, difficulty, status);

        records.add(record);

        System.out.println("Record Added Successfully!");
    }

    public void viewRecords() {

        if (records.isEmpty()) {
            System.out.println("No Records Found!");
            return;
        }

        System.out.println("\n===== Preparation Records =====");

        for (PreparationRecord record : records) {
            record.displayRecord();
        }
    }

    public void deleteRecord() {

        System.out.print("Enter Problem Name to Delete: ");
        String name = sc.nextLine();

        boolean found = false;

        for (PreparationRecord record : records) {

            if (record.problemName.equalsIgnoreCase(name)) {
                records.remove(record);
                found = true;
                System.out.println("Record Deleted Successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Record Not Found!");
        }
    }
}
