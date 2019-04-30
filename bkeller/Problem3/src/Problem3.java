import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        int numberofEntries;
        String userName, entryFirstName, entryLastName;

        Scanner input = new Scanner(System.in);
        numberofEntries = input.nextInt();


        for (int i = 0; i < numberofEntries; i = i + 1) {

            userName = "";
            entryFirstName = input.next();
            entryLastName = input.next();
            System.out.print(entryFirstName.toLowerCase().charAt(0));
            int a = 0;

            // Take the entry names to form usernames for each student. Usernames will be in lowercase.

            for (a = 0; (entryLastName).toLowerCase().charAt(0) > entryFirstName.toLowerCase().charAt(a + 1); a = a + 1) {
                System.out.print(entryFirstName.charAt(a + 1));
            }

            // Use the beginning letter of the first name and then use a for( ) loop:
            // If the next letter of the first name comes before the first letter of the last name in the alphabet,
            // print that letter.
            // If the next letter of the first name does not come before the first letter of the last name in the alphabet,
            // start printing the last name.

            for (int d = 0; d < (entryLastName.length()) && d < 7 - a; d = d + 1)

            // Use 7 characters or less from the last name.

            {
                System.out.print(entryLastName.toLowerCase().charAt(d));

                // Print the final username.

            }
        }
    }
}


