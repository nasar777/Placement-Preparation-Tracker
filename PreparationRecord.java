public class PreparationRecord {

    String problemName;
    String platform;
    String difficulty;
    String status;

    public PreparationRecord(String problemName, String platform,
                             String difficulty, String status) {

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
