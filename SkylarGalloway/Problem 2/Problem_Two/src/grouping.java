/*Input for nonbonus code:

1 2 2 2 0
3 3 3 3 3 3 1 0
3 2 2 2 1 0
1 1 1 2 0
1  3 3 3 3 0
*/
import java.util.Scanner;
public class grouping {
    public static void main(String[]args){
        int numOne=0;
        int numTwo =0;
        int numThree=0 ;
        int givenData=1;
        Scanner groupData = new Scanner(System.in);
        for (int i = 0; givenData>0; i++) {//do not know how to start for loop and to end at 0
            System.out.println("Enter number of people in group");
            givenData = groupData.nextInt();
            if (givenData == 1) {
                numOne = numOne + 1;
            } else if (givenData == 2) {
                numTwo = numTwo + 1;
            } else if(givenData==3) {
                numThree = numThree + 1;
            }
           // System.out.println("one is "+numOne + " two is   "+numTwo+"   three is  "+numThree);
        }
        //int group1 = numOne-1;//this is done to nullify the fact that I had to use givenData =1 to intialize the for loop
                   // System.out.println("one is "+group1);    NOT NEEDED

        int fullGroups= 0;
        int leftOver =0;
        if(numOne==numTwo){
            fullGroups = numOne;
        }
        else if(numOne>numTwo){
            fullGroups = numTwo;
            leftOver = numOne-numTwo;
        }
        else{
            fullGroups = numOne;
            leftOver = 2*(numTwo-numOne);
        }

        int totalGroup=numThree+fullGroups;
        if(leftOver==0) {
            System.out.println(totalGroup + " full groups can be formed, and no students will still need a group");
        }
        else{
            System.out.println(totalGroup + " full groups can be formed, and " + leftOver + " students will still need a group");


        }

    }


}
