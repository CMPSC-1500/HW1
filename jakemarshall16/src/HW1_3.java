import java.util.Scanner;
public class HW1_3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int nametotal = 0;
        nametotal = Integer.parseInt(input.nextLine());
        String whatsurname = "";
        for (int i = 0; i < nametotal; i++) {
            whatsurname = input.nextLine();
            String first = whatsurname.substring(0, whatsurname.indexOf(" "));
            String last = whatsurname.substring(whatsurname.indexOf(" ") + 1, whatsurname.length());
            if (first.length() + last.length() <= 8) {
                System.out.println(first + last);
            } else if (whatsurname.length() > 8) {
                String ans = "" + first.charAt(0);
                int x = 0;
                int y = 1;
                for (int j = 1; j <= 7; j++) {
                    if (j >= last.length() || j >= first.length()) {
                        if (ans.length() < 8) {
                        }
                        break;
                    } else if (Character.toLowerCase(first.charAt(y)) <= Character.toLowerCase(last.charAt(x))) {
                        String add = "" + first.charAt(y);
                        ans = ans.concat(add);
                        y = y + 1;
                    } else if (Character.toLowerCase(first.charAt(y)) >= Character.toLowerCase(last.charAt(x))) {
                        String add = "" + last.charAt(x);
                        ans = ans.concat(add);
                        x = x + 1;
                    }
                }
                System.out.println(ans);
            }//I needed to have an extensive amount of help with this one because I did not full understand
            //what the problem was truly asking me. Alex helped me with this one and Shane and Yesenia also helped.

//I understand the logic behind it but am confused as to how to execute still.
        }
    }
}