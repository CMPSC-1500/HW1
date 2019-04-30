import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("what so you want the group max size to be?");
        int groupSize = input.nextInt();
        int toKill = 0;
        int fullGroups = 0;
        int leftOver = 0;
        int error = 0;

       /* System.out.println("how many groups are you going to enter? ");
        int length = input.nextInt(); */
        int[] numbers = data();
        /*
        System.out.println("Please enter your data, special note if you enter a ");
        System.out.println("group number that is greater 3 there will be an error, and i");
        System.out.println("make you restart. thank you now start");
        System.out.println("Please end your data set with a 0 to let me know your done :)"); */
        while( toKill < 1)
        {
            for(int i = 0; toKill < 1;)
            {
                if(numbers[i] > groupSize)
                {
                    toKill++;
                    System.out.println("ERROR, sorry you entered a number greater then " + groupSize + ". Please try again");
                    error++;
                }
                if(numbers[i] == 0)
                {
                    toKill++;
                }
                if(numbers[i] == groupSize)
                {
                    fullGroups++;
                }
                if (numbers[i] < groupSize)
                {
                    leftOver = leftOver + numbers[i];
                }
                i++;


            }
            toKill++;
        }
        if(error < 1)
        {
            System.out.println("You have " + fullGroups + " number of full groups of three in the class.");
            System.out.println("There are " + leftOver + " left over students in the class.");
            int possibleGroups = leftOver / groupSize;
            int leftOutStudents = leftOver % groupSize;
            System.out.println("You could possibly make " + possibleGroups + " more groups with the left over students");
            System.out.println("You would till have " + leftOutStudents + " of left out students");
        }

    }

    private static int[] data() {
        int kill = 0;
        System.out.println("input data");
        Scanner input = new Scanner(System.in);
        int length = 1;
        int num = 0;
        int[] array1 = new int[length];
        array1[length -1] = input.nextInt();
        while(kill < 1 )
        {
            if(array1[length - 1] != 0)
            {
                length++;
                int[] array2 = new int[length];
                //make for loop copy content of 1 to 2, plus new input
                for(int i = 0; i< length -1; i++)
                {
                    array2[i] = array1[i];
                }
                array2[length -1] = input.nextInt();
                array1 = array2;
                //System.out.println(length);
                //System.out.println(Arrays.toString(array1));
                //System.out.println(Arrays.toString(array2));
            }
            if(array1[length -1] == 0)
            {
                kill++;
            }
        }
        return array1;
    }

}
