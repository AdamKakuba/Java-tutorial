import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
/*
        double highestRanking = 0;
        BoardGame bestGame = null;
        for (BoardGame game : BoardGame.GAMES) {
            if (game.name.contains("a")) {
                if (game.rating > highestRanking) {
                    highestRanking = game.rating;
                    bestGame = game;
                }
            }
        }
        System.out.println(bestGame.name);
*/

        //Stream<BoardGame> stream = BoardGame.GAMES;
        BoardGame bestGame = BoardGame.GAMES
                .stream()
                .filter(g -> g.name.contains("a"))
                .max(Comparator.comparingDouble(g -> g.rating)).get();
        System.out.println(bestGame.name);


    }
}

