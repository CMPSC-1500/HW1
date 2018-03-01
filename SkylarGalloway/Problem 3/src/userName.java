import java.util.Scanner;

public class userName {
    public static void main(String[]args){
        char username[];
        Scanner numUsers = new Scanner(System.in); //input number of files
        System.out.println("Enter number of names: ");
        int num = numUsers.nextInt();

        Scanner naMe = new Scanner(System.in);  // input file names
        for (int i=0; i<num; i++){
            System.out.println("Enter first name:   ");
            String firstName = naMe.next();

            Scanner nAme= new Scanner(System.in);//Scanner for last name
            for (int j=0; j<num; j++){
                System.out.println("Enter last name");
                String lastName = nAme.next();
                int lengthFirst = firstName.length();
                int lengthLast = lastName.length();
                int lengthName = lengthFirst+lengthLast;
                System.out.println(lengthName);
                System.out.println(firstName);

                if (lengthName>=8){
                    for(int ii =1; ii<lengthFirst;ii++){
                        for(int jj=0; jj<lengthLast; j++){
                            if(firstName.charAt(ii)>lastName.charAt(jj)){

                                /* write code to input lastName.charAt(jj) into an array for the rest
                                of the remaining slots
                                example char userName[]
                                for(iii=ii; iii==8; iii++){
                                userName[iii]=lastName.charAt[jj]
                                }

                                */
                            }
                        }
                    }
                }
                else {
                    System.out.println(firstName+lastName);
                }

                //char userBuild;                           //This is to add character wanted from name into new character array
                //userBuild= firstName.charAt(1);




            }





        }


    }
}
