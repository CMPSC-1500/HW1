    import java.util.Scanner;


    public class Problem3 {

        public static void main(String[] args)
        {
           int numberOfPeople;
           String userName;
           String firstName;
           String lastName;
           char lastNameFirst;
           Scanner input = new Scanner(System.in);
           numberOfPeople = input.nextInt();





            // loop through a list of names

            for( int i = 0; i < numberOfPeople; i = i + 1) {
                userName = "";
                firstName = input.next();
                lastName = input.next();
                lastNameFirst = lastName.toLowerCase().charAt(0);
                userName = userName + firstName.toLowerCase().charAt(0);

                boolean lastNameStarts = false;
                for (int j = 1; j < 8 && j < firstName.length(); j = j + 1) {
                    if (lastNameFirst < firstName.toLowerCase().charAt(j)) {
                        lastNameStarts = true;
                    }
                    if (!lastNameStarts) {
                        userName = userName + firstName.toLowerCase().charAt(j);
                    }
                }

                for (int k = 0; k < 8 ; k = k + 1) {
                   if( userName.length() < 8 && k < lastName.length()) {
                       userName = userName + lastName.toLowerCase().charAt(k);
                   }

                }
                System.out.println(userName);
            }
        }
    }
