
import java.util.Scanner;
public class Problem2 {
    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Ok, what are the magic numbers gonna be? ");
        int number=reader.nextInt();
        int fullGroups=0;
        int onesAwaiting=0;
        int twosAwaiting=0;
        while (number!=0){
            if (number==3){
                fullGroups++;
            }
            else if (number==2){
                twosAwaiting++;
            }
            else if (number==1){
                onesAwaiting++;
            }
            number=reader.nextInt();
        }

        int singles=0;
        if (onesAwaiting>=twosAwaiting){
            fullGroups=fullGroups+twosAwaiting;
            fullGroups=fullGroups+(onesAwaiting/3);
            singles=onesAwaiting-(onesAwaiting/3);
        }
        else if (twosAwaiting > onesAwaiting) {
            fullGroups=fullGroups+onesAwaiting;
            singles=(twosAwaiting-onesAwaiting)*2;
        }
        System.out.println(fullGroups+" full groups can be formed, and "+singles+" students will still need a group.");
    }
}
