import java.util.Scanner;

public class Problem2 {


    public static void main(String[] args) {
        int groupsOf3 = 0;
        int groupsOf2 = 0;
        int groupsOf1 = 0;
        int totalGroups = 0;
        int unfilledGroups = 0;
        String group;
        int i = 0;


        Scanner input = new Scanner(System.in);

        group = input.nextLine();

        // create space for the running total of the number of groups
        while( group.charAt(i) != '0' )
        {
            if (group.charAt(i) == '3') {
                groupsOf3 = groupsOf3 + 1;
            } else if (group.charAt(i) == '2') {
                groupsOf2 = groupsOf2 + 1;
            } else if (group.charAt(i) == '1') {
                groupsOf1 = groupsOf1 + 1;
            }
        i = i + 1;
        }


        if( groupsOf2 > groupsOf1){
           totalGroups = groupsOf1 + groupsOf3;
                   unfilledGroups = groupsOf2 - groupsOf1;
                   unfilledGroups *= 2;
        }

        if( groupsOf1 >= groupsOf2){
            totalGroups = groupsOf2 + groupsOf3;
                    unfilledGroups = groupsOf1 - groupsOf2;
        }
            System.out.println(totalGroups + " full groups can be formed, and " + unfilledGroups + " students will still need a group.");
        // add all groups of three to the running total

        // loop through all remaining integers

        // if the number of groupsOf2 > groupsOf1
        // find all groups of 2
        // match up a 'single' with a groupOf2
        // add this new group to the running total
    }
}


