/**
 * WhatsAppService:
 * A concrete implementation of the NotificationMedium interface.
 * Displays messages from the message string as a whatsapp notification
 * 
 * AI prompting:
 * -I did not use AI to redesign this, instead I prompted ai with the
 * following...
 * 
 * Is there any neccessary changes I need if Whatsapp is operating in the way I
 * intend
 * it to? (ie, it is operating like emailservice and smsservice)?
 * 
 * response:
 * -my AI service affirmed this worked, further noted that following a similar
 * pattern
 * to my email and sms service is good design
 * 
 * 
 * 
 * @param message
 * @returns the text message to be sent via WhatsAppService
 */

public class WhatsAppService implements NotificationMedium {

    public void Send(String message) {
        System.out.println("[WhatsApp] Sending message: " + message);
    }
}
