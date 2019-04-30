import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        int numberOfNames;
        String userName, personFirstName, personLastName;

        Scanner input = new Scanner(System.in);
        numberOfNames = input.nextInt();


        for (int i = 0; i < numberOfNames; i = i + 1) {

            userName = "";
            personFirstName = input.next();
            personLastName = input.next();
            System.out.print(personFirstName.toLowerCase().charAt(0));
            int a = 0;

            for ( a = 0; (personLastName.toLowerCase().charAt(0) > personFirstName.toLowerCase().charAt(a + 1)); a = a + 1) {
                System.out.print(personFirstName.charAt(a + 1));
            }

            for (int d = 0; d < (personLastName.length()) && d < 7 - a; d = d + 1)
            {
                System.out.print(personLastName.toLowerCase().charAt(d));

            }
        }
    }
}