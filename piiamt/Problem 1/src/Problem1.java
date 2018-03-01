/* Ok so just so I know that I got this right:
the thing that the user inputs is the name of the file not the name of the race.
*/
import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many files are you gonna give me to process?");
        int howMany = reader.nextInt();
        String[] allFileNames = new String[howMany];
        //up here I defined an array in which we will store the values that the user inputs
        for(int i=0; i<howMany; i++){
            System.out.println("Give me the name of a file: ");
            allFileNames[i] = reader.next();
        }
        //now make a for loop that goes through the array and checks for the names of the runs and puts them into a new array called nonbogus
        String[] nonBogus = new String[howMany];
        for (int k=0; k<allFileNames.length; k++){
           if (isBogus(allFileNames[k])==true){
               nonBogus[k]=allFileNames[k];
            }
        }
        for (int l=0; l<nonBogus.length; l++){
            if (nonBogus[l] instanceof String){
                System.out.println(nonBogus[l]);
            }
        }
//here I am gonna make a method that I will use inside main, returns whether the name of a file is legit
    }
    public static boolean isBogus(String name){
        String[] raceNames = {"BunRun","Zombie","Boston","Spartan","Mud"};
        int manyRaces = 0;
        for (int a=0; a<raceNames.length; a++){
            if (name.contains(raceNames[a])){
                manyRaces++;
            }
        }
        if (manyRaces==1){
            return true;
        }
        else{
            return false;
        }
    }
}
//Dallas and Jeff have looked at my code in the very beginning stage