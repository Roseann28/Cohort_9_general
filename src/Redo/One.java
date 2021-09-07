package Redo;

import java.util.List;
import java.util.Map;

public class One {
    public static String solve(List<Integer> numbers, Map<String, List<Integer>> queries){
        for (Map.Entry<String, List<Integer>> entry: queries.entrySet()) {
            List<Integer> params = entry.getValue();
            if (entry.getKey().equals("Insert")) {
                int index=params.get(0);
                int addnumber=params.get(1);
                numbers.add(index, addnumber);
            } else if (entry.getKey().equals("Delete")) {
                int index=params.get(0);
                numbers.remove(index);
            }
        }
            StringBuilder stringBuilder=new StringBuilder();
            for (Integer i: numbers){
                stringBuilder.append(i);
                stringBuilder.append(" ");
            }
        return stringBuilder.toString().trim();

    }
}
