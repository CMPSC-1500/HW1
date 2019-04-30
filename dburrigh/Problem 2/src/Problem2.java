import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        String commandLine;
        Scanner scan = new Scanner(System.in);
        commandLine = scan.nextLine();

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int i = 0;
        while (commandLine.charAt(i) != '0') {
            System.out.print(commandLine.charAt(i)+"\n");
            if (commandLine.charAt(i) == '3') {
                count3++;
            } else if (commandLine.charAt(i) == '2') {
                count2++;
            } else if (commandLine.charAt(i) == '1'){
                count1++;
            }
           i++;
        }
        if(count1<=count2){
            count2-=count1;
            count3+=count1;
            System.out.println("groups of 3 = " +count3+", and " +2*count2+ " students will still need a group");

        }else {
            count1-=count2;
            count3+=count1;
            System.out.println("groups of 3 = " +count3+", and " +count1+ " students will still need a group");
        }
    }
}
