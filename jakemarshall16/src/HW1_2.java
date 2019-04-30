import java.util.Scanner;

public class HW1_2 {
    public static void main(String args[]) {
        int grouptotal;
        Scanner userInput = new Scanner(System.in);
        grouptotal = userInput.nextInt();

        int total = 0;
        int justright = 0;
        int extras = 0;
        int classtotal;

        Scanner input = new Scanner(System.in);

        grouptotal = input.nextInt();
        while (total < 1) {
            classtotal = input.nextInt();
            if (classtotal == 0) {
                total = total + 1; break;
            } else if (classtotal == grouptotal)
            {
                justright = extras + 1;
            } else if (classtotal < grouptotal)
            {
                extras = extras + classtotal;
            } else {
                System.out.print("Nope");
            }
        }
        System.out.println("These people are the expendables: " + extras);
        System.out.println("This number of people found a group: " + justright);

        //was able to figure this one out with Alex, Yesenia, and Shane

    }
}
