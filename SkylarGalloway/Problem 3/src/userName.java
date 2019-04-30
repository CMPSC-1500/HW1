import java.util.Scanner;

public class userName {
    public static void main(String[]args){
        char username[] = new char[8];
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
                username[0]=firstName.charAt(0);
                System.out.println(username[0]);
                //String userName ="X";

                if (lengthName>=8){
                    for(int ii =1; ii<lengthFirst;ii++){
                        for(int jj=0; jj<lengthLast; j++){
                            if(firstName.charAt(ii)>lastName.charAt(jj)){
                                for(int iii=ii; iii<8; iii++){
                                    username[iii]=lastName.charAt(jj);//It is stuck in an infinite loop goes through this completely
                                    //but prints out sggggggg infinte amount of time. Will not go through each char
                                }
                                String userName = new String (username);
                                System.out.println(userName);

                            }
                            else{
                                //for(int x=ii; x<8; x++) {
                                    if (ii<8) {
                                        username[ii] = firstName.charAt(ii);
                                    }
                                    else {
                                        String userName = new String(username);
                                        //System.out.println(userName);
                                        System.out.println(userName);

                                    }
                                //}

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
