import java.util.Scanner;

public class problem3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstNames;
        String lastNames;
        int n = input.nextInt();
        int i;
        for (i = 0; i < n; i++) {
            firstNames = input.next();
            lastNames = input.next();
            System.out.print((firstNames.charAt(0)));
            int j = 0;
            int Letter = 0;
            int count = 1;
            while (j < Math.min(firstNames.length() - 1, lastNames.length()) && firstNames.charAt(j + 1) < lastNames.charAt(0)) {
                System.out.print(firstNames.charAt(j + 1));
                j++;
                count++;
            }
            if(count + lastNames.length()<8) {
                System.out.println(lastNames);
            }else{

            while (Letter < 7 - count) {
                System.out.print(lastNames.charAt(Letter));
                Letter++;
            }
                System.out.println(lastNames.charAt(Letter));
                Letter++;
            }
        }
    }
}
