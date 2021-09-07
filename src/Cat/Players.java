package Cat;

public class Players {
    String name;
    int score;

    public Players(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name +','+' '+score;
    }
}