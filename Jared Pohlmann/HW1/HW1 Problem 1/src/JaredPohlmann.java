import java.util.Scanner;
import java.lang.*;
import java.util.*;
public class JaredPohlmann {


    public static void main(String[] args) {
        System.out.println("How many lines of input do you have?");
        Scanner scan = new Scanner(System.in);
        int inputNum = Integer.parseInt(scan.nextLine());

        String line = scan.nextLine();
        int fileNumber = 4;
        CharSequence bun = "BunRun", z = "Zombie", boston = "Boston", spar = "Spartan", mud = "Mud";
        boolean retval = line.contains(bun);
        boolean retval2 = line.contains(z);
        boolean retval3 = line.contains(boston);
        boolean retval4 = line.contains(spar);
        boolean retval5 = line.contains(mud);
        while (inputNum > 0) {
            if (retval == true || retval2 == true || retval3 == true || retval4 == true || retval5 == true) {
                System.out.print(line);
                line=scan.nextLine();
                retval =line.contains(bun);
                retval2 = line.contains(z);
                retval3 = line.contains(boston);
                retval4 = line.contains(spar);
                retval5 = line.contains(mud);
                inputNum --;

            }
            else{
                line=scan.nextLine();
                retval =line.contains(bun);
                retval2 = line.contains(z);
                retval3 = line.contains(boston);
                retval4 = line.contains(spar);
                retval5 = line.contains(mud);
                inputNum--;
            }

        }

    }
}
