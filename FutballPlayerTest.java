public class FutballPlayerTest {
    public static void main(String[] args) {
        FutballPlayer alex = new FutballPlayer();
        alex.no=10;
        alex.name="Alex De Souza";
        alex.minutes=0;
        alex.inPlay= true;
        alex.numberOfGoals=0;

        alex.play(90);
        alex.play(40);

        alex.score();
        alex.score();

        System.out.println(" Number Of Goals Alex Scored: " + alex.numberOfGoals);
        System.out.println("Alex Played Totally:"+ alex.minutes + "Minutes so far." );

    }
}
