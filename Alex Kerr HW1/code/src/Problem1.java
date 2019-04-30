import java.io.IOException;
import java.util.Scanner;

/* I helped Dustin and skyler after  was done with my code and they were just starting
 because they had no clue where to start.*/
/* i also talked to the guy behind me, i dont know his name though,  before class on monday the 19th just trying to help his program to run because it was stuck because in his while loop he
he wasnt changing his test varible at all*/

public class Problem1
{
    public static void main(String[] args) throws IOException
    {

        int BunRun = 0;
        int Zombie = 0;
        int Boston = 0;
        int Spartan = 0;
        int Mud = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("how many file names are you going to enter? ");
        Integer killNumber = Integer.parseInt(input.nextLine());
        for(int toKill = 0; toKill < killNumber; toKill++)
        {
//i just talked to dustin and he now has a test that looks like mine, i did not just let him copy mine or show him mine at all, but he
            // came up on the stuff on his own but with a little help
            System.out.println("Please enter the next file name you want to test.");
            String fileName = input.nextLine();
            if(fileName.contains("BunRun") && ! fileName.contains("Zombie") && !fileName.contains("Boston") && !fileName.contains("Spartan") && !fileName.contains("Mud"))
            {
                BunRun++;
                System.out.println("yes this file: " + fileName + " was a BunRun run.");
            }
            else if(fileName.contains("Zombie") && ! fileName.contains("BunRun") && !fileName.contains("Boston") && !fileName.contains("Spartan") && !fileName.contains("Mud"))
            {
                Zombie++;
                System.out.println("yes this file: " + fileName + " was a Zombie run.");
            }
            else if(fileName.contains("Boston") && ! fileName.contains("BunRun") && !fileName.contains("Zombie") && !fileName.contains("Spartan") && !fileName.contains("Mud"))
            {
                Boston++;
                System.out.println("yes this file: " + fileName + " was a Boston run.");
            }
            else if(fileName.contains("Spartan") && ! fileName.contains("BunRun") && !fileName.contains("Boston") && !fileName.contains("Zombie") && !fileName.contains("Mud"))
            {
                Spartan++;
                System.out.println("yes this file: " + fileName + " was a Spartan run.");
            }
            else if(fileName.contains("Mud") && ! fileName.contains("BunRun") && !fileName.contains("Boston") && !fileName.contains("Spartan") && !fileName.contains("Zombie"))
            {
                Mud++;
                System.out.println("yes this file: " + fileName + " was a Mud run.");
            }
            /*else if(fileName.contains("done"))
            {
                toKill++;
                System.out.println("There was a total number of these runs.");
                System.out.println("BunRun: " + BunRun);
                System.out.println("Zombie: " + Zombie);
                System.out.println("Boston: " + Boston);
                System.out.println("Spartan: " + Spartan);
                System.out.println("Mud: " + Mud);
            }*/
            else
            {
                System.out.println("ERROR, file name did not contain any of these runs. Please try again");
            }


        }
        System.out.println("There was a total number of these runs.");
        System.out.println("BunRun: " + BunRun);
        System.out.println("Zombie: " + Zombie);
        System.out.println("Boston: " + Boston);
        System.out.println("Spartan: " + Spartan);
        System.out.println("Mud: " + Mud);








    }
}
