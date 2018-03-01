import java.util.Scanner;

public class LabHW1_1 {
    public static void main(String[] args)
    {
        //Scans the file and processes the number at the beginning of every file
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        Integer numFiles = Integer.parseInt(line);
        //Goes through the files based on the initial number
        for(int x = 0; x < numFiles; x++)
        {
            //Resets counter to 0
            int counter = 0;
            //Has scanner go to next line
            line = scan.nextLine();
            //The contains() function checks if the string contains the specified string of characters
            if(line.contains("BunRun"))
            {
                counter = counter + 1;
            }

            if(line.contains("Zombie"))
            {
                counter = counter + 1;
            }

            if(line.contains("Boston"))
            {
                counter = counter + 1;
            }

            if(line.contains("Spartan"))
            {
                counter = counter + 1;
            }

            if(line.contains("Mud"))
            {
                counter = counter + 1;
            }
            //I only want to display files that have only one of the specified words
            if(counter == 1)
            {
                System.out.println(line);
            }
        }
    }
}
