import java.util.ArrayList;
import java.util.List;

public class rad_lsd_sort {
    public static void radixsort(int[] input, int x) {

        List<Integer>[] buckets = new ArrayList[10];
        for (int i = 0; i < 10; i++) {
            buckets[i] = new ArrayList<Integer>();
        }
        boolean flag = false;
        int tmp = -1, divisor = 1;
        while (!flag) {
            flag = true;

            for (int i = x; i<input.length; i++) {
                tmp = input[i] / divisor;
                buckets[tmp % 10].add(input[i] );
                if (flag && tmp > 0) {
                    flag = false;
                }
            }
            int a = x;
            for (int b = 0; b < 10; b++) {
                for (Integer i : buckets[b]) {
                    input[a++] = i;
                }
                buckets[b].clear();
            }
            divisor *= 10;
        }
    }
}
