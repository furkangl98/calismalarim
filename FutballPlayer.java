public class FutballPlayer {

    int no;
    String name;
    int minutes;
    boolean inPlay;
    int numberOfGoals;

    public int play(int minutesToPlay){
        minutes = minutes + minutesToPlay;

        return minutes;



    }
    void score(){
        numberOfGoals = numberOfGoals + 1 ;


    }


}
