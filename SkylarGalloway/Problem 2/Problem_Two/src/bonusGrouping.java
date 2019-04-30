//Alex Kerr helped explain a way to achieve the bonus
/*Input for bonus code
max number in group: 4
1 2 3 4 0
max number in group: 5
5 5 5 5 4 0
max number in group: 3
1 1 1 1 1 1 1 1 1 1 0

max number in group: 7
1 2 3 2 3 4 4 7 0

max number in group: 9
1 2 3 4 5 6 7 9 0

max number in group:5
1 2 3 4 4 5 0*/
import java.util.Scanner;

public class bonusGrouping {
    public static void main(String[]args){
        Scanner num = new Scanner(System.in); //input number of files
        System.out.println("Max group size: ");
        int nUm = num.nextInt();

        int givenData=1;
        int sumGivendata=0;
        Scanner groupData = new Scanner(System.in);
        for (int i = 0; givenData>0; i++){
            System.out.println("Enter number of people in group");
            givenData = groupData.nextInt();
            sumGivendata+= givenData;

            System.out.println(sumGivendata+" this is sum");


        }

        int groupNum = sumGivendata/nUm;
        int leftover=sumGivendata %nUm; //Dustin Monroe gave me the code to compute the remainder
        if(leftover==0){
            System.out.println(groupNum + " full groups can be formed, and no students will still need a group");

        }
        else{
            System.out.println(groupNum + " full groups can be formed, and " +leftover +" students will still need a group");
        }
    }

}
