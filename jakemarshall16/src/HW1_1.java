import java.util.Scanner;

public class HW1_1 {
    public static void main(String args[]) {


        int totalfiles;
        String fileName;
        Scanner userInput = new Scanner(System.in);
        totalfiles = userInput.nextInt();
        userInput.nextLine();
        for(int i = 0; i < totalfiles; i = i + 1)
        {
            int totalFound = 0;
            fileName = userInput.nextLine();
            if (fileName.contains("Mud"))
            {
                totalFound = totalFound + 1;
            }
            if (fileName.contains("BunRun"))
            {
                totalFound = totalFound + 1;
            }
            if (fileName.contains("Zombie"))
            {
                totalFound = totalFound + 1;
            }
            if (fileName.contains("Boston"))
            {
                totalFound = totalFound + 1;
            }
            if (fileName.contains("Spartan"))
            {
                totalFound = totalFound + 1;

            }
            {
                if (totalFound == 1)
                {
                    System.out.println(fileName);
                }
            }
        }
//Working through this in class was super helpful
    }
}
