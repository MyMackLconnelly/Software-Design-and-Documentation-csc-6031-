/**
 * SMSService: a form of notifaction medium, shown as an sms
 * instead of an email
 * 
 * @param message holds the string representing a message
 * @returns string assigned to this message
 */

public class SMSService implements NotificationMedium {

    public void Send(String message) {
        System.out.println("SMS: " + message);

    }

}
