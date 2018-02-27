import java.util.Scanner;

public class Filesort {
   public static void main (String[] args){
       Scanner scan=new Scanner(System.in);

       System.out.println("Enter Number of files");
       int numOfFiles=Integer.parseInt(scan.nextLine());

       String arrayOfFiles[]= new String[numOfFiles];
        for (int i=0; i< arrayOfFiles.length; i++){
            System.out.println("Enter the name of file " + (i+1) + ":");
                arrayOfFiles[i]= scan.nextLine();
        }
       for (int i = 0; i < arrayOfFiles.length; i++) {
             String phrase = arrayOfFiles[i];
             String wBunRun = "BunRun";
             String wZombie = "Zombie";
             String wBoston = "Boston";
             String wSpartan = "Spartan";
             String wMud = "Mud";
             //Alex kerr told me about the phrase.contain command//
           // i figured out the if else statement without the &&! alex helped me come up with the if else to get only one key word//

            if (phrase.contains(wBunRun)&&! phrase.contains(wBoston)&&!phrase.contains(wMud)&&!phrase.contains(wSpartan)&&!phrase.contains(wZombie))
           {System.out.println(arrayOfFiles[i]);}
            else if (phrase.contains(wZombie)&&! phrase.contains(wBoston)&&!phrase.contains(wMud)&&!phrase.contains(wSpartan)&&!phrase.contains(wBunRun))
                {System.out.println(arrayOfFiles[i]);}
                else if (phrase.contains(wBoston)&&! phrase.contains(wBunRun)&&!phrase.contains(wMud)&&!phrase.contains(wSpartan)&&!phrase.contains(wZombie))
                     {System.out.println(arrayOfFiles[i]);}
                     else if (phrase.contains(wSpartan)&&! phrase.contains(wBoston)&&!phrase.contains(wMud)&&!phrase.contains(wBunRun)&&!phrase.contains(wZombie))
                          {System.out.println(arrayOfFiles[i]);}
                          else if (phrase.contains(wMud)&&! phrase.contains(wBoston)&&!phrase.contains(wBunRun)&&!phrase.contains(wSpartan)&&!phrase.contains(wZombie))
                               {System.out.println(arrayOfFiles[i]);}
                            

           }


       }


   }

