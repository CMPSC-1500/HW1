//This ran at one point but now it won't open as a java file (at least on my computer) we had this problem before//

import java.util.Scanner;

public class Problem1 {
    public static void main(String args[]) {

        int AmountOfFiles;
        String fileName;

        Scanner input = new Scanner(System.in);
        AmountOfFiles = input.nextInt();

        input.nextLine(); // get rid of remaining line after the number

//loop through a list of files
        for(int i = 0; i < AmountOfFiles; i = i + 1)
        {
            int StringsFound = 0;

            fileName = input.nextLine();
//test how many of the strings are in the file name

            if (fileName.contains("Spartan"))
            {
                StringsFound = StringsFound + 1;
            }
            if (fileName.contains("BunRun"))
            {
                StringsFound = StringsFound + 1;
            }
            if (fileName.contains("Boston"))
            {
                StringsFound = StringsFound + 1;
            }
            if (fileName.contains("Zombie"))
            {
                StringsFound = StringsFound + 1;
            }
            if (fileName.contains("Mud"))
            {
                StringsFound = StringsFound + 1;

            }


// if exactly one of them is
            {
                if (StringsFound == 1)
                {
                    System.out.println(fileName);
                }
//print out the strings
            }
        }

    }
}
// I WORKED ON THIS WITH ALEX, SHANE, AND JACOB