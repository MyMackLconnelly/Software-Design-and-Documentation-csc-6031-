/**
 * NotificationMedium: Holds the interface for
 * SMS and email to store a message (string).
 * 
 * @param message holds the string representing a message
 * @returns string assigned to this message
 */

public interface NotificationMedium {

    void Send(String message);

}
