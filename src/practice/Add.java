package practice;

import java.util.ArrayList;
import java.util.List;

public class Add {
    public List<Integer> solve(int[]array, int result){
        ArrayList<Integer>indices=new ArrayList<>();
        List<List<Integer>> finals=new ArrayList<>();
        int x;
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                x=array[i]+array[j];
                if (x==result) {
                    indices.add(i);
                    indices.add(j);
                }
                }
            }

        return indices;
    }
}
