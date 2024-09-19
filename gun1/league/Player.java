package gun1.league;

public class Player {
    int no;
    String name;

    Team team;

    public Player(int no, String name, Team team) {
        this.no = no;
        this.name = name;
        this.team = team;
    }

    public Player() {
    }

    @Override
    public String toString() {
        return "Player{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
