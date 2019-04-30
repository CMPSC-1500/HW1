import java.util.Scanner;

public class Problem3 {
    public static void main(String args[]) {
        String names = "";
        Scanner input = new Scanner(System.in);
        int NumberOfNames = 0;
        NumberOfNames = Integer.parseInt(input.nextLine());

        for(int i = 0; i < NumberOfNames; i++)
        {
            names = input.nextLine();
            String first = names.substring(0,names.indexOf(" "));
            String last = names.substring(names.indexOf(" ") + 1, names.length());

            if(first.length() + last.length() <= 8)
            {
                System.out.println(first + last);
            }
            else if(names.length() > 8)
            {
                String ans = "" + first.charAt(0);
                int x = 0;
                int y = 1;
                for(int j = 1; j<= 7; j++) {
                    if (j>= last.length()|| j>=first.length())
                    {
                        if(ans.length() < 8)
                        {
                            //I get the rest of this problem but I dont know how to add the rest of the last name to the
                            //user name when i run out of letters in the first name
                        }
                        break;
                    }
                    else if(Character.toLowerCase(first.charAt(y)) <= Character.toLowerCase(last.charAt(x)))
                    {
                        String add = "" + first.charAt(y);
                        ans = ans.concat(add);
                        y = y + 1;

                    }
                    else if(Character.toLowerCase(first.charAt(y)) >= Character.toLowerCase(last.charAt(x)))
                    {
                        String add = "" + last.charAt(x);
                        ans = ans.concat(add);
                        x = x + 1;
                    }
                }
                System.out.println(ans);
            }

        }
    }
}
//I WORKED ON THIS WITH SHANE, JACOB, ALEX