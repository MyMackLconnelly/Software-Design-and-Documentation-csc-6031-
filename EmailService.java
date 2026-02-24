/**
 * EmailService:
 * -Concrete Class
 * -sends notifications via email
 * -displays it in a format to distinguish from SMS
 * 
 * @param message holds the string representing a message
 * @returns string assigned to this message
 */

public class EmailService implements NotificationMedium {

    public void Send(String message) {
        System.out.println("Email: " + message);

    }

}
