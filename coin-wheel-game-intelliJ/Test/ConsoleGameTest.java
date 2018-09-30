import coinwheelgame.ConsoleGame;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class ConsoleGameTest {

    @Test()
    public void printWelcomeTest(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ConsoleGame consoleGame = new ConsoleGame();
        consoleGame.printWelcome();

        String expectedOutput  = "*********************************\n*** Welcome to the Wheel Game ***\n*********************************";

        assertEquals(expectedOutput, outContent.toString());
    }

    @Test()
    public void printOptionsTest(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ConsoleGame consoleGame = new ConsoleGame();
        consoleGame.printOptions();

        String expectedOutput  = "Game options:\t1. Play game\t2. Quit";

        assertEquals(expectedOutput, outContent.toString());
    }

}
