package Cat;

import java.util.Comparator;

public class Sorting implements Comparator<Players> {
    @Override
    public int compare(Players a, Players b) {
        if (a.score==b.score){
            return (a.name.compareTo(b.name));
        }else
            return (b.score - a.score);
    }
}
