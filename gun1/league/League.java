package gun1.league;

import java.util.ArrayList;
import java.util.List;

public class League {
    int no;
    String name;
    List<Team> teamList= new ArrayList<>();

    public League(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "League{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", teamList=" + teamList +
                '}';
    }
}
