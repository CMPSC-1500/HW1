import java.util.Scanner;
import java.lang.*;
import java.util.*;
public class JaredPohlmann {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int scanInt = scan.nextInt();
        int numberOfGroups = 0;
        int[] array = new int[100];
        int numberOf2 = 0;
        int numberOf1 = 0;
        int StudentsNoGroup = 0;
        int arrayIndex = 0;

        for (int k = 0; scanInt>0 ; k++) {
                array[k] = scanInt;
                arrayIndex+=1;
                scanInt = scan.nextInt();


        }
        for (int j = 0; j < arrayIndex; j++) {
            if (array[j] == 3) {
                numberOfGroups += 1;
            } else if (array[j] == 2) {
                numberOf2 += 1;
            } else {
                numberOf1 += 1;
            }
        }
        if (numberOf2 - numberOf1 > 0) {
            StudentsNoGroup += 2 * (numberOf2 - numberOf1);
        } else {
            StudentsNoGroup += numberOf1 - numberOf2;
        }
        if (numberOf2 < numberOf1) {
            numberOfGroups += numberOf2;
        } else {
            numberOfGroups += numberOf1;
        }
        System.out.println(numberOfGroups + " full groups can be formed, and " + StudentsNoGroup + " students will still need a group." );
    }
}
