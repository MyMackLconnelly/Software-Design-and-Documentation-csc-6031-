import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * SMSServiceTest:
 * -Tests the functionality of the SMSService class.
 * Specifically, verifies that the Send(String message) method
 * correctly prints the message by creating an SMSService object,
 * calls the send method with a sample line (Hello world), and confirms if the
 * printed output matches the input.
 *
 *
 */

public class SMSServiceTest {

    @Test

    void testPrintsCorrectSMSMessage() {

        SMSService smsService = new SMSService();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        smsService.Send("Hello world");

        System.setOut(originalOut);

        String expected = "SMS: Hello world" + System.lineSeparator();
        assertEquals(expected, outputStream.toString());
    }
}
