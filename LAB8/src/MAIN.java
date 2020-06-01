import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MAIN {


        public static void main(String[] args) {
            Scanner cs = new Scanner(System.in);
            System.out.println("Input string");
            String str = cs.next();
            int[] num = new int[str.length()];
            for (int i=0;i<str.length();i++){
                num[i]= (int)str.charAt(i);
            }

            rad_lsd_sort ob = new rad_lsd_sort();
            ob.radixsort(num,0);

            transposition ob2 = new transposition();
            ob2.transpos(num);



        }


}
