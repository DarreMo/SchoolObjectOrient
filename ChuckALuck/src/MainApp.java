package ChuckALuckSpel;

public class MainApp {

    public static void main(String[] args) {
        ChuckALuckGame game = new ChuckALuckGame(100);
        game.playRound(3,5);
        println(game);

        game.playRound(3,20);
        println(game);

        game.playRound(4, 10);
        println(game);
    }

    static void println(String string) {
        System.out.println(string);
    }
    static void println(Object string) {
        System.out.println(string.toString());
    }
}
