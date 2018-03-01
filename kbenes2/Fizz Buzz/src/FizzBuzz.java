import java.util.Scanner;

public class FizzBuzz {
    public static void main(String [] args) {
        Scanner sysIn = new Scanner(System.in);
        int value = sysIn.nextInt();
        while (value > 1) {
            fizz(value);
            buzz(value);
            value = value - 1;
            System.out.println();
        }
    }
    private static void fizz(int number) {
        if (number % 2 == 0)
            System.out.print("fizz");
    }
    private static void buzz(int number)
    {
        if (number % 3 == 0)
            System.out.print("buzz");
    }
}
