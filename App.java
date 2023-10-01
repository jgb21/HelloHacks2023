import java.util.Scanner;

public class App {
    private Scanner userInput;
    private String pulseRate;
    private String respiratoryRate;
    private String oxygenSaturation;
    private boolean medicalHelpNeeded;
    private String message;

    // EFFECTS: runs the homework application
    public App() {
        userInput = new Scanner(System.in);
        runApp();
    }

    public void runApp() {
        boolean keepGoing = true;
        String input;

        userInput = new Scanner(System.in);

        while (keepGoing) {
            displayMenu();
            input = userInput.nextLine();
            input = input.toUpperCase();

            if (input.equals("QUIT")) {
                keepGoing = false;
            } else {
                processCommand(input);
            }
        }

        System.out.println("Goodbye!");
    }

    private void processCommand(String input) {
        if (input.equals("ENTER VITALS")) {
            enterVital();
        } else if (input.equals("PRINT REPORT")) {
            printReport();
        } else {
            System.out.println("Selection not valid. Please try again ...");
        }
    }

    private void displayMenu() {
        System.out.println("\nSelect:");
        System.out.println("Enter vitals");
        System.out.println("Print Report");
        System.out.println("Quit");
    }

    private void enterVital() {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Pulse Rate per minute");
        String response = input1.nextLine().toUpperCase();
        pulseRate = response;

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Respiratory Rate per minute");
        response = input2.nextLine().toUpperCase();
        respiratoryRate = response;

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter Oxygen Saturation");
        response = input3.nextLine().toUpperCase();
        oxygenSaturation = response;

        System.out.println("Vitals Recorded");
    }

    private void printReport() {
        medicalHelpNeeded = false;
        message = "Vitals Recorded\n";

        System.out.println("Pulse Rate Result: " + pulseRate);
        int pulse = Integer.parseInt(pulseRate);
        if (pulse > 80) {
            medicalHelpNeeded = true;
            message += "\t Pulse rate is too high. ";
        }

        System.out.println("Respiratory Rate Result: " + respiratoryRate);
        int resp = Integer.parseInt(respiratoryRate);
        if (resp > 25) {
            medicalHelpNeeded = true;
            message += "\t Respiratory rate is too high. ";
        }

        System.out.println("Oxygen Saturation: " + oxygenSaturation);
        int oxsat = Integer.parseInt(oxygenSaturation);
        if (oxsat < 95) {
            medicalHelpNeeded = true;
            message += "\t Oxygen saturation is too low. ";
        }

        if (medicalHelpNeeded) {
            message += "Seek medical attention.";
            System.out.println(message.trim());
        }
    }

    public static void main(String[] args) {
        new App();
    }
}
