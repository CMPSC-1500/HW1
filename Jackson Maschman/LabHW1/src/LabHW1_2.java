import java.util.Scanner;

public class LabHW1_2
{
    public static void main(String[] args)
    {
        //Scans the number line
        Scanner scan = new Scanner(System.in);

        //Goes to the next number in the line
        int Number = scan.nextInt();
        //Sorts the 1's, 2's, 3's (3's are Groups) and extra students
        int num1 = 0;
        int num2 = 0;
        int Groups = 0;
        int Empty = 0;
        int Extra = 0;
        //Will end once the program reaches the 0 at the end of the number line
        while(Number != 0)
        {
            if(Number == 1)
            {
                num1 = num1 + 1;
            }
            if(Number == 2)
            {
                num2 = num2 + 1;
            }
            if(Number == 3)
            {
                Groups = Groups + 1;
            }
            Number = scan.nextInt();
        }
        //This is the sequence if there are more groups of two than lone students
        if(num2 >= num1)
        {
            Empty = Empty + (2*(num2-num1));
            Groups = Groups + num1;
        }
        //This is the sequence if there are more lone students than groups of two
        if(num1 > num2)
        {
            num1 = num1 - num2;
            Groups = Groups + num2;
            //This is to get the lone students into groups of 3 (if there are enough)
            for(int x = num1; x > 0; x--)
            {
                Extra = Extra + 1;
                if(Extra == 3)
                {
                    Groups = Groups +1;
                    Extra = 0;
                }
            }
            Empty = Empty + Extra;
        }
        //There are two dialogue options. One if there is no one left over and one if there is at least 1 left over
        if(Empty != 0)
        {
            System.out.println(Groups + " full groups can be formed, and " + Empty + " students will still need a group.");
        }
        else {
            System.out.println(Groups + " full groups can be formed, and no students will still need a group.");
        }
    }
}
