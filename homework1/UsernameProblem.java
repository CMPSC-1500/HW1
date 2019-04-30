
import java.util.Scanner;

public class UsernameProblem {

    public static void main(String[] args){

        String name, nextName;

        Scanner stdIn = new Scanner(System.in);

        name = stdIn.next().toLowerCase();

        StringBuffer sb = new StringBuffer(name);

        if ( name.length() > 4) {
            sb.setLength(4);
            System.out.println(sb);
        }

        else {
            System.out.print(name);
        }

        nextName = stdIn.next().toLowerCase();

        StringBuffer ab = new StringBuffer(nextName);

        if ( nextName.length() > 4) {
            ab.setLength(4);

            System.out.println(ab);
        }
        else {
            System.out.print(nextName);
        }
    }
}
