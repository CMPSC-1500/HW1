import java.util.Scanner;

public class Namegiver {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number of Students");
        int numOfNames = Integer.parseInt(scan.nextLine());


        for (int i = 0; i < numOfNames; i++) {
            System.out.println("Enter the Student " + (i+1) + "'s Name");
            String Name = scan.nextLine();
              //this is where i get lost i do not now a command to use to break apart a sting into 2 different stings and compair the 2 to determine the 8
            // characters for their user name but these are my broken down steps to get to the point of printing there user name
                //break first and last name apart by space
               //store full first name as fullfirst
                //store full last name as fulllast
                //scan first 4 leters of fullfirst
                //save first 4 letter of fullfirst to f4

                //scan first 4 leters of fulllast
                //save first 4 letter of fulllast to l4
                //combine both 4 letter names
                //print combined
                //


                System.out.println(f4+l4);
        }

    }
}