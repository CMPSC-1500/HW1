import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) throws IOException
    {

        String[] names = data();
        String[] userNames = new String[names.length];
        String[] firstNames = new String[names.length];
        String[] lastNames = new String[names.length];
        String first = "";
        String last = "";
// I made the variables above and for loop below to cut up the inputs into
// first names and last names
        for(int i =0; i<names.length; i++)
        {
            String x = names[i];
            first = x.substring(0,x.indexOf(" "));
            last = x.substring(x.indexOf(" ") + 1, x.length());
            firstNames[i] = first;
            lastNames[i] = last;
        }
        //System.out.println(Arrays.toString(firstNames));
        //System.out.println(Arrays.toString(lastNames));

        // now i will go about cutting the first names and last names
        // into user names.

        for(int i =0; i<names.length;i++)
        {
            String x = firstNames[i];
            String y = lastNames[i];
            String user = "";
            int b = 0;
            int c = 0;
            for(int a =0; a<8; a++)
            {

                char firstNameLetter = x.charAt(b);
                char lastNameLetter = y.charAt(c);
                if(x.length() + y.length() <= 8)
                {
                    user = x+y;
                    userNames[i] = user;
                    a = a +9;
                    break;
                }
                if(a == 0)
                {
                    user = user + firstNameLetter;
                    userNames[i] = user;
                    b++;

                }
                else if(Character.toLowerCase(firstNameLetter) < Character.toLowerCase(lastNameLetter))
                {

                    user = user + firstNameLetter;
                    userNames[i] = user;
                    b++;
                }
                else if(Character.toLowerCase(firstNameLetter) > Character.toLowerCase(lastNameLetter))
                {
                    user = user + y.subSequence(c,y.length() + a - user.length());
                    userNames[i] = user;
                    a = a + 9;
                    break;
                }
                else if(Character.toLowerCase(firstNameLetter) == Character.toLowerCase(lastNameLetter))
                {
                    user = user + firstNameLetter;
                    userNames[i] = user;
                    b++;
                }

            }
        }

        System.out.println(Arrays.toString(userNames));
    }
    //This function deals with the input of data and makes input into an array
    // of first and last names. and returns the array
    private static String[] data() {
        int kill =0;
        System.out.println("how many names are you going to enter");
        Scanner input = new Scanner(System.in);
        Integer killNumber = Integer.parseInt(input.nextLine());
        int length = 1;
        int num = 0;
        System.out.println("enter the names:");
        String[] array1 = new String[length];
        array1[length - 1] = input.nextLine();
        while (kill < 1) {
            if (array1[length - 1] != "") {
                length++;
                String[] array2 = new String[length];
                //make for loop copy content of 1 to 2, plus new input
                for (int i = 0; i < length - 1; i++) {
                    array2[i] = array1[i];
                }
                array2[length - 1] = input.nextLine();
                array1 = array2;
                //System.out.println(length);
                //System.out.println(Arrays.toString(array1));
                //System.out.println(Arrays.toString(array2));
            }
            if (length== killNumber) {
                kill++;
            }
        }
        return array1;
    }
}
