import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        String fileName;
        Scanner scan = new Scanner(System.in);
        fileName = scan.nextLine();

        int count = 0;
        if (fileName.contains("BunRun")) {
            count++;
        }
        if (fileName.contains("Zombie")) {
            count++;
        }
        if (fileName.contains("Boston")) {
            count++;
        }
        if (fileName.contains("Spartan")) {
            count++;
        }
        if (fileName.contains("Mud")) {
            count++;
        }
        if (count == 1) {
            System.out.println(fileName);
        }
    }
}
