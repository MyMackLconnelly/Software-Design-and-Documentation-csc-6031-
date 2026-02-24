import java.util.Scanner;

/**
 * 
 * What this application is used for: Allows users to send messages
 * via SMS or email. Also stores them in a log which is accessable for users.
 * 
 * 
 * @author Liam Connelly
 * @version 1.0
 */

/**
 * ai prompt: How do I set up a do while loop in java
 * returned response: Featured prompt on how to properly structure a do while
 * loop
 */

public class Main {

    /**
     * Main method:
     * -Prompts user
     * -Accepts a message to send
     * -Prompts users to send more messages if they want to
     * -displays a message log if users want to
     * 
     * @param String[]args
     * @returns main function
     *
     */
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        AlertSystem system = new AlertSystem();

        String question = "";

        do {
            System.out.println("Type the number of the given medium (MUST BE THE NUMBER): ");
            System.out.println("1. Email");
            System.out.println("2. SMS");
            System.out.println("3. WhatsApp");

            if (!scn.hasNextInt()) {
                System.out.println("Invalid choice");
                scn.nextLine();
                continue;
            }

            int choice = scn.nextInt();
            scn.nextLine();

            if (choice == 1) {
                system.setMedium(new EmailService());
            } else if (choice == 2) {
                system.setMedium(new SMSService());
            } else if (choice == 3) {
                system.setMedium(new WhatsAppService());
            } else {
                System.out.println("Invalid choice");
                continue;
            }

            System.out.print("Enter message: ");
            String message = scn.nextLine();

            system.notifyUser(message);

            System.out.println("Would you like to send another message (yes or no)? ");
            question = scn.nextLine();

        } while (question.equalsIgnoreCase("yes"));

        System.out.println("Ok. Would you like to check the log (yes or no)?");
        String logcheck = scn.nextLine();

        if (logcheck.equalsIgnoreCase("yes")) {
            system.showLog();
        } else if (logcheck.equalsIgnoreCase("no")) {
            System.out.println("Goodbye.");
        }

        scn.close();
    }
}
