import java.util.Scanner;

public class groupfinder {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int total=0;
        int remainder=0;
        int groupy=0;

        System.out.println("How many peopple do you want in each group");
        int re = Integer.parseInt(scan.nextLine());
        while(true){
            System.out.print("Input a group size or enter 0 to finish ");
            int number = scan.nextInt();
            if(number >=0)
                total += number;
            if(number == 0)
                break;
        }
        /*
        couldnt figure our how to get the number of groups possible so Alex kerr hinted to me the idea of adding//
        them togehter and deviding by desired group and that is all he told me//
        */
        if(true){
            groupy= total/re;
              remainder = total %re;

              System.out.println("You have "+ groupy + " groups and " + remainder +" kid(s) left over" );
        }






    }

}
