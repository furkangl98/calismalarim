package gun1.league;

import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        League league1 = new League(1,"superlig");
        Team team1= new Team(1,"salvarspor",league1);
        Player player1=new Player(10,"Alex",team1);
        Player player2=new Player();
        player2.no=3;
        player2.team=team1;
        league1.teamList.add(team1);
        team1.playerList.add(player1);
        team1.playerList.add(player2);
//        System.out.println(league1.toString());
//        System.out.println(player1.toString());
//        System.out.println(team1);
        Queue<Player> playersQueue=new LinkedList<>();
        playersQueue.add(player1);
//        System.out.println(playersQueue);
//        System.out.println(playersQueue.peek()!=null? playersQueue.peek().name:"liste boş");
        team1.findByIdOptional(10).ifPresent(player -> System.out.println(player.name));

//        System.out.println(team1.findByIdOptional(10));
    }

}
