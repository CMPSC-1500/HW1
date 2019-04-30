import java.util.Scanner;
import java.lang.*;

public class JaredPohlmann {
    public static void main(String[] args) {
        System.out.println("How many user names need to be created?");
        Scanner scan = new Scanner(System.in);
        int inputNum = Integer.parseInt(scan.nextLine());
        String name = scan.next();
        name=name.toLowerCase();
        char[] firstName= new char[8];
        char[] lastName= new char[8];
        char[] userNames= new char [8];
        char[] firstNameHold;
        char [] lastNameHold;

        while (inputNum > 0) {
            firstNameHold = name.toCharArray();
            for(int m=0; m<firstNameHold.length; m++){
                firstName[m]=firstNameHold[m];
            }
            name = scan.next();
            name =name.toLowerCase();
            lastNameHold = name.toCharArray();
            for(int n =0; n< lastNameHold.length; n++){
                lastName[n]=lastNameHold[n];
            }
            outerloop:
            for (int j = 1; j < 7; j++) {
                if(firstName[j]>lastName[0]|| firstName[j]== 0){
                 for (int i = 0; i < j; i++){
                     userNames[i]=firstName[i];
                 }
                 for(int z = 0; z<8-j && z< lastNameHold.length; z++){
                     userNames[z+j]=lastName[z];
                 }
                 break outerloop;
                }


            }
            System.out.println(userNames);
            inputNum--;
            name = scan.next();
            name =name.toLowerCase();
             firstName= new char[8];
            lastName= new char[8];
            userNames= new char [8];

        }
    }
}
