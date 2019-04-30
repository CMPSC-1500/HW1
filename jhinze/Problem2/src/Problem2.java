import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        int numberOfStartingGroups;
        numberOfStartingGroups = input.nextInt();
        String count2;
        String count1
        String numberOfFinalGroups;


        // loop through a list of initial groups

        for ( int i =0; i < numberOfStartingGroups; i = i + 1)
        {

            if (numberOfStartingGroups.contains("3") )
            {
                numberOfFinalGroups = numberOfFinalGroups + 1;
            }
            if (numberOfStartingGroups.contains ("2"))
            {
                count2 = count2 + 1;
            }
            if (numberOfStartingGroups.contains("1"))
            {
                count1 = count1 + 1
            }
        }

        // now we need to compare count1 and count2
            if (count1 = count2)
            {
                numberOfFinalGroups = numberOfFinalGroups + count1;
            }
            if (count1 > count2)
            {
                numberOfFinalGroups = numberOfFinalGroups + count1;
            }
            if (count1 < count2)
            {
                numberOfFinalGroups = numberOfFinalGroups + count2;
            }

            System.out.println(numberOfFinalGroups);

    }


}
