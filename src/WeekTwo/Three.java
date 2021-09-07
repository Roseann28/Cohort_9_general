package WeekTwo;

import java.util.ArrayList;

public class Three {
    static ArrayList<Integer> solve(int[] a, int[] b){
        ArrayList<Integer> arrayList=new ArrayList<>();
        int count_array1[] = new int[101];
        int count_array2[] = new int[101];
        int min = min(b);
        int max = max(b);
        int diff = max - min;
        for(int i=0;i<a.length;i++){
            count_array1[a[i]-min]++;
        }
        for(int i=0;i<b.length;i++){
            count_array2[b[i]-min]++;
        }
        for(int i=0;i<=100;i++){
            int diff_count = count_array2[i] - count_array1[i];
            if(diff_count > 0){
                arrayList.add((i+min));
            }

        }
        return arrayList;
    }
    static int min(int a[]){
        int min = a[0];
        for(int i=1;i<=a.length-1;i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        return min;
    }
    static int max(int b[]){
        int max = b[0];
        for(int i=1;i<=b.length-1;i++){
            if(b[i] > max){
                max = b[i];
            }
        }
        return max;
    }

}
