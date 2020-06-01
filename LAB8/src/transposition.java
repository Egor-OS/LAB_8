import java.util.Arrays;

public class transposition {
    public void transpos(int [] num){
        num=del_dubl(num);
        output_arr(num);

        rad_lsd_sort ob = new rad_lsd_sort();

        for (int i=num.length-2; i>=0; i--){
            if (num[i]<num[i+1]){
                int date=i+1;
                for (int j=i+1;j<=num.length-1;j++)
                    if (((num[j]-num[i])>0)&&(num[j]<num[date])) date=j;
                swap_el(num, i, date);
                sort(num,i+1);
                output_arr(num);
                i=num.length-1;

            }
        }

    }

    public int [] del_dubl (int [] num){
        int index=1;
        if (num.length>1) {
            for (int i = 1; i < num.length; i++) {
                if ((num[i - 1] != num[i])) {
                    num[index] = num[i];
                    index++;
                }
            }
            num = Arrays.copyOf(num,index);
        }
        return num;
    }

    public void output_arr(int [] num){
        System.out.println();
        for (int h : num)
            System.out.print((char)h + " ");

    }

    public void swap_el(int []num,int x,int y){
        int i= num[x];
        num[x] = num[y];
        num[y]=i;

    }

    public void sort(int []num, int x){
        int index=num.length-1;
        for (int i=x; i<=((num.length-x)/2); i++){
            swap_el(num,i,index);
            index--;
        }
    }


}
