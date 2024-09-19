package gun1.league;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Team {
    int no;
    String name;
    League league;
    List<Player> playerList= new ArrayList<>();

    public Team() {
    }

    public Team(int no, String name,League league) {
        this.no = no;
        this.name = name;
        this.league= league;
    }

    @Override
    public String toString() {
        return "Team{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", playerList=" + playerList +
                '}';
    }
    public Player findById(int no){
        for (Player p: playerList) {
            if(p.no==no)
                return p;


        }
        return null;

    }
    public Optional<Player> findByIdOptional(int id) {
        return playerList.stream()
                .filter(player -> player.no == id)  // id'yi filtreler
                .findFirst();  // İlk eşleşen elemanı döner, bulamazsa boş Optional döner
    }

    public void printPlayerList(){
        playerList.forEach(player -> System.out.println(player.name));

    }
}
