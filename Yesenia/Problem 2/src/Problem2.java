import java.util.Scanner;

public class Problem2 {
    public static void main(String args[]) {

        int NumberOfGroups;
        int Fin = 0;
        int GroupNumber;
        int NumberMaxed = 0;
        int Remainder = 0;
        Scanner input = new Scanner(System.in);

        NumberOfGroups = input.nextInt();
        while (Fin < 1) {
            GroupNumber = input.nextInt();
            if (GroupNumber == 0) {
                Fin = Fin + 1; break;
            } else if (GroupNumber == NumberOfGroups) {
                NumberMaxed = NumberMaxed + 1;
            } else if (GroupNumber < NumberOfGroups) {
                Remainder = Remainder + GroupNumber;
            } else {
                System.out.print("According to my calculations, there is an error");
            }
        }
        System.out.println("there are this many full groups " + NumberMaxed);
        System.out.println(" there are this many remainder of people " + Remainder);
    }
}
//I WORKED ON THIS WITH JACOB, SHANE, AND ALEX