package kharcha.test;

import org.junit.jupiter.api.Test;
import org.kharcha.Main;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void testMainPrintsHelloWorld() {
        // Capture the console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Call the main method
        Main.main(new String[]{});

        // Restore the original System.out
        System.setOut(originalOut);

        // Verify the output
        assertEquals("Hello world!" + System.lineSeparator(), outContent.toString());
    }
}

