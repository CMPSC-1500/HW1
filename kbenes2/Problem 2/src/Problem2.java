import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
       int totalGroups;
        String numberList;
        Scanner input = new Scanner(System.in);
        totalGroups = input.nextInt();

        int onegroup = 0;
        int twogroup = 0;
        int remainder;

        int i;
        for(i = 0; i < totalGroups; i = i + 1)
        {
            numberList = input.nextLine();

            if(numberList.contains("1"))
            {
                totalGroups = onegroup + 1;
            }
            if(numberList.contains("2"))
            {
                totalGroups = twogroup + 1;
            }
            if(numberList.contains("3"))
            {
                totalGroups = totalGroups + 1;
            }
        }
        if(onegroup > twogroup);
        {
            totalGroups = totalGroups + twogroup;
            remainder = onegroup - twogroup;
        }
        if(onegroup < twogroup);
        {
            totalGroups = totalGroups + onegroup;
            remainder = twogroup - onegroup;
        }
        System.out.println("groups of 3 = " + totalGroups + ", and " + remainder + " students will still need a group");
    }
}

