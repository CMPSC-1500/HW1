import java.util.Scanner;

public class ThisIsCamelCase {

    public static void main (String [] args)
    {
        String fileName;
        String[] characters = { "BunRun", "Zombie", "Boston", "Spartan", "Mud" };

        Scanner stdIn = new Scanner(System.in);

        fileName = stdIn.nextLine();

                if(fileName.contains(characters[0]) && !fileName.contains(characters[1]) && !fileName.contains(characters[2]) && !fileName.contains(characters[3]) && !fileName.contains(characters[4]))
                {
                    System.out.println(fileName);

                }

                else if(fileName.contains(characters[1]) && !fileName.contains(characters[2]) && !fileName.contains(characters[3]) && !fileName.contains(characters[4]) && !fileName.contains(characters[0]))
                {
                 System.out.println(fileName);

                }
                else if(fileName.contains(characters[2]) && !fileName.contains(characters[3]) && !fileName.contains(characters[4]) && !fileName.contains(characters[0]) && !fileName.contains(characters[1]))
                {
                    System.out.println(fileName);

                }
                else if(fileName.contains(characters[3]) && !fileName.contains(characters[4]) && !fileName.contains(characters[0]) && !fileName.contains(characters[1]) && !fileName.contains(characters[2]))
                {
                    System.out.println(fileName);

                }
                else if(fileName.contains(characters[4]) && !fileName.contains(characters[0]) && !fileName.contains(characters[1]) && !fileName.contains(characters[2]) && !fileName.contains(characters[3]))
                {
                    System.out.println(fileName);

                }
                else
                {
                    System.out.println("no file found");

                }
    }


}
