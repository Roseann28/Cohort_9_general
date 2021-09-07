package Cat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Mainsort {
    public String solve(List objects) {
        List scores = new ArrayList();
        Collections.sort(objects, new Sorting());
        Iterator iterator = objects.iterator();
        while (iterator.hasNext()) {
            Players players = (Players) iterator.next();
            scores.add(players.name);
            scores.add(players.score);
        }
        return scores.toString();
    }
}