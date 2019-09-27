/* Ok so just so I know that I got this right:
the thing that the user inputs is the name of the race not the name of the file.
I'm not sure if we have to
*/

import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many files are you gonna give me to process?");
        int howMany = reader.nextInt();
        //here I shall define an array in which we will store the values that the user inputs
        for(int i=0; i<howMany; i++){
            System.out.println("Give me the name of a file: ");
            String a=reader.next();
        }
        //now make a for loop that goes through the array and checks for the names of the runs and puts them into a new array
        //and then make a for loop that prints every element of that new array of non-bogus file names
        //System.out.println(a);
        //System.out.println(a.contains("kala"));
    }
}
//Dallas and Jeff have looked at my code in the beginning stage