import java.util.Scanner;

public class LabHW1_3
{
    public static void main(String[] args)
    {
        //Scans the number at the beginning of each file
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        Integer numNames = Integer.parseInt(line);

        //I'll take 1 away from numNames (or the number at the beginning of the file) after each username generated
        while(numNames != 0)
        {
            //Resets my username to nothing and scans both the first and last name
            String user = "";
            String fName = scan.next();
            String lName = scan.next();
            //Counter to be used in next loop to count how many characters are in the username currently
            int counter = 0;
            //Adds a character in order of the input and is either as long as the name or only the first 7 characters
            for(int y = 0; y < fName.length() && y <= 7; y++)
            {
                user = user + fName.charAt(y);
                counter = counter + 1;
            }
            //Has same purpose as the first loop, except this loop is for last names
            //Makes sure that
            for(int z = 0; z < (8 - counter) && z < lName.length(); z++)
            {
                user = user + lName.charAt(z);
            }

            System.out.println(user);
            numNames = numNames - 1;
        }
    }
}
