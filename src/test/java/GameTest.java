import org.example.Game;
import org.example.NotRegisteredException;
import org.example.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.NotActiveException;

public class GameTest {

    @Test
    public void WinnerPlayOne() {
        Player kristina = new Player(1, "Кристина", 500);
        Player vera = new Player(2, "Вера", 1000);
        Game game = new Game();
        game.registred(kristina);
        game.registred(vera);
        int actual = game.round("Кристина", "Вера");
        int expected = 2;
        Assertions.assertEquals(actual, expected);

    }
    @Test
    public void WinnerPlayTwo() {
        Player kristina = new Player(1, "Кристина", 500);
        Player vera = new Player(2, "Вера", 100);
        Game game = new Game();
        game.registred(kristina);
        game.registred(vera);
        int actual = game.round("Кристина", "Вера");
        int expected = 1;
        Assertions.assertEquals(actual, expected);

    }
    @Test
    public void WinnerPlay() {
        Player kristina = new Player(1, "Кристина", 500);
        Player vera = new Player(2, "Вера", 500);
        Game game = new Game();
        game.registred(kristina);
        game.registred(vera);
        int actual = game.round("Кристина", "Вера");
        int expected = 0;
        Assertions.assertEquals(actual, expected);

    }
    @Test
    public void WinnerPlayRegistredNotOne() {
        Player kristina = new Player(1, "Кристина", 500);
        Player vera = new Player(2, "Вера", 500);
        Game game = new Game();
        game.registred(kristina);
        game.registred(vera);
       // int actual = game.round("Андрей", "Вера");
        //int expected = 0;
        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Андрей", "Вера"));
    }
    @Test
    public void WinnerPlayRegistredNot() {
        Player kristina = new Player(1, "Кристина", 500);
        Player vera = new Player(2, "Вера", 500);
        Game game = new Game();
        game.registred(kristina);
        game.registred(vera);
        // int actual = game.round("Андрей", "Вера");
        //int expected = 0;
        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Андрей", "Михаил"));
    }
    @Test
    public void WinnerPlayRegistredNotTwo() {
        Player kristina = new Player(1, "Кристина", 500);
        Player vera = new Player(2, "Вера", 500);
        Game game = new Game();
        game.registred(kristina);
        game.registred(vera);
        // int actual = game.round("Андрей", "Вера");
        //int expected = 0;
        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Кристина", "Андрей"));
    }
}
