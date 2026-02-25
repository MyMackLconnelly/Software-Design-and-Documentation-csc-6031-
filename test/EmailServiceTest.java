
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * EmailServiceTest:
 * tests the functionality of the EmailService class.
 * Specifically, it verifies that the Send(String message) method
 * correctly prints the message by creating an emailservice object,
 * calls the send method with a sample line (Hello world), and confirms if the
 * printed output matches the input.
 * 
 * ai prompt: How do I store data in the test without disrupting the code?
 * response: Learned the use of the ByteArrayOutputStream object to store data
 * in the test
 */

public class EmailServiceTest {

    @Test
    void testPrintsCorrectEmailMessage() {

        EmailService emailService = new EmailService();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        emailService.Send("Hello world");

        System.setOut(originalOut);

        String expected = "Email: Hello world" + System.lineSeparator();
        assertEquals(expected, outputStream.toString());
    }
}
