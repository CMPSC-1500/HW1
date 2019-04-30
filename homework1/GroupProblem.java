import java.util.Scanner;

public class GroupProblem {



        public static void main(String[] args) {
            int number, place, groups = 0, remainers = 0, ones = 0, twos = 0, threes = 0;

            Scanner stdIn = new Scanner(System.in);

            number = stdIn.nextInt();

            for (int i = number; i != 0; i = number) {
                if (i == 3) threes = threes + 1;
                else if (i == 2) twos = twos + 1;
                else if (i == 1) ones = ones + 1;

                number = stdIn.nextInt();
            }
            place = twos;
            for (int j = place; j > 0; j = j - 1) {
                if ( ones > 0)
                    groups = groups + 1;
                ones = ones - 1;
                twos = twos -1;

            }
            groups = groups + threes;
            if (ones > 0) {
                for (int k = ones; k >= 3; k = ones)

                {
                    groups = groups + 1;
                    ones = ones - 3;
                }
                remainers = ones + twos;
                System.out.println(groups + "  full groups can be formed, and  " + remainers + " students will still need a group.");
            }
            else System.out.println(groups + "  full groups can be formed, and  " + remainers + " students will still need a group.");

        }
    }

