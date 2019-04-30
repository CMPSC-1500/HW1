import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        String raceNameArray[] = {"BunRun", "Zombie", "Boston", "Spartan", "Mud"};
        Scanner s = new Scanner(System.in);
        System.out.println("Input Files to be scanned:");
        int numberOfFiles = s.nextInt();
        String[] filesList = new String[numberOfFiles];
        for (int i = 0; i < numberOfFiles; i++) {
            filesList[i] = s.next();
        }
        public static String(String[]args);
        {
            int numberOfRaceNames = 0;
            for (int j = 0; j < numberOfFiles; j++) {
                String name = filesList[j];
                for (int k = 0; k < raceNameArray.length; k++) {
                    if (name.contains(raceNameArray[k])) {
                        numberOfRaceNames++;
                    }
                    if (numberOfRaceNames == 1) {
                        System.out.println(filesList[j]);
                    }
                }
            }
        }
    }
}