import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * AlertSystemTest:
 * Unit tests for the AlertSystem class. The test works by creating an
 * AlertSystem object, redirecting console output, calling the correct methods,
 * and confirming that the printed output matches what is expected.
 */
public class alertSystemTest {

    @Test
    void testShowLogWhenEmpty() {

        AlertSystem system = new AlertSystem();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        system.showLog();

        System.setOut(originalOut);

        String actual = outputStream.toString().trim();
        assertEquals("Log is empty", actual);
    }

    @Test
    void testNotifyUserStoresMessageAndShowLogPrintsIt() {

        AlertSystem system = new AlertSystem();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        system.notifyUser("First message");
        system.showLog();

        System.setOut(originalOut);

        String output = outputStream.toString();

        assertTrue(output.contains("log: "));
        assertTrue(output.contains("First message"));
    }

    @Test
    void testNotifyUserUsesSelectedMediumAndStoresInLog() {

        AlertSystem system = new AlertSystem();
        system.setMedium(new WhatsAppService());

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        system.notifyUser("Hello Liam");
        system.showLog();

        System.setOut(originalOut);

        String output = outputStream.toString();

        assertTrue(output.contains("[WhatsApp] Sending message: Hello Liam"));

        assertTrue(output.contains("log:"));
        assertTrue(output.contains("Hello Liam"));
    }
}