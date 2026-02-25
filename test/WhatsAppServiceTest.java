
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * WhatsAppServiceTest:
 * This test verifies that the Send(String message) method
 * correctly formats and prints the expected WhatsApp output
 * to the console.
 * 
 * 
 */

public class WhatsAppServiceTest {
    @Test
    void testWhatsAppService() {

        WhatsAppService whatsapp = new WhatsAppService();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        whatsapp.Send("Hello Liam");

        System.setOut(originalOut);

        String expected = "[WhatsApp] Sending message: Hello Liam";
        String actual = outputStream.toString().trim();

        assertEquals(expected, actual);
    }

}
