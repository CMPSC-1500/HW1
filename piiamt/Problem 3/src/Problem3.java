//package prjstrings;
import java.util.Scanner;

public class Problem3 {
    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("How many names are there going to be?");
        int howMany=reader.nextInt();
        for (int i=0; i<howMany; i++){
            int lengthOfUserName=1;
            int lengthOfNames=0;
            System.out.println("give me the first name ");
            String firstName=reader.next();
            System.out.println("now give me the last name");
            String lastName=reader.next();
            firstName=firstName.toLowerCase();
            lastName=lastName.toLowerCase();
            lengthOfNames=firstName.length()+lastName.length();
            char currentLetter;
            if (lengthOfNames>=8){
                System.out.print(firstName.charAt(0));
                for(int j=1; j<firstName.length();j++){
                    currentLetter=firstName.charAt(j);
                    if (currentLetter<=lastName.charAt(0) && j<7){
                        System.out.print(currentLetter);
                        lengthOfUserName++;
                    }
                    else{
                        break;
                    }
                }
                for(int k=0; k<8-lengthOfUserName; k++){
                    currentLetter=lastName.charAt(k);
                    System.out.print(currentLetter);
                }
                System.out.println(" ");
            }
            else{       //if the total name is shorter than 8 just print all of it
                System.out.println(firstName+lastName);
            }
        }
    }
}
//I got the idea to just print the username, not build it up as a string one character at a time, from Dallas