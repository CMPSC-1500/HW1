import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args)
    {
        int numberOfFiles;
        String fileName;


        Scanner input = new Scanner(System.in);
        numberOfFiles = input.nextInt();

        input.nextLine();
        // get rid of remaining line after the number

        //loop through a list of files
        for( int i = 0; i < numberOfFiles; i = i + 1)
        {
            fileName = input.nextLine();

            int numberOfStringsFound = 0;
            //test how many of the files are in the file name
            if ( fileName.contains("Mud") )
            {
                numberOfStringsFound = numberOfStringsFound +1;
            }
            if ( fileName.contains("Boston") )
            {
                numberOfStringsFound = numberOfStringsFound + 1;

            }
            if ( fileName.contains("Spartan") )
            {
                numberOfStringsFound = numberOfStringsFound + 1;
            }
            if ( fileName.contains("Zombie") )
            {
                numberOfStringsFound = numberOfStringsFound + 1;
            }
            if ( fileName.contains("BunRun") )
            {
                numberOfStringsFound = numberOfStringsFound + 1;
            }
            //if exactly one of them is
            if (numberOfStringsFound == 1 )
            {

                System.out.println(fileName);
            }
        }
    }
}
