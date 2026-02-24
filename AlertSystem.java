import java.util.*;

/**
 * AlertSystem:
 * -Manages delivery of either Email or SMS mediums
 * -stores arraylist log, which holds all messages sent
 * 
 * composition:
 * -shown with setmedium and how it helps to flip which medium is used (sms or
 * email)
 * 
 */

/**
 * \
 * ai prompt: how do I declare an array list
 * returned response: import java.util.*, declare arraylist and name it (log)
 * 
 * ai prompt:
 * How do I fix my for loop so I can iterate through log?
 * returned response: changed the iterator, used MSG to iterate, iterated
 * through log to repeat all printed messages
 */

public class AlertSystem {

    private NotificationMedium medium;
    ArrayList<String> log = new ArrayList<>();

    /**
     * 
     * @param medium sets the implementation of the notificationmedium object
     * @returns
     */

    public void setMedium(NotificationMedium medium) {
        this.medium = medium;

    }

    /**
     * 
     * @param message holds the string representing a message
     * @returns string assigned to this message
     */

    public void notifyUser(String message) {

        if (medium != null) {
            medium.Send(message);

        }

        log.add(message);

    }

    /**
     * showlog:
     * -Displays message log to the console
     */

    public void showLog() {
        if (log.isEmpty()) {
            System.out.println("Log is empty");
            return;

        }
        System.out.println("log: ");
        for (String msg : log) {
            System.out.println(msg);
        }
    }

}
